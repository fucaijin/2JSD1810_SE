package file;

import java.io.File;
import java.io.FileFilter;

/**
 * listFiles()��һ�����ط������������Ǵ���һ���������ò� ��Ϊһ���ļ�����������ô�÷����ὫĿ¼�����������Ҫ��������
 */
public class ListFilesDemo2 {

	public static void main(String[] args) {
		/*
		 * ��ȡ��ǰĿ¼��������"."��ͷ������
		 */

//		����һ:�����ڲ���
		File file = new File(".");
		File[] listFiles = file.listFiles(new FileFilter() {
			public boolean accept(File pathname) {
				return pathname.getName().startsWith(".");
			}
		});
		for (int i = 0; i < listFiles.length; i++) {
			String name = listFiles[i].getName();
			System.out.println(name);
		}

//		��������ʵ��FileFilter��
		// File file2 = new File(".");
		// MyFileter myFileter = new MyFileter();
		// File[] listFiles2 = file2.listFiles(myFileter);
		// for (int i = 0; i < listFiles2.length; i++) {
		// String name = listFiles2[i].getName();
		// System.out.println(name);
		// }
	}

}

class MyFileter implements FileFilter {
	public boolean accept(File pathname) {
		String name = pathname.getName();
		return name.startsWith(".");
	}

}
