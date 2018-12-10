package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 使用文件输入流读取文件数据
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		byte[] b = new byte[300];
		int index = fis.read(b);	//返回读入缓冲区的总字节数
		String readStr = new String(b, 0, index,"utf-8");
		System.out.println(readStr);
		fis.close();
	}
}
