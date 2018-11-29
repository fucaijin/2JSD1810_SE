package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 
 * 程序启动后，要求用户输入一个文件名，然后开始对文件进行写操作
 * 之后用户输入的每行字符串都写入到该文件中，当用户输入了单词，
 * 程序退出。
 */
public class Note {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件名：");
		String input = scanner.nextLine();
		RandomAccessFile raf = new RandomAccessFile(input, "rw");
		
		while(true){
			System.out.println("请继续输入内容:");
			input = scanner.nextLine().toUpperCase();
			
			if (input.equals("EXIT")) {
				break;
			}
			
			byte[] bytes = input.getBytes();
			raf.write(bytes);
		}
		
		System.out.println("写入完毕");
		raf.close();
		scanner.close();
	}

}
