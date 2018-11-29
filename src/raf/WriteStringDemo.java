package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * д���ı�����
 */
public class WriteStringDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		String str = "����Ŷ~";
		
		/*
		 * String�ṩ�˽��ַ���ת��Ϊ�ֽڵķ���:
		 * byte[] getBytes()
		 * ����ϵͳĬ���ַ�������ǰ�ַ���ת��Ϊ��Ӧ��ֱ��
		 * �����Ƽ����ַ�ʽ������ϵͳĬ���ַ��������ڿ�ƽ̨
		 * 
		 * byte[] getBytes(String encodingName)
		 * ����ָ�����ַ���ת��Ϊһ���ֽ�
		 * �������ַ�����
		 * GBK:���ʱ��룬����Ӣ��1�ֽڣ�����2�ֽ�
		 * UTF-8:unicode���ַ����뼯������Ӣ��1�ֽڣ�����3�ֽڡ�
		 * utf-8֧���������е��������֣�����Ҳ��Ϊ����롣�ǻ�����
		 * ��õ��ַ���
		 * ISO8859-1:һ��ŷ�޵ı��뼯����֧������
		 */
		byte[] bytes = str.getBytes();
		raf.write(bytes);
		
		str = "ѧJavaѧ���˸߳�";
		bytes = str.getBytes();
		raf.write(bytes);
		
		System.out.println("д�����");
		raf.close();
	}

}
