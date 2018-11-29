package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文本数据
 */
public class ReadStringDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile randomAccessFile = new RandomAccessFile("raf.txt", "r");
//		一次性读取文件中所有字节
		byte[] b = new byte[(int)randomAccessFile.length()];
		randomAccessFile.read(b);
		
		/*
		 * 字符串支持构造方法，将字节转换为字符串
		 * String(byte[] data)
		 * 
		 * 按照系统默认字符集转换为字符串(不推荐)
		 * String(byte[] data, String decodingName)
		 * 按照指定的字符集将字节转换为对应字符串
		 */
		String string = new String(b);
//		String string = new String(b, "utf-8");// 指定解码的字符集
		System.out.println(string);
		randomAccessFile.close();
	}

}
