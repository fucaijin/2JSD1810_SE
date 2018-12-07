package thread;

/**
 * ͬ����: synchronized (this) {
 *    �ڴ˴���д��Ҫͬ�����еĴ���Ƭ��
 * }
 * 
 * ͬ������Ը���׼�Ŀ�����Ҫͬ�����еĴ���Ƭ��, ��Ч��Сͬ����Χ�����ٱ�֤������ȫ��ǰ������߲�����Ч��
 */
public class SyncDemo2 {

	public static void main(String[] args) {
		Shop shop = new Shop();
		
		Thread t1 = new Thread() {
			public void run() {
				shop.buy();
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				shop.buy();
			}
		};

		t1.start();
		t2.start();
	}

}

class Shop {
	
	/*
	 * �ڷ�����ʹ��synchronized,��ôͬ������������Ϊ��ǰ���������Ķ���:this
	 */
	public void buy() {
		try {
			
			Thread t = Thread.currentThread();
			String name = t.getName();
			
			System.out.println(name + ":�������·�...");
			Thread.sleep(3000);
			
			/*
			 * ͬ������Ҫָ��ͬ������������,��:"()"�е�����,�ö��������java���κ����͵�ʵ��,
			 * ���Ǳ��뱣֤����߳̿��Կ����ĸö�����"ͬһ��",�����ͬ����ﲻ��ͬ��Ч��
			 */
			synchronized (this) {
				System.out.println(name + ":�����Դ��·�...");
				Thread.sleep(3000);
			}
			
			System.out.println(name + ":�����뿪!");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}