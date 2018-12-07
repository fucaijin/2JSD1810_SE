package thread;

/**
 * ��̬��������ʹ��synchronized���κ�, ��ô�÷���һ������ͬ��Ч��
 * 
 * ��̬������ͬ������������Ϊ��ǰ��������(Class���ʵ��)
 * java��ÿ����JVM���ص��඼����ֻ��Ψһ��һ��Classʵ����֮��Ӧ,
 * ���淴��γ��л����Class��
 */
public class SyncDemo3 {

	public static void main(String[] args) {
		Boo boo1 = new Boo();
		Boo boo2 = new Boo();
		Thread t1 = new Thread(){
			public void run() {
				boo1.dosome();
			};
		};

		Thread t2 = new Thread(){
			public void run() {
				boo2.dosome();
			};
		};
		
		t1.start();
		t2.start();
	}

}

class Boo {
	public synchronized static void dosome() {
		try {
			Thread thread = Thread.currentThread();
			String name = thread.getName();
			System.out.println(name +  "����ִ��dosom����");
			Thread.sleep(3000);
			System.out.println(name +  "ִ��dosom��������");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
