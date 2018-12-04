package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * java�����ն�д��λ����Ϊ����:
 * 1:�ֽ���,��д��ֱ��Ϊ��С��λ
 * 2:�ַ���,��д��֧��(unicode)Ϊ��С��λ.ʵ���ϵײ㱾�ʻ��Ƕ�д�ֽ�,
 * �����ֽ���֧����ת���������ַ����������.�ַ���ֻ�ʺ϶�д�ı�����.
 * 
 * java.io.Reader�������ַ��������ĳ���
 * java.io.Writer�������ַ�������ĳ���
 *
 * ת����(��һ�Ը߼���):
 * java.io.InputStreamReader
 * java.io.OutputStreamReader
 * ��������������ʹ���ַ�������ַ���д����ʱ�Ƿǳ���Ҫ��һ��,����ͨ����ֱ�Ӳ�����������
 * 
 * java���ṩ�˺ܶ๦�ܸ��ḻ���ַ���,�����ַ�������һ����ͬ��:����ֱ���������ֽ�����
 * �󲿷ֳ��õĵͼ��������ֽ���(�����ļ���),��ᵼ����������������Ҫʹ���ַ�����д�ı�����ʱ
 * �޷�ֱ�����ֽ�������.�������Ҫʹ��ת����,ת������Ψһһ�Կ����������ֽ����ϵ��ַ���,ʹ����
 * ��Ϊ"ת����"ʹ��,���Դﵽ���ַ������ֽ�������ʹ��
 *
 */
public class OuputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("osw.txt");
		
		/*
		 * ����ת����ʱͨ����ָ���ڶ�������,�ò���Ϊ�ַ���������,
		 * ����ͨ��ת����д�����ı����ݶ��ᰴ��ָ�����ַ���ת��Ϊ�ֽ�
		 * ����ָ��,���ǰ���ϵͳĬ���ַ���,���Ƽ�
		 */
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		osw.write("����Ӵ~");
		osw.write("�о�дbug�ﵽ�˸߳�~~~~");
		osw.close();
		System.out.println("д�����");
	}
}
