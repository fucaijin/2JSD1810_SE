package thread;

/**
 * ʹ�������ڲ���ķ�ʽ��������̵߳Ĵ���
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
//		��ʽһ(ֱ����дThread��run����):
		Thread t1 = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("����˭��?");
				}
			};
		};
		
		Thread t2 = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("���ǲ�ˮ���!");
				}
			}
		};
		
		t1.start();
		t2.start();
		
//		export EDITOR=vi
//		apt edit-sources
//		deb [arch=all,arm] http://mirrors.tuna.tsinghua.edu.cn/termux stable main
//		deb https://termux.net stable main
		
		
		
		
		
		
//		��ʽ��(ʹ��Runnable):
		Runnable r1 = new Runnable(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("����˭��?");
				}
			}
		};
		
		Runnable r2 = new Runnable(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("���ǲ�ˮ���!");
				}
			}
		};
		
		Thread t3 = new Thread(r1);
		Thread t4 = new Thread(r2);
		
		t3.start();
		t4.start();
	}
}
