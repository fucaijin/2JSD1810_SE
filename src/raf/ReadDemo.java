package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ļ��ж�ȡ1���ֽ�
 *
 */
public class ReadDemo {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		/*
		 * ���ļ��ж�ȡ1��ֱ�ӣ�����int
		 */
		
		int read = raf.read();
		System.out.println(read);

		read = raf.read();
		System.out.println(read);
		
		raf.close();
	}

}
