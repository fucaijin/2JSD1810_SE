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
			System.out.println("����������");
			serverSocket = new ServerSocket(8088);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void start() {
		int i = 1;
		try {
			// ��һ���߳���������ǰ�����ӵĿͻ����б�,����Ѿ��Ͽ�������,��ɾ������ͻ��˶���
			Thread thread2 = new Thread() {
				public void run() {
					while (true) {
						Iterator<Socket> iterator = sockets.iterator();
						while (iterator.hasNext()) {
							Socket next = iterator.next();
							if (next.isClosed()) {
								iterator.remove();
								System.out.println("�û��Ͽ�����,��ɾ��");
							}
						}
					}
				}
			};
			thread2.start();

			while (true) {
				System.out.println("�ȴ��ͻ���");
				// �����ȴ�һ���ͻ���
				Socket accept = serverSocket.accept();
				System.out.println("����һ���ͻ���");
				sendMsg(accept, "�����ӷ�����");
				// ����������:ֻҪ��һ���ͻ���������,���ͬһ��IP�Ѿ����ӹ���,�ͷ���"SB����~",Ȼ��رմ�����

				// �����������ӵĿͻ���,����к͵�ǰIP��ַ��ͬ��,���׳��ظ����ر�.
				boolean isRepeat = false;
				Iterator<Socket> iterator = sockets.iterator();
				while (iterator.hasNext()) {
					Socket next = iterator.next();
					if (next.getInetAddress().getHostAddress().equals(accept.getInetAddress().getHostAddress())) {
						sendMsg(accept, "SB����~");
						isRepeat = true;
						break;
					}
				}
				// �����һ�������ظ��Ŀͻ��˽ӽ���,���ر���,�ͼ�����һ��ѭ���ȴ���һ���ͻ���
				if (isRepeat) {
					accept.close();
					System.out.println("�ر��ظ��û�" + i + "��");
					i++;
					continue;
				}

				sockets.add(accept);
				// ��һ���ͻ��˾��½�һ���߳���������û�������
				Thread thread = new Thread() {
					public void run() {
						try {
							while (true) {
								System.out.println("�ȴ��û�����..");
								InputStream is = accept.getInputStream();
								InputStreamReader isr = new InputStreamReader(is);
								BufferedReader br = new BufferedReader(isr);
								String acceptContent = null;
								while ((acceptContent = br.readLine()) != null) {
									System.out.println(acceptContent);
									// ֻҪ����Ϣ����,�͸��������еĶ���,����ǰ��ȡ������Ϣת���������ͻ���ȥ
									Iterator<Socket> iterator = sockets.iterator();
									int j = 1;
									while (iterator.hasNext()) {
										System.out.println("������Ϣ:"+ j);
										j++;
										Socket next = iterator.next();
//										if (next != accept) {
											OutputStream os = next.getOutputStream();
											OutputStreamWriter osw = new OutputStreamWriter(os);
											BufferedWriter bw = new BufferedWriter(osw);
											PrintWriter pw = new PrintWriter(bw, true);
											pw.println(accept.getInetAddress().getHostName() + "˵:" + acceptContent);
//										}
									}
								}
							}
						} catch (IOException e) {
							e.printStackTrace();
						}

						System.out.println("���� ����");
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
	 * ������Ϣ����
	 * @param Ҫ���͵�socket
	 * @param msg Ҫ���͵���Ϣ
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
