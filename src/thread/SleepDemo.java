package thread;

import java.util.Scanner;

/**
 * Sleep阻塞
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程进入阻塞状态指定的时长(毫秒).
 * 超时后线程会自动回到RUNNABLE状态等待再次获取时间片并发运行.
 */
public class SleepDemo {

	public static void main(String[] args) {
		System.out.println("请输入一个数字,开始倒计时:");
		Scanner scn = new Scanner(System.in);
		String nextLine = scn.nextLine();
		int a = Integer.parseInt(nextLine);
		
//		方式一:
		while(a>=0){
			System.out.println(a);
			a--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
//		方式二:
		for (int i = a; i >= 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("程序执行结束");
		scn.close();
	}

}
