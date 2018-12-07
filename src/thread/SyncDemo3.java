package thread;

/**
 * 静态方法上若使用synchronized修饰后, 那么该方法一定具有同步效果
 * 
 * 静态方法的同步监视器对象为当前类的类对象(Class类的实例)
 * java中每个被JVM加载的类都有且只有唯一的一个Class实例与之对应,
 * 后面反射课程中会介绍Class类
 */
public class SyncDemo3 {

	public static void main(String[] args) {
		Boo boo1 = new Boo();
		Boo boo2 = new Boo();
		Thread t1 = new Thread(){
			public void run() {
				boo1.dosome();
			};
		};

		Thread t2 = new Thread(){
			public void run() {
				boo2.dosome();
			};
		};
		
		t1.start();
		t2.start();
	}

}

class Boo {
	public synchronized static void dosome() {
		try {
			Thread thread = Thread.currentThread();
			String name = thread.getName();
			System.out.println(name +  "正在执行dosom方法");
			Thread.sleep(3000);
			System.out.println(name +  "执行dosom方法结束");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
