package file;

import java.io.File;

/**
 * ��ȡһ��Ŀ¼�е���������
 */
public class ListFilesDemo {

	public static void main(String[] args) {
		/*
		 * ��ȡ��ǰĿ¼�е���������
		 */
		
		File dir = new File(".");
		
		/*
		 * boolean isDirectory()
		 * �жϵ�ǰFile�����ʾ���Ƿ���һ��Ŀ¼
		 * boolean isFile()
		 * �Ƿ�Ϊһ���ļ�
		 */
		if (dir.isDirectory()) {
			/*
			 * listFiles������ȡһ��Ŀ¼�µ���������
			 */
			File[] listFiles = dir.listFiles();
			for (int i = 0; i < listFiles.length; i++) {
				System.out.println(listFiles[i].getName());
//				if (listFiles[i].isDirectory()) {
//					
//				}
			}
		}
	}

}
