package file;

import java.io.File;

/*
 * ����һ��Ŀ¼
 */
public class MkDirDemo {
	public static void main(String[] args) {
		/*
		 *�ڵ�ǰ��ĿĿ¼���½�һ��Ŀ¼(�ļ���):demo 
		 */
		
		File dir = new File("Demo");
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("Ŀ¼�Ѵ���!");
		}else {
			System.out.println("Ŀ¼�Ѵ���!");
		}
	}
}
