package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳� �̳߳���Ҫ�����������: 1.�����߳� 2.�����߳�����
 * 
 * Ƶ�������������̻߳��ϵͳ��������Ҫ�Ŀ���,�����߳̾���ȥ�ظ�ʹ��.
 * ��ϵͳ�в������е��߳���������ʱ,�ᵽ��CPU�����л�,����ÿ���߳����м����½�,�������岢�������½�.
 * �����߳���������ռ�õ���ԴҲ�����.�������Ҫ�����̵߳�����
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
						System.out.println(curThread + ":����ִ������");
						Thread.sleep(5000);
						System.out.println(curThread + ":ִ���������");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			System.out.println("������һ���߳�");
			// ָ��һ��������̳߳�
			threadPool.execute(runn);
		}// ѭ������
//		threadPool.shutdown();
		threadPool.shutdownNow();
		System.out.println("�̳߳عر���!");
	}

}
