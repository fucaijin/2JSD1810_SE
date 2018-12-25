package lambda;

/**
 * lambda���ʽ,JDK8֮���Ƴ�������
 * lambda�����ø������﷨���������ڲ���.
 * �﷨:
 * ([ʵ���б�]) -> {
 * 	   ������
 * }
 * 
 * ʹ��lambda���ʽ���������ڲ���ʱ,Ҫ��ʵ�ֵĽӿڱ���ֻ����һ������,���򲻿���ʹ��
 */
public class LambdaDemo1 {

	public static void main(String[] args) {
		Runnable r1 = new Runnable(){
			@Override
			public void run() {
				System.out.println("hello world!");
			}
		};
		new Thread(r1).start();
		
		Runnable r2 = ()->{System.out.println("hello world2");};
		new Thread(r2).start();
		
//		���������ֻ��һ����룬��ô"{}"����ʡ�Բ�д
		Runnable r3 = ()->System.out.println("hello world3");
		new Thread(r3).start();
		
		new Thread(()->{System.out.println("hello world4");}).start();
	}

}
