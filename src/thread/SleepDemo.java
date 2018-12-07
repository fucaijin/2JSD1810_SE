package thread;

import java.util.Scanner;

/**
 * Sleep����
 * static void sleep(long ms)
 * �÷�����������������������߳̽�������״ָ̬����ʱ��(����).
 * ��ʱ���̻߳��Զ��ص�RUNNABLE״̬�ȴ��ٴλ�ȡʱ��Ƭ��������.
 */
public class SleepDemo {

	public static void main(String[] args) {
		System.out.println("������һ������,��ʼ����ʱ:");
		Scanner scn = new Scanner(System.in);
		String nextLine = scn.nextLine();
		int a = Integer.parseInt(nextLine);
		
//		��ʽһ:
		while(a>=0){
			System.out.println(a);
			a--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
//		��ʽ��:
		for (int i = a; i >= 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("����ִ�н���");
		scn.close();
	}

}
