package file;

import java.io.File;

/*
 * ����һ���༶Ŀ¼
 */
public class MkDirsDemo {
	public static void main(String[] args) {
		/*
		 *�ڵ�ǰ��ĿĿ¼���½�Ŀ¼:./a/b/c/d/e/f
		 */
		
		File dir = new File("a/b/c/d/e/f");
		if (!dir.exists()) {
			dir.mkdirs();//�������һ��Ŀ¼/fʱ�����Զ������䲻���ڵĸ�Ŀ¼�����ʱ�򶼻�ʹ�ô˷���
			System.out.println("Ŀ¼�Ѵ���!");
		}else {
			System.out.println("Ŀ¼�Ѵ���!");
		}
	}
}
