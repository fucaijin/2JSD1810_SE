package thread;

/**
 * 多线程
 * 多线程允许我们"同时"执行多段代码.
 * 实际上多线程是并发运行的,每段代码都是走走停停的.CPU会在这些线程间快速切换,保证每段代码都有进度.
 * 从而感官上 是同时运行的效果.
 * 
 * 线程的创建方式有两种模式:
 * 1.定义一个线程类并继承线程Thread,然后重写其run方法.run方法用来定义要执行的任务代码.
 * 2.实现Runnable接口单独定义线程任务
 */
public class ThreadDemo {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		t1.start();

		Thread t2 = new MyThread2();
		t2.start();
	}
}

/**
 * 第一种创建线程的方式有两个不足:
 * 1.由于java是单继承的,这导致若继承了Thread则无法再继承其他类,这会导致无法继承其他类来复用代码,实际开发不方便
 * 2.由于我们在线程内部直接重写run方法定义了线程要执行的任务,这导致该线程只能执行该任务,使得线程与任务存在一个必然的耦合关系,复用性变得很差
 */
class MyThread1 extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("你是谁啊?");
		}
	}
}

class MyThread2 extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("我是查水表的!");
		}
	}
}