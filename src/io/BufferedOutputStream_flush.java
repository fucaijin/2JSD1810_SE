package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲字节输出流的缓冲区问题
 */
public class BufferedOutputStream_flush {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("demo.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		String str = "白日依山尽,黄河入海流";
		byte[] bytes = str.getBytes();
		bos.write(bytes);

		/*
		 * void flush() 缓冲流的flush方法用于将缓冲区中已经缓存的数据一次性写出.
		 * 频繁调用flush方法会降低写效率,但是可以保证写出的即时性.根据实际需求酌情调用
		 */
		 bos.flush(); // 主动刷出到文件中

		System.out.println("写出完毕");
		bos.close();
	}

}
