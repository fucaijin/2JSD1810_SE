package file;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File����һ�����ļ�
 */
public class CrateNewFileDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * �ڵ�ǰĿ¼���½�һ���ļ�test.txt
		 */
		File file = new File("./test.txt");

		// �ж�File��ʾ���ļ���Ŀ¼�Ƿ��Ѿ���ʵ������
		if (!file.exists()) {
			// ��File��ʾ���ļ���������
			file.createNewFile();
			System.out.println("�ļ������ɹ�");
		} else {
			System.out.println("�ļ��Ѿ�����");
			// ɾ���ļ�
			file.delete();
			System.out.println("�ļ���ɾ��");
		}

	}

}
