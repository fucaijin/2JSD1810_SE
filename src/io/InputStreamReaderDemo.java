package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ת��������
 * java.io.InputStreamReader
 *
 */
public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
//		File file = new File("osw.txt");
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		
		/**
		 * int read()
		 * �ַ�����read()������һ�ζ�ȡһ���ַ���,������Ȼ����ֵ��int����,��ʵ������һ��charֵ.
		 * �����ص�intֵΪ-1ʱ,���ʾ�ļ�ĩβ.
		 */
		
		int d;
		while((d = isr.read()) != -1){
			System.out.print((char)d);
		}
//		
//		char[] c = new char[(int) file.length()];
//		isr.read(c);
//		System.out.println(new String(c));
		
		isr.close();
	}

}
