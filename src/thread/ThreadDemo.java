package thread;

/**
 * ���߳�
 * ���߳���������"ͬʱ"ִ�ж�δ���.
 * ʵ���϶��߳��ǲ������е�,ÿ�δ��붼������ͣͣ��.CPU������Щ�̼߳�����л�,��֤ÿ�δ��붼�н���.
 * �Ӷ��й��� ��ͬʱ���е�Ч��.
 * 
 * �̵߳Ĵ�����ʽ������ģʽ:
 * 1.����һ���߳��ಢ�̳��߳�Thread,Ȼ����д��run����.run������������Ҫִ�е��������.
 * 2.ʵ��Runnable�ӿڵ��������߳�����
 */
public class ThreadDemo {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		t1.start();

		Thread t2 = new MyThread2();
		t2.start();
	}
}

/**
 * ��һ�ִ����̵߳ķ�ʽ����������:
 * 1.����java�ǵ��̳е�,�⵼�����̳���Thread���޷��ټ̳�������,��ᵼ���޷��̳������������ô���,ʵ�ʿ���������
 * 2.�����������߳��ڲ�ֱ����дrun�����������߳�Ҫִ�е�����,�⵼�¸��߳�ֻ��ִ�и�����,ʹ���߳����������һ����Ȼ����Ϲ�ϵ,�����Ա�úܲ�
 */
class MyThread1 extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("����˭��?");
		}
	}
}

class MyThread2 extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("���ǲ�ˮ���!");
		}
	}
}