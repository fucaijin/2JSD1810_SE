package thread;

/*
 * ��ȡ�߳���Ϣ����ط���
 */
public class InfoDemo {

	public static void main(String[] args) {
//		��ȡ���߳�
		Thread main = Thread.currentThread();
//		idΨһ��ʾ
		long id = main.getId();
		System.out.println("id:" + id);
		
//		�߳�����
		String name = main.getName();
		System.out.println("name:" + name);
		
//		�߳����ȼ�
		int priority = main.getPriority();
		System.out.println("priority:" + priority);
		
//		�Ƿ��ڻ״̬
		boolean isAlive = main.isAlive();
		System.out.println("isAlive:" + isAlive);
		
		
//		�Ƿ�Ϊ�ػ��߳�
		boolean isDaemon = main.isDaemon();
		System.out.println("isDaemon:" + isDaemon);
		
//		�Ƿ��ж���
		boolean isInterrupted = main.isInterrupted();
		System.out.println("isInterrupted:" + isInterrupted);
	}

}
