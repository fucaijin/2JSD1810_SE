package thread;

/**
 * �ػ��߳�
 * �ػ��߳�ʹ��������ͨ�߳�ûʲô����,�����ڽ���ʱ������һ�㲻ͬ:�̵߳��˳�
 * ��һ�������˳�ʱ,���е��ػ��̻߳ᱻǿ����ֹ
 * ���̵��˳�:��һ��������������ͨ�߳̽���ʱ,�����˳�.
 * �ػ��߳���Ҫ������������,��ΪĬ�ϴ����������̶߳�����ͨ�߳�
 */
public class DeamonThreadDemo {

	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Rose:Let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Rose:aaaaaaaaaaa~~~~~~~~~~");
				System.out.println("��ͨ~~~~~");
			}
		};
		
		Thread jack = new Thread(){
			public void run() {
				while (true) {
					System.out.println("Jack:You jump, I jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		rose.start();
		jack.setDaemon(true);
		jack.start();
	}

}
