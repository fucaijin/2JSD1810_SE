package thread;

/**
 * 同步块: synchronized (this) {
 *    在此处编写需要同步运行的代码片段
 * }
 * 
 * 同步块可以更精准的控制需要同步运行的代码片段, 有效缩小同步范围可以再保证并发安全的前提下提高并发的效率
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
	 * 在方法上使用synchronized,那么同步监视器对象为当前方法所属的对象:this
	 */
	public void buy() {
		try {
			
			Thread t = Thread.currentThread();
			String name = t.getName();
			
			System.out.println(name + ":正在挑衣服...");
			Thread.sleep(3000);
			
			/*
			 * 同步块需要指定同步监视器对象,即:"()"中的内容,该对象可以是java中任何类型的实例,
			 * 但是必须保证多个线程可以看到的该对象是"同一个",否则该同步块达不到同步效果
			 */
			synchronized (this) {
				System.out.println(name + ":正在试穿衣服...");
				Thread.sleep(3000);
			}
			
			System.out.println(name + ":结账离开!");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}