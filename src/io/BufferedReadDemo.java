package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * 缓冲字符输出流
 * 
 * 块读操作,提高读取字符效率.并且提供了按行读取字符串的操作.
 */
public class BufferedReadDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 将当前源代码按行读取出来并输出到控制台
		 */
		FileInputStream fis = new FileInputStream("./src/io/BufferedReadDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		/*
		 * String readLine()
		 * 缓存字符输入流提供的该方法可以连续读取若干字符
		 * 直到读取了换行符为止,然后将换行符之前的内容以
		 * 一个字符串形式返回.返回的字符串不含有最后的换行符
		 * 
		 * 若返回值为null,表示读取了文件末尾
		 */
		String content;
		while((content = br.readLine()) != null){
			System.out.println(content);
		}
		
		br.close();
	}

}
