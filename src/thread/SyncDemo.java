package thread;

/**
 * 多线程并发安全问题
 * 但多线程并发访问同一临界资源时,由于线程切换的不确定性,
 * 导致操作顺序出现了混乱,未按照程序预想的流程执行而导致一系列问题.严重时可能导致系统瘫痪
 *
 */
public class SyncDemo {

	public static void main(String[] args) {
		Table table = new Table();
		Thread thread1 = new Thread(){
			public void run() {
				while (true) {
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName() + ":" + bean);
				}
			}
		};
		
		Thread thread2 = new Thread(){
			public void run() {
				while (true) {
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName() + ":" + bean);
				}
			}
		};
		
		thread1.start();
		thread2.start();
		
	}
	
}

class Table{
//	桌子上有20个豆子
	private int beans = 20;
	
	/**
	 * 当一个方法使用synchronized修饰后,该方法称为"同步方法"
	 * 即:多个线程不能同时进入方法内部执行.
	 * 这样保证了多个线程执行该方法时,由异步执行强制变为了同步执行(各干各的变为排队进行),从而解决了多个线程"抢"的问题
	 */
	public synchronized int getBean(){
		if (beans == 0 ) {
			throw new RuntimeException("没有豆子了!");
		}
		Thread.yield();//让当前线程主动让出时间片,模拟线程切换
		return beans--;
	}
}
