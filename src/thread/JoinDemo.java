package thread;

/**
 * 线程提供了一个join方法,可以协调线程之间的同步运行
 * 
 * 同步运行:运行有先后顺序
 * 异步运行:运行代码是各干各的(多线程就是异步运行的)
 *
 */
public class JoinDemo {
	// 表示图片是否下载完毕
	public static boolean isFinish = false;

	public static void main(String[] args) {
		Thread downLoad = new Thread() {
			public void run() {
				System.out.println("Down:开始下载图片...");
				for (int i = 0; i <= 100; i++) {
					System.out.println("down:已下载:" + i + "%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Down:图片下载完毕");
				isFinish = true;
			}
		};
		
		Thread show = new Thread(){
			public void run() {
				System.out.println("show:开始显示图片");
//				先等待下载线程将图片下载完毕
				try {
					/*
					 * 当show线程调用download线程的方法join方法后就进入了阻塞状态,
					 * 直到download执行完毕才会接触阻塞.
					 */
					downLoad.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if (!isFinish) {
					throw new RuntimeException("图片加载失败");
				}
				
				System.out.println("show:显示图片完毕");
			};
		};
		
		downLoad.start();
		show.start();
	}

}
