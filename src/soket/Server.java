package soket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

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
	
	/*
	 * ���ڱ������пͻ��������������,ΪClientHandler֮�乲����Զ�Ӧ�ͻ��˵������,�Ӷ������㲥��Ϣ.
	 */
	private PrintWriter[] allOut = {};

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
			int acceptNum = 0;
			while (true) {
				System.out.println("�ȴ��ͻ�������...");
				Socket accept = server.accept(); // ��������
				System.out.println("Ŀǰ��" + (++acceptNum) + "���ͻ�������");
//				����һ���߳�������ÿͻ��˵Ľ�������
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
//		��ǰ�߳�ͨ�����Socket���Ӧ�ͻ��˽���
		private Socket socket;
//		�ͻ��˵�ַ��Ϣ
		private String host;
		public ClientHandler(Socket accept) {
			this.socket = accept;
			
//			ͨ��socket��ȡԶ��(�ͻ���)��ַ��Ϣ
			InetAddress address = accept.getInetAddress();
			host = address.getHostAddress();
			System.out.println(host + "������");
		}

		public void run(){
			PrintWriter pw = null;
			try {
				/*
				 * ͨ��Socket��ȡ�����������ͻ��˷��͹�������Ϣ InputStream getInputStream()
				 */
				// ���ܿͻ�����Ϣ
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, "utf-8");
				BufferedReader br = new BufferedReader(isr);
				
				/*
				 * ͨ��socket��ȡ�����,���ڸ��ͻ��˷���Ϣ
				 */
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter ow = new OutputStreamWriter(out, "utf-8");
				BufferedWriter bw = new BufferedWriter(ow);
				pw = new PrintWriter(bw, true);
				
				synchronized(allOut){
					// ���ÿͻ��˶�Ӧ����������뵽����������
					// 1.��allOut����
					allOut = Arrays.copyOf(allOut, allOut.length+1);
					// 2.������������뵽�������һ��λ��
					allOut[allOut.length-1] = pw;
				}
				
				System.out.println("��ǰ��������:" + allOut.length);
				
				/*
				 * br.readLine()��ȡ�ͻ��˷��͹�����һ���ַ��������е��ͻ��˶Ͽ�����ʱ�� �ͻ���ϵͳ��ͬ������ı���Ҳ��ȫ��һ��
				 * ͨ��windows�Ŀͻ��˶Ͽ�ʱ��readLine������ֱ���׳��쳣��
				 * linux�Ŀͻ��˶Ͽ�����ʱ��readLine�����ķ���ֵͨ��Ϊnull
				 */
				String msg = null;
				while ((msg = br.readLine()) != null) {
//					����Ϣת������ǰ�����пͻ���
					synchronized(allOut){
						for (int i = 0; i < allOut.length; i++) {
							allOut[i].println(host + "˵:" + msg);
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
//				����ǰ�ͻ��˶Ͽ����Ӻ�Ĳ���
//				1.����ǰ�ͻ��˵��������allOut��ɾ��
				synchronized(allOut){
					for (int i = 0; i < allOut.length; i++) {
						if (allOut[i] == pw) {
							allOut[i] = allOut[allOut.length-1];
							allOut = Arrays.copyOf(allOut, allOut.length-1);
							break;
						}
					}
				}
				
				System.out.println(host + "������");
				System.out.println("��ǰ��������:" + allOut.length);
				
//				�ر�Socket��,�ͻὫSocket.get���������/�������Զ��ر�
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
