package thread;

/**
 * sleep����Ҫ�����ж��쳣InterruptedException
 * �߳���һ������:interrupt(),�÷����������ж��̵߳�.
 * ��һ���̵߳���sleep������������״̬�Ĺ�����,���жϷ�����������,����ʱsleep
 * �����������׳��ж��쳣,��ʾ���Ǹ��̵߳�����״̬���ж�.
 *
 */
public class SleepDemo2 {

	public static void main(String[] args) {
		/*
		 * JDK8֮ǰ,��һ��Ҫ��:
		 * ��һ�������еľֲ��ڲ�������Ӧ������������������ֲ�����,��ô�ñ���������final�� 
		 */
		Thread lin = new Thread(){
			public void run() {
				System.out.println("��:��������,˯һ�����!");
				try {
					Thread.sleep(100000);
				} catch (InterruptedException e) {
					System.out.println("��:������!������!������!����������!!");
				}
				System.out.println("��:˯����");
			}
		};
		
		Thread huang = new Thread(){
			public void run() {
				System.out.println("��:��ʼ��Ǯ!");
				for (int i = 0; i < 6; i++) {
					System.out.println("80!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("�۵�!");
				System.out.println("��:�㶨!");
//				lin.interrupt();//�ж�lin�߳�˯������,Thread.sleep(100000);���׳��߳�����쳣
			};
		};
		
		lin.start();
		huang.start();
	}

}
