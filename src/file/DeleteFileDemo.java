package file;

import java.io.File;

/**
 * ɾ��Ŀ¼
 */
public class DeleteFileDemo {
	public static void main(String[] args) {
		/*
		 * ɾ����ǰĿ¼�µ�demoĿ¼
		 */
		File dir = new File("demo");

		if (dir.exists()) {
			// ɾĿ¼��ǰ����Ŀ¼������һ����Ŀ¼
			dir.delete();
			System.out.println("�ļ���ɾ��!");
		}else {
			System.out.println("Ŀ¼������!");
		}
	}
}
