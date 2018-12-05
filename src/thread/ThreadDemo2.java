package thread;

/**
 * �ڶ��ִ����̵߳ķ�ʽ: ʵ��Runnable�ӿڵ��������߳�����
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		// ����ʵ��������
		Runnable mr1 = new MyRunnable1();
		Runnable mr2 = new MyRunnable2();

		// �����߳�
		Thread t1 = new Thread(mr1);
		Thread t2 = new Thread(mr2);

		t1.start();
		t2.start();
	}
}

class MyRunnable1 implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("����˭��?");
		}
	}
}

class MyRunnable2 implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("���ǲ�ˮ���!");
		}
	}
}