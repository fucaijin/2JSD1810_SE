package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ʹ���ļ���������ȡ�ļ�����
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		byte[] b = new byte[300];
		int index = fis.read(b);	//���ض��뻺���������ֽ���
		String readStr = new String(b, 0, index,"utf-8");
		System.out.println(readStr);
		fis.close();
	}
}
