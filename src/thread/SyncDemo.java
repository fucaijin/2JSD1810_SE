package thread;

/**
 * ���̲߳�����ȫ����
 * �����̲߳�������ͬһ�ٽ���Դʱ,�����߳��л��Ĳ�ȷ����,
 * ���²���˳������˻���,δ���ճ���Ԥ�������ִ�ж�����һϵ������.����ʱ���ܵ���ϵͳ̱��
 *
 */
public class SyncDemo {

	public static void main(String[] args) {
		Table table = new Table();
		Thread thread1 = new Thread(){
			public void run() {
				while (true) {
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName() + ":" + bean);
				}
			}
		};
		
		Thread thread2 = new Thread(){
			public void run() {
				while (true) {
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName() + ":" + bean);
				}
			}
		};
		
		thread1.start();
		thread2.start();
		
	}
	
}

class Table{
//	��������20������
	private int beans = 20;
	
	/**
	 * ��һ������ʹ��synchronized���κ�,�÷�����Ϊ"ͬ������"
	 * ��:����̲߳���ͬʱ���뷽���ڲ�ִ��.
	 * ������֤�˶���߳�ִ�и÷���ʱ,���첽ִ��ǿ�Ʊ�Ϊ��ͬ��ִ��(���ɸ��ı�Ϊ�Ŷӽ���),�Ӷ�����˶���߳�"��"������
	 */
	public synchronized int getBean(){
		if (beans == 0 ) {
			throw new RuntimeException("û�ж�����!");
		}
		Thread.yield();//�õ�ǰ�߳������ó�ʱ��Ƭ,ģ���߳��л�
		return beans--;
	}
}
