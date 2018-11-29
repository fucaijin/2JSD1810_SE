package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ı�����
 */
public class ReadStringDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile randomAccessFile = new RandomAccessFile("raf.txt", "r");
//		һ���Զ�ȡ�ļ��������ֽ�
		byte[] b = new byte[(int)randomAccessFile.length()];
		randomAccessFile.read(b);
		
		/*
		 * �ַ���֧�ֹ��췽�������ֽ�ת��Ϊ�ַ���
		 * String(byte[] data)
		 * 
		 * ����ϵͳĬ���ַ���ת��Ϊ�ַ���(���Ƽ�)
		 * String(byte[] data, String decodingName)
		 * ����ָ�����ַ������ֽ�ת��Ϊ��Ӧ�ַ���
		 */
		String string = new String(b);
//		String string = new String(b, "utf-8");// ָ��������ַ���
		System.out.println(string);
		randomAccessFile.close();
	}

}
