package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * �����ַ������
 * 
 * �������,��߶�ȡ�ַ�Ч��.�����ṩ�˰��ж�ȡ�ַ����Ĳ���.
 */
public class BufferedReadDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * ����ǰԴ���밴�ж�ȡ���������������̨
		 */
		FileInputStream fis = new FileInputStream("./src/io/BufferedReadDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		/*
		 * String readLine()
		 * �����ַ��������ṩ�ĸ÷�������������ȡ�����ַ�
		 * ֱ����ȡ�˻��з�Ϊֹ,Ȼ�󽫻��з�֮ǰ��������
		 * һ���ַ�����ʽ����.���ص��ַ������������Ļ��з�
		 * 
		 * ������ֵΪnull,��ʾ��ȡ���ļ�ĩβ
		 */
		String content;
		while((content = br.readLine()) != null){
			System.out.println(content);
		}
		
		br.close();
	}

}
