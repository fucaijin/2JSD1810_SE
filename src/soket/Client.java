package soket;

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

/*
 * �����ҿͻ���
 */
public class Client {
	/*
	 * Socket �׽��� ��װ��TCPЭ�����Ӻ�ͨѶ��ϸ�ڣ�ʹ������Զ�˼�����������Ӻ����ͨ����������ʵ���໥�����ݽ���
	 */
	private Socket socket;

	/**
	 * ���췽��,������ʼ���ͻ���
	 */
	public Client() {
		try {
			/*
			 * ʵ����Socket ʵ����ʱ��Ҫ������������: 1.����˼������ַ��Ϣ(��IP��ַ) 2.����˳�������ķ���˿�
			 * 
			 * ͨ��IP��ַ���ǿ����ҵ������ϵķ���˼����; ͨ���˿ڿ������ӵ��û��������еķ����Ӧ�ó���.
			 * 
			 * ʵ�����Ĺ��̾��������˽������ӵĹ���, ��ָ���ķ����IP��ַ��˿���Чʱ,����ʵ����������쳣
			 */

			System.out.println("�������ӷ����...");
			socket = new Socket("176.126.22.111", 8088); // "localhost"������IP
															// 176.126.22.111(�ҵ�)
															// //176.126.22.112(ͬ��)
			System.out.println("�����˽�������");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * �ͻ��˿�ʼ�����ķ���
	 */
	public void start() {

		try {
			/*
			 * �������ڶ�ȡ�������Ϣ���߳�
			 */
			ServerHandler serverHandler = new ServerHandler();
			Thread thread = new Thread(serverHandler);
			thread.start();
			
			/*
			 * ��ϣ�������˷�����Ϣ����ô������Ҫͨ�� Socket��ȡ����� OutputStream getOutputStream();
			 */
			// �����˷�����Ϣ
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

	private class ServerHandler implements Runnable {

		public void run() {
			try {
				InputStream is = socket.getInputStream();
				
//				��ǰ���½����ļ�
//				BufferedInputStream bis = new BufferedInputStream(is);
//				FileOutputStream fos = new FileOutputStream("abc.png");
//				BufferedOutputStream bos = new BufferedOutputStream(fos);
//				byte[] b = new byte[1024];
//				int len = -1;
//				while((len = bis.read(b)) != -1){
//					bos.write(b, 0, len);
//				};
//				System.out.println("�ļ��������");
//				bis.close();
//				bos.close();
				
				
				InputStreamReader isr = new InputStreamReader(is, "utf-8");
				BufferedReader br = new BufferedReader(isr);
				String line = null;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (Exception e) {
			}

		}

	}
}
