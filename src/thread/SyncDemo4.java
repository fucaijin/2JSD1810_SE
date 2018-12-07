package thread;

/**
 * ������
 * ��ʹ��synchronized�����������Ƭ��,������Щͬ����ʹ�õ�ͬ������������(�����Ķ���)Ϊͬһ��ʱ,
 * ��ô��Щ����Ƭ�ξ��ǻ����,����̲߳���ͬʱִ������
 * 
 * ��������,��ʹ�����̵߳��õĲ���ͬһ������,�����Ѿ������˻�����.
 * ��ΪFoo���е�A������B��������synchronized,thread1��thread2����ͬһ������ʱ��,
 * ֻҪFoo��A����/��B������������,��һ���߳̾Ͳ��ܵ��ô˶��������ͷ����
 * ��һ�������ж�����������ʱ.ֻҪ���߳����е������������,��ĵط��Ͳ���ִ�д��������е����������
 */
public class SyncDemo4 {

	public static void main(String[] args) {
		Foo foo  = new Foo();
		Thread thread1 = new Thread(){
			public void run() {
				foo.methodA();
			};
		};
		
		Thread thread2 = new Thread(){
			public void run() {
				foo.methodB();
			};
		};
		
		thread1.start();
		thread2.start();
	}

}

class Foo{
	public synchronized void methodA(){
		try {
			Thread currentThread = Thread.currentThread();
			String name = currentThread.getName();
			System.out.println(name + ":��������A����");
			Thread.sleep(3000);
			System.out.println(name + ":����A�������");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB(){
		try {
			Thread currentThread = Thread.currentThread();
			String name = currentThread.getName();
			System.out.println(name + ":��������B����");
			Thread.sleep(3000);
			System.out.println(name + ":����B�������");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
