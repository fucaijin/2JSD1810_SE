package soket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �����ҷ����
 */
public class Server {

	/*
	 * java.net.ServerSocket �����ڷ���˵�ServerSocket��Ҫ����������
	 * 1.��ϵͳ�������˿�,�ͻ��˾���ͨ������˿������˽������ӵ� 2.��������˿�,һ���ͻ���ͨ���ö˿ڽ�������,
	 * �����ϻ�ʵ����һ��Socket��֮��Ӧ.����˾Ϳ���ͨ�����Socket��ͻ��˽��н�����
	 * 
	 * �����Socket����Ϊ�绰,��ôServerSocket��������Ϊ�ܻ�
	 */
	private ServerSocket server;

	public Server() {
		try {
			/*
			 * ʵ����ServerSocket��ͬʱҪָ������˿�. ���ö˿��Ѿ���ϵͳ����������ʹ��ʱ,���׳���ַ��ռ�õ��쳣
			 */
			System.out.println("�������������...");
			server = new ServerSocket(8088);
			System.out.println("������������");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void start() {
		try {
			/*
			 * ServerSocket�ṩ�ķ���: Socket accept()
			 * �÷�����һ����������,ִ�к����˿�ʼ��������˿�,ֱ��һ���ͻ�������Ϊֹ,
			 * ��ʱ�÷����᷵��һ��Socketʵ��,ͨ����ʵ��������ͻ��˽���ͨѶ��. ÿ�ε��ø÷������ᵼ�·��������,�ȴ�һ���ͻ��˵�����
			 */
			System.out.println("�ȴ��ͻ�������...");
			int acceptNum = 0;
			while (true) {
				Socket accept = server.accept(); // ��������
				InetAddress address = accept.getInetAddress();
				String host = address.getHostAddress();
				System.out.println(host + "������,Ŀǰ��" + (++acceptNum) + "���ͻ�������");

				/*
				 * ͨ��Socket��ȡ�����������ͻ��˷��͹�������Ϣ InputStream getInputStream()
				 */

				// ���ܿͻ�����Ϣ
				InputStream is = accept.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, "utf-8");
				BufferedReader br = new BufferedReader(isr);
				String readLine = null;
				/*
				 * br.readLine()��ȡ�ͻ��˷��͹�����һ���ַ��������е��ͻ��˶Ͽ�����ʱ�� �ͻ���ϵͳ��ͬ������ı���Ҳ��ȫ��һ��
				 * ͨ��windows�Ŀͻ��˶Ͽ�ʱ��readLine������ֱ���׳��쳣��
				 * linux�Ŀͻ��˶Ͽ�����ʱ��readLine�����ķ���ֵͨ��Ϊnull
				 */
				while ((readLine = br.readLine()) != null) {
					System.out.println("�ͻ���˵:" + readLine);
				}

				is.close();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}

}
