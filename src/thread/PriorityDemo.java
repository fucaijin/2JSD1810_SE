package thread;

/**
 * 线程的优先级
 * 线程启动后便纳入到了线程调度中统一管理
 * 线程无法主动获取CPU时间片,何时获取完全听线程调度统一管理
 * 调节线程的优先级可以最大程度改善获取CPU时间片的几率.
 *
 */
public class PriorityDemo {

	public static void main(String[] args) {
		Thread max = new Thread(){
			public void run(){
				for (int i = 0; i < 10000; i++) {
					System.out.println("max");
				}
			}
		};
		
		Thread min = new Thread(){
			public void run(){
				for (int i = 0; i < 10000; i++) {
					System.out.println("min");
				}
			}
		};
		
		Thread nor = new Thread(){
			public void run(){
				for (int i = 0; i < 10000; i++) {
					System.out.println("nor");
				}
			}
		};
		
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		nor.setPriority(Thread.NORM_PRIORITY);
		
		max.start();
		min.start();
		nor.start();
		
		
		
		
		
		
	}

}
