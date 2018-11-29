package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 写出文本数据
 */
public class WriteStringDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		String str = "好嗨哦~";
		
		/*
		 * String提供了将字符串转换为字节的方法:
		 * byte[] getBytes()
		 * 按照系统默认字符集将当前字符串转换为对应的直接
		 * 但不推荐这种方式，依赖系统默认字符集不利于跨平台
		 * 
		 * byte[] getBytes(String encodingName)
		 * 按照指定的字符集转换为一组字节
		 * 常见的字符集：
		 * GBK:国际编码，其中英文1字节，中文2字节
		 * UTF-8:unicode的字符编码集，其中英文1字节，中文3字节。
		 * utf-8支持世界流行的所有文字，所以也成为万国码。是互联网
		 * 最常用的字符集
		 * ISO8859-1:一种欧洲的编码集，不支持中文
		 */
		byte[] bytes = str.getBytes();
		raf.write(bytes);
		
		str = "学Java学到了高潮";
		bytes = str.getBytes();
		raf.write(bytes);
		
		System.out.println("写出完毕");
		raf.close();
	}

}
