package myChatsServerTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private Socket socket;

	public Client() {
		try {
			System.out.println("开启客户端!");
			socket = new Socket("localhost", 8088);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void start() {
//		开启一个线程来输出信息
		Thread thread = new Thread() {
			public void run() {
				OutputStream os;
				try {
					os = socket.getOutputStream();
					OutputStreamWriter osw = new OutputStreamWriter(os);
					BufferedWriter bw = new BufferedWriter(osw);
					PrintWriter pw = new PrintWriter(bw, true);
					Scanner scn = new Scanner(System.in);
					while (true) {
						String input = scn.nextLine();
						if (input.equalsIgnoreCase("exit")) {
							break;
						}
						pw.println(input);
					}
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		thread.start();

//		开启一个线程来接受信息
		Thread thread2 = new Thread() {
			public void run() {
				try {
					InputStream is = socket.getInputStream();
					InputStreamReader isr = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(isr);
					String content = null;
					System.out.println("等待消息中...");
					while (true) {
						while ((content = br.readLine()) != null) {
							System.out.println(content);
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

			};
		};
		thread2.start();
	}

	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}

}
