package soket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/*
 * 聊天室客户端
 */
public class Client {
	/*
	 * Socket 套接字 封装了TCP协议连接和通讯的细节，使用它与远端计算机建立连接后可以通过两条流来实现相互的数据交互
	 */
	private Socket socket;

	/**
	 * 构造方法,用来初始化客户端
	 */
	public Client() {
		try {
			/*
			 * 实例化Socket 实例化时需要传入两个参数: 1.服务端计算机地址信息(即IP地址) 2.服务端程序申请的服务端口
			 * 
			 * 通过IP地址我们可以找到网络上的服务端计算机; 通过端口可以连接到该机器上运行的服务端应用程序.
			 * 
			 * 实例化的过程就是与服务端建立连接的过程, 若指定的服务端IP地址与端口无效时,这里实例化会出现异常
			 */

			System.out.println("正在连接服务端...");
			socket = new Socket("176.126.22.112", 8088); // "localhost"代表本机IP
															// 176.126.22.111(我的)  //176.126.22.112(同桌)
			System.out.println("与服务端建立连接");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 客户端开始工作的方法
	 */
	public void start() {

		try {

			/*
			 * 若希望向服务端发送消息，那么我们需要通过 Socket获取输出流 OutputStream getOutputStream();
			 */
			// 向服务端发送消息
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			BufferedWriter bos = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bos, true);
			Scanner scn = new Scanner(System.in);
			while (true) {
				String input = scn.nextLine();
				pw.println(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
}
