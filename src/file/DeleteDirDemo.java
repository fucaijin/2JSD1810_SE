package file;

import java.io.File;

/**
 * ɾ��һ���ļ�
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args) {
		/*
		 * ɾ����ǰĿ¼�µ�test.txt
		 * "./"���Ժ��Բ�д��Ĭ�Ͼ��ǵ�ǰĿ¼
		 */
		File file = new File("./test.txt");

		// �ж�File��ʾ���ļ���Ŀ¼�Ƿ��Ѿ���ʵ������
		if (file.exists()) {
			// ɾ���ļ�
			file.delete();
			System.out.println("�ļ���ɾ��");
		}
	}
}
