package thread;

/**
 * �̵߳����ȼ�
 * �߳�����������뵽���̵߳�����ͳһ����
 * �߳��޷�������ȡCPUʱ��Ƭ,��ʱ��ȡ��ȫ���̵߳���ͳһ����
 * �����̵߳����ȼ��������̶ȸ��ƻ�ȡCPUʱ��Ƭ�ļ���.
 *
 */
public class PriorityDemo {

	public static void main(String[] args) {
		Thread max = new Thread(){
			public void run(){
				for (int i = 0; i < 10000; i++) {
					System.out.println("max");
				}
			}
		};
		
		Thread min = new Thread(){
			public void run(){
				for (int i = 0; i < 10000; i++) {
					System.out.println("min");
				}
			}
		};
		
		Thread nor = new Thread(){
			public void run(){
				for (int i = 0; i < 10000; i++) {
					System.out.println("nor");
				}
			}
		};
		
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		nor.setPriority(Thread.NORM_PRIORITY);
		
		max.start();
		min.start();
		nor.start();
		
		
		
		
		
		
	}

}
