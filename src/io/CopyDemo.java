package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������
 * ��������һ�Ը߼���,�����Ǽӿ��дЧ��.��ʹ�������ڶ�д
 * ����ʱ�����������д���ǿ��д�����Ա�֤Ч��.
 * ʵ���ϻ������Ὣ���ǵĶ�д����ͳһת��Ϊ���д��ߵ�Ч��
 * 
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("data.text");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("data_cp.text");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int len = -1;
		while((len = bis.read()) != -1){
			bos.write(len);
		}
		
		System.out.println("�����ļ����");
		bis.close();
		bos.close();
	}

}
