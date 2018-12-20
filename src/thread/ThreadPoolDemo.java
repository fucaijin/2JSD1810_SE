package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池 线程池主要解决两个问题: 1.重用线程 2.控制线程数量
 * 
 * 频繁创建和销毁线程会给系统带来不必要的开销,所以线程尽量去重复使用.
 * 当系统中并发运行的线程数量过多时,会到会CPU过度切换,导致每个线程运行几率下降,导致整体并发性能下降.
 * 并且线程数量过多占用的资源也会更多.因此我们要控制线程的数量
 *
 */
public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 5; i++) {
			Runnable runn = new Runnable() {
				public void run() {
					try {
						Thread curThread = Thread.currentThread();
						System.out.println(curThread + ":正在执行任务");
						Thread.sleep(5000);
						System.out.println(curThread + ":执行任务完毕");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			System.out.println("创建了一个线程");
			// 指派一个任务给线程池
			threadPool.execute(runn);
		}// 循环结束
//		threadPool.shutdown();
		threadPool.shutdownNow();
		System.out.println("线程池关闭了!");
	}

}
