package thread;

/**
 * 使用匿名内部类的方式完成两种线程的创建
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
//		方式一(直接重写Thread的run方法):
		Thread t1 = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("你是谁啊?");
				}
			};
		};
		
		Thread t2 = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("我是查水表的!");
				}
			}
		};
		
		t1.start();
		t2.start();
		
//		export EDITOR=vi
//		apt edit-sources
//		deb [arch=all,arm] http://mirrors.tuna.tsinghua.edu.cn/termux stable main
//		deb https://termux.net stable main
		
		
		
		
		
		
//		方式二(使用Runnable):
		Runnable r1 = new Runnable(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("你是谁啊?");
				}
			}
		};
		
		Runnable r2 = new Runnable(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("我是查水表的!");
				}
			}
		};
		
		Thread t3 = new Thread(r1);
		Thread t4 = new Thread(r2);
		
		t3.start();
		t4.start();
	}
}
