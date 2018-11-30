package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ�������ļ��ĸ���
 * ����:
 * 1.����һ���ļ����������ڶ�ȡԭ�ļ�
 * 2.����һ���ļ���������ڽ�����д�븴���ļ�
 * 3.ѭ����ȡԭ�ļ����ֽ�д�뵽�����ļ���ɸ���
 * 4.���������ر�
 * 
 * �ɲο�ʹ��RAF���ļ����и��Ʋ���
 */
public class Test{
	public static void main(String[] args) throws IOException {
		copyFile("fos.txt",null);
		standarCopyFile();
	}

	/**
	 * ��ʦ�̵ĸ��Ƶ�
	 * @throws IOException 
	 */
	public static void standarCopyFile() throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		FileOutputStream fos = new FileOutputStream("fos_cp.txt");
		byte[] data = new byte[1024];
		int len = -1;
		while ((len = fis.read(data)) != -1) {
			fos.write(data,0,len);
		}
		System.out.println("�������");
		fis.close();
		fos.close();
	}

	/**
	 * ������һ��ԭ�ļ����ļ����͸��ƺ���ļ���,ʵ���ļ��ĸ���.
	 * 
	 * @param rawFile Ҫ���Ƶ��ļ����ļ���
	 * @param copyFile ���Ƴ��������ļ����ļ���
	 * @throws IOException �����ȡ��д�����ļ�������,����׳����쳣
	 */
	public static void copyFile(String rawFile, String copyFile) throws IOException {
//		��������˿յ��ļ���,����ʾ�û������ļ���,������������
		if (rawFile == null || rawFile.isEmpty()) {
			System.out.println("�������ļ���");
			return;
		}
		
//		����û�û��ָ�����ƺ���ļ���,���Զ�Ĭ�����ļ���ĩβ��"_cp"
		if (copyFile == null || copyFile.isEmpty()) {
			StringBuilder sb = new StringBuilder(rawFile);
			sb.insert(rawFile.indexOf("."), "_cp");
			copyFile = sb.toString();
		}
		
		File file = new File(rawFile);
		FileInputStream fis = new FileInputStream(rawFile);
		FileOutputStream fos = new FileOutputStream(copyFile);
		byte[] b = new byte[(int)file.length()];
		while (fis.read(b) != -1) {
			System.out.println(new String(b,"utf-8"));
			fos.write(b);
		}
		
		System.out.println("�������");
		fos.close();
		fis.close();
		
	}
}
