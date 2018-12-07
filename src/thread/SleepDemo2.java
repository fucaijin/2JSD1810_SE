package thread;

/**
 * sleep方法要求处理中断异常InterruptedException
 * 线程有一个方法:interrupt(),该方法是用来中断线程的.
 * 当一个线程调用sleep方法处于阻塞状态的过程中,其中断方法若被调用,则这时sleep
 * 方法会立即抛出中断异常,提示我们该线程的阻塞状态被中断.
 *
 */
public class SleepDemo2 {

	public static void main(String[] args) {
		/*
		 * JDK8之前,有一个要求:
		 * 当一个方法中的局部内部类中若应用了这个方法的其他局部变量,那么该变量必须是final的 
		 */
		Thread lin = new Thread(){
			public void run() {
				System.out.println("林:刚美完容,睡一会儿吧!");
				try {
					Thread.sleep(100000);
				} catch (InterruptedException e) {
					System.out.println("林:干嘛呢!干嘛呢!干嘛呢!都破了相了!!");
				}
				System.out.println("林:睡醒了");
			}
		};
		
		Thread huang = new Thread(){
			public void run() {
				System.out.println("黄:开始砸钱!");
				for (int i = 0; i < 6; i++) {
					System.out.println("80!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("咣当!");
				System.out.println("黄:搞定!");
//				lin.interrupt();//中断lin线程睡眠阻塞,Thread.sleep(100000);会抛出线程阻断异常
			};
		};
		
		lin.start();
		huang.start();
	}

}
