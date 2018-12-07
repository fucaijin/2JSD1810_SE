package soket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 聊天室服务端
 */
public class Server {

	/*
	 * java.net.ServerSocket 运行在服务端的ServerSocket主要有两个作用
	 * 1.向系统申请服务端口,客户端就是通过这个端口与服务端建立连接的 2.监听服务端口,一旦客户端通过该端口建立连接,
	 * 则马上会实例化一个Socket与之对应.服务端就可以通过这个Socket与客户端进行交互了
	 * 
	 * 如果把Socket比喻为电话,那么ServerSocket可以想象为总机
	 */
	private ServerSocket server;

	public Server() {
		try {
			/*
			 * 实例化ServerSocket的同时要指定服务端口. 当该端口已经被系统其它程序所使用时,会抛出地址被占用的异常
			 */
			System.out.println("正在启动服务端...");
			server = new ServerSocket(8088);
			System.out.println("服务端启动完毕");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void start() {
		try {
			/*
			 * ServerSocket提供的方法: Socket accept()
			 * 该方法是一个阻塞方法,执行后服务端开始监听服务端口,直到一个客户端连接为止,
			 * 这时该方法会返回一个Socket实例,通过该实例即可与客户端进行通讯了. 每次调用该方法都会导致服务端阻塞,等待一个客户端的连接
			 */
			int acceptNum = 0;
			while (true) {
				System.out.println("等待客户端连接...");
				Socket accept = server.accept(); // 阻塞方法
				System.out.println("目前共" + (++acceptNum) + "个客户端连接");
//				启动一个线程来处理该客户端的交互工作
				ClientHandler clientHandler = new ClientHandler(accept);
				Thread thread = new Thread(clientHandler);
				thread.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}

	private class ClientHandler implements Runnable{
//		当前线程通过这个Socket与对应客户端交互
		private Socket accept;
//		客户端地址信息
		private String host;
		public ClientHandler(Socket accept) {
			this.accept = accept;
			
//			通过socket获取远端(客户端)地址信息
			InetAddress address = accept.getInetAddress();
			host = address.getHostAddress();
			System.out.println(host + "连接了");
		}

		public void run(){
			try {
				
				/*
				 * 通过Socket获取输入流，读客户端发送过来的消息 InputStream getInputStream()
				 */
				// 接受客户端消息
				InputStream is = accept.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, "utf-8");
				BufferedReader br = new BufferedReader(isr);
				String msg = null;
				/*
				 * br.readLine()读取客户端发送过来的一行字符串操作中档客户端断开连接时， 客户端系统不同，这里的表现也完全不一样
				 * 通常windows的客户端断开时，readLine方法会直接抛出异常：
				 * linux的客户端断开连接时，readLine方法的返回值通常为null
				 */
				while ((msg = br.readLine()) != null) {
					System.out.println(host + "说:" + msg);
				}
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
