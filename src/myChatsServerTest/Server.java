package myChatsServerTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class Server {
	private ServerSocket serverSocket;
	private static ArrayList<Socket> sockets = new ArrayList<Socket>();

	public Server() {
		try {
			System.out.println("开启服务器");
			serverSocket = new ServerSocket(8088);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void start() {
		int i = 1;
		try {
			// 用一个线程来遍历当前的连接的客户端列表,如果已经断开连接了,则删除这个客户端对象
			Thread thread2 = new Thread() {
				public void run() {
					while (true) {
						Iterator<Socket> iterator = sockets.iterator();
						while (iterator.hasNext()) {
							Socket next = iterator.next();
							if (next.isClosed()) {
								iterator.remove();
								System.out.println("用户断开连接,已删除");
							}
						}
					}
				}
			};
			thread2.start();

			while (true) {
				System.out.println("等待客户端");
				// 阻塞等待一个客户端
				Socket accept = serverSocket.accept();
				System.out.println("进来一个客户端");
				sendMsg(accept, "已连接服务器");
				// 防攻击策略:只要有一个客户端连接上,如果同一个IP已经连接过了,就返回"SB别闹~",然后关闭此连接

				// 遍历所有连接的客户端,如果有和当前IP地址相同的,则抛出回复并关闭.
				boolean isRepeat = false;
				Iterator<Socket> iterator = sockets.iterator();
				while (iterator.hasNext()) {
					Socket next = iterator.next();
					if (next.getInetAddress().getHostAddress().equals(accept.getInetAddress().getHostAddress())) {
						sendMsg(accept, "SB别闹~");
						isRepeat = true;
						break;
					}
				}
				// 如果上一步是有重复的客户端接进来,并关闭了,就继续下一个循环等待下一个客户端
				if (isRepeat) {
					accept.close();
					System.out.println("关闭重复用户" + i + "个");
					i++;
					continue;
				}

				sockets.add(accept);
				// 来一个客户端就新建一个线程来处理此用户的输入
				Thread thread = new Thread() {
					public void run() {
						try {
							while (true) {
								System.out.println("等待用户输入..");
								InputStream is = accept.getInputStream();
								InputStreamReader isr = new InputStreamReader(is);
								BufferedReader br = new BufferedReader(isr);
								String acceptContent = null;
								while ((acceptContent = br.readLine()) != null) {
									System.out.println(acceptContent);
									// 只要有消息进来,就给遍历所有的对象,将当前读取到的消息转发到各个客户端去
									Iterator<Socket> iterator = sockets.iterator();
									int j = 1;
									while (iterator.hasNext()) {
										System.out.println("发送消息:"+ j);
										j++;
										Socket next = iterator.next();
//										if (next != accept) {
											OutputStream os = next.getOutputStream();
											OutputStreamWriter osw = new OutputStreamWriter(os);
											BufferedWriter bw = new BufferedWriter(osw);
											PrintWriter pw = new PrintWriter(bw, true);
											pw.println(accept.getInetAddress().getHostName() + "说:" + acceptContent);
//										}
									}
								}
							}
						} catch (IOException e) {
							e.printStackTrace();
						}

						System.out.println("程序 结束");
					};

				};
				thread.start();
			}

		} catch (

		IOException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * 发送消息方法
	 * @param 要发送的socket
	 * @param msg 要发送的消息
	 */
	public void sendMsg(Socket accept, String msg){
		try {
			OutputStream os = accept.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw,true);
			pw.println(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}

}
