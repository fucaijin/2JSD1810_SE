package thread;

/**
 * 互斥锁
 * 但使用synchronized锁定多个代码片段,并且这些同步块使用的同步监视器对象(上锁的对象)为同一个时,
 * 那么这些代码片段就是互斥的,多个线程不能同时执行他们
 * 
 * 此例子中,即使两个线程调用的不是同一个方法,但是已经产生了互斥锁.
 * 因为Foo类中的A方法和B方法都有synchronized,thread1和thread2调用同一个对象时候,
 * 只要Foo的A方法/或B方法被调用了,另一个线程就不能调用此对象的有锁头方法
 * 即一个类中有多个有锁代码块时.只要有线程运行到了有锁代码块,别的地方就不能执行此类中所有的有锁代码块
 */
public class SyncDemo4 {

	public static void main(String[] args) {
		Foo foo  = new Foo();
		Thread thread1 = new Thread(){
			public void run() {
				foo.methodA();
			};
		};
		
		Thread thread2 = new Thread(){
			public void run() {
				foo.methodB();
			};
		};
		
		thread1.start();
		thread2.start();
	}

}

class Foo{
	public synchronized void methodA(){
		try {
			Thread currentThread = Thread.currentThread();
			String name = currentThread.getName();
			System.out.println(name + ":正在运行A方法");
			Thread.sleep(3000);
			System.out.println(name + ":运行A方法完成");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB(){
		try {
			Thread currentThread = Thread.currentThread();
			String name = currentThread.getName();
			System.out.println(name + ":正在运行B方法");
			Thread.sleep(3000);
			System.out.println(name + ":运行B方法完成");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
