package thread;

/**
 * �߳��ṩ��һ��join����,����Э���߳�֮���ͬ������
 * 
 * ͬ������:�������Ⱥ�˳��
 * �첽����:���д����Ǹ��ɸ���(���߳̾����첽���е�)
 *
 */
public class JoinDemo {
	// ��ʾͼƬ�Ƿ��������
	public static boolean isFinish = false;

	public static void main(String[] args) {
		Thread downLoad = new Thread() {
			public void run() {
				System.out.println("Down:��ʼ����ͼƬ...");
				for (int i = 0; i <= 100; i++) {
					System.out.println("down:������:" + i + "%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Down:ͼƬ�������");
				isFinish = true;
			}
		};
		
		Thread show = new Thread(){
			public void run() {
				System.out.println("show:��ʼ��ʾͼƬ");
//				�ȵȴ������߳̽�ͼƬ�������
				try {
					/*
					 * ��show�̵߳���download�̵߳ķ���join������ͽ���������״̬,
					 * ֱ��downloadִ����ϲŻ�Ӵ�����.
					 */
					downLoad.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if (!isFinish) {
					throw new RuntimeException("ͼƬ����ʧ��");
				}
				
				System.out.println("show:��ʾͼƬ���");
			};
		};
		
		downLoad.start();
		show.start();
	}

}
