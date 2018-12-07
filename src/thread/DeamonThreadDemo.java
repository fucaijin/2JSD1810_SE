package thread;

/**
 * 守护线程
 * 守护线程使用上与普通线程没什么区别,但是在结束时机上有一点不同:线程的退出
 * 当一个进程退出时,所有的守护线程会被强制终止
 * 进程的退出:当一个进程中所有普通线程结束时,进程退出.
 * 守护线程需要单独进行设置,因为默认创建出来的线程都是普通线程
 */
public class DeamonThreadDemo {

	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Rose:Let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Rose:aaaaaaaaaaa~~~~~~~~~~");
				System.out.println("噗通~~~~~");
			}
		};
		
		Thread jack = new Thread(){
			public void run() {
				while (true) {
					System.out.println("Jack:You jump, I jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		rose.start();
		jack.setDaemon(true);
		jack.start();
	}

}
