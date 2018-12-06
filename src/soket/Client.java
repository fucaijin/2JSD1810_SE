package soket;

import java.io.BufferedWriter;
import java.io.IOException;
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
			socket = new Socket("176.126.22.112", 8088); // "localhost"������IP
															// 176.126.22.111(�ҵ�)  //176.126.22.112(ͬ��)
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
}
