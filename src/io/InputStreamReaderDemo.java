package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 转换输入流
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
		 * 字符流的read()方法是一次读取一个字符的,所以虽然返回值是int类型,但实际上是一个char值.
		 * 若返回的int值为-1时,则表示文件末尾.
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
