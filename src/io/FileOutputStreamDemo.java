package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO java��׼�����������
 * java�ṩ��ͳһ�ı�׼���������������������������豸���н�������
 * 
 * ���У�
 * ������:���ڴ�����ȡ���ݵ������е�����(������)
 * �����:���ڽ������е����ݷ��͵���������(д����)
 *
 * java.io.InputStream:
 * �����ֽ��������ĳ��࣬�������������������߱��Ķ�ȡ�ֽڵķ�������InputStream�ǳ����࣬�����Ա�ʵ����
 * 
 * java.io.OutputStream:
 * �����ֽ�������ĳ��࣬������д�����ݵķ�����
 * 
 * ����д���ݲ�ȡ��ģʽΪ:˳���д��Ҳ����˵���۶�����д������һ���Եģ������Ի��ˡ�
 * 
 * java��������Ϊ������:
 * 1.�ڵ���:�ֽеͼ�������ʵ�����ӳ�������һ�˵�"�ܵ�"������ʵ�ʶ�д���ݵ�������дһ���ǽ����ڽڵ����Ļ����Ͻ��еġ�
 * 2.������:�ֽи߼���,�߼��������Զ�������,������������������,����������������ǰ�߼���ʱ������ݽ��мӹ�,�������Լ����Ƕ����ݼӹ��Ĳ���.
 * 
 * ��һ��߼������д�������.�������ӵ�ĳ���ͼ�����,��ɶԶ�д���ݵ���ˮ��ʽ�ӹ�.�����Ĳ�����Ϊ������.
 * ��������ѧϰIO�ľ���,Ҫ����.
 * 
 * �ļ���:
 * �ļ�����һ�ѵͼ���,���ڶ�д�ļ����ݵ���.
 * java.io.FileOutputStream
 * java.io.FileInputStream
 * 
 * �ļ�����RandomAccessFile(RAF)�Ա�:
 * �ļ����ǻ���java��׼IO���ж�д���ݵ�,���Զ��ļ�������˳���д��ʽ.
 * RAF�ǻ���ָ��������д��ʽ.���Բ���ָ����ļ�����λ�ý��ж�/д
 * 
 * �ļ������Ի���������,�������ɸ߼�����ɸ����ӵĶ�д���ݲ���.��RAF�ܶ��������Ҫ�������
 */
public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * ��fos.txt�ļ���д������
		 * �������췽��:
		 * FileOutputStream(String path)
		 * FileOutputStream(File file)
		 * �������ִ���ģʽΪ����дģʽ,����������ʱ�������ļ��Ѿ�����,�����ֽ����ļ��������,Ȼ��ſ�ʼ�µ�д����
		 * 
		 * FileOutputStream(String path, boolean append)
		 * FileOutputStream(File file, boolean append)
		 * �������ִ���ģʽΪ׷��дģʽ,��:�ļ����ݶ�����,�Ὣͨ������д������ݼ���׷�ӵ��ļ�ĩβ
		 */
		
		FileOutputStream fos = new FileOutputStream("fos.txt", true);
		
		String str = "�ҿ���,����ȥ������";
		byte[] bytes = str.getBytes("utf-8");
		fos.write(bytes);
//
//		str = "�Ҳ���,ÿһ�ζ��������";
//		bytes = str.getBytes("utf-8");
//		fos.write(bytes);
		
//		String str = "�Ҳ���,ÿһ�ζ��������";
//		byte[] bytes = str.getBytes("utf-8");
//		fos.write(bytes);
		
		System.out.println("д�����");
		fos.close();
	}

}
