package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �����ֽ�������Ļ���������
 */
public class BufferedOutputStream_flush {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("demo.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		String str = "������ɽ��,�ƺ��뺣��";
		byte[] bytes = str.getBytes();
		bos.write(bytes);

		/*
		 * void flush() ��������flush�������ڽ����������Ѿ����������һ����д��.
		 * Ƶ������flush�����ή��дЧ��,���ǿ��Ա�֤д���ļ�ʱ��.����ʵ�������������
		 */
		 bos.flush(); // ����ˢ�����ļ���

		System.out.println("д�����");
		bos.close();
	}

}
