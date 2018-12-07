package thread;

/**
 * �߳��ṩ��һ����̬����:
 * static Thread currentThread()
 * �÷������Ի�ȡ��������������߳�
 */
public class CurrentThreadDemo {

	public static void main(String[] args) {
//		��ȡ����main�������߳�
		Thread main = Thread.currentThread();
		System.out.println("����main�������߳���:" + main);
		dosome();
		
//		�Զ����߳�
		Thread thread = new Thread(){
			public void run() {
				Thread t = Thread.currentThread();
				System.out.println("�Զ����߳�:" + t);
				dosome();
			}
		};
		thread.start();
	}

	public static void dosome() {
		Thread t = Thread.currentThread();
		System.out.println("����dosome�������߳���:" + t);
	}
	
	
}
