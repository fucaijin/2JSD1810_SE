package thread;

/*
 * 获取线程信息的相关方法
 */
public class InfoDemo {

	public static void main(String[] args) {
//		获取主线程
		Thread main = Thread.currentThread();
//		id唯一标示
		long id = main.getId();
		System.out.println("id:" + id);
		
//		线程名字
		String name = main.getName();
		System.out.println("name:" + name);
		
//		线程优先级
		int priority = main.getPriority();
		System.out.println("priority:" + priority);
		
//		是否处于活动状态
		boolean isAlive = main.isAlive();
		System.out.println("isAlive:" + isAlive);
		
		
//		是否为守护线程
		boolean isDaemon = main.isDaemon();
		System.out.println("isDaemon:" + isDaemon);
		
//		是否被中断了
		boolean isInterrupted = main.isInterrupted();
		System.out.println("isInterrupted:" + isInterrupted);
	}

}
