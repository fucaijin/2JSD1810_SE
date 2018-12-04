package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * java.io.PrintWriter
 * 常用的缓冲字符输出流,可以按行写出字符串.并且具有自动行刷新功能.
 * 内部常连接java.io.BufferedWriter作为缓冲使用
 */
public class PrintWriterDemo1 {

	public static void main(String[] args) throws IOException {
		/*
		 * PW提供了直接对文件写操作的构造方法
		 * PrintWriter(String fileName) 
		 * PrintWriter(File file) 
		 * PrintWriter(String fileName, String decodeType) 
		 * PrintWriter(File file, String decodeType) 
		 */
		
		PrintWriter pw = new PrintWriter("pw.txt","utf-8");
		pw.println("DA你好~");
		pw.println("AD你好啊~~~");
		pw.close();
	}

}
