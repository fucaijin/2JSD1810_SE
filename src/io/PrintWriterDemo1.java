package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * java.io.PrintWriter
 * ���õĻ����ַ������,���԰���д���ַ���.���Ҿ����Զ���ˢ�¹���.
 * �ڲ�������java.io.BufferedWriter��Ϊ����ʹ��
 */
public class PrintWriterDemo1 {

	public static void main(String[] args) throws IOException {
		/*
		 * PW�ṩ��ֱ�Ӷ��ļ�д�����Ĺ��췽��
		 * PrintWriter(String fileName) 
		 * PrintWriter(File file) 
		 * PrintWriter(String fileName, String decodeType) 
		 * PrintWriter(File file, String decodeType) 
		 */
		
		PrintWriter pw = new PrintWriter("pw.txt","utf-8");
		pw.println("DA���~");
		pw.println("AD��ð�~~~");
		pw.close();
	}

}
