package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取1个字节
 *
 */
public class ReadDemo {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		
		/*
		 * 从文件中读取1个字节，并以int值接收
		 */
		int read = raf.read();
		System.out.println(read);

		read = raf.read();
		System.out.println(read);
		
		raf.close();
	}

}
