package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 使用PW实现简易记事本功能
 * 程序启动后要求输入文件名,然后对文件写操作
 * 之后用户输入的每行字符串按行写入文件(换行写).
 * 但输入exit时程序退出
 */
public class Test2 {

	public static void main(String[] args) throws IOException {
		System.out.println("请输入文件名:");
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine().trim();
		
		FileOutputStream fos = new FileOutputStream(inputStr);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		/*
		 * 在流连接中使用PW时,可以传入第二个参数,该参数为一个boolean值,但该值为true时,则开启
		 * 自动行刷新操作
		 * 
		 * 这是当我们调用的PW的println方法写出一行字符串后会自动flush
		 * 注意:print方法是不会自动行刷新的!
		 */
		PrintWriter pw = new PrintWriter(bw, true);	//第二个参数是设置可以自动行刷新,每遇到换行符就刷新,是用于println()
		System.out.println("请输入文件内容,输入exit退出:");
		
//		算法1:
		inputStr = scanner.nextLine();
		while(!inputStr.equalsIgnoreCase("exit")){
			pw.println(inputStr);
			inputStr = scanner.nextLine();
		}

//		算法2(老师的写法):
//		while(true){
//			String input  = scanner.nextLine();
//			if (input.equalsIgnoreCase("exit")) {
//				break;
//			}
//			pw.println(input);
//		}
		
//		算法3:
//		inputStr = "";
//		do{
//			pw.println(inputStr);
//			inputStr = scanner.nextLine();
//		}while((!inputStr.toLowerCase().equals("exit")));
		
		System.out.println("程序结束");
		bw.close();
		scanner.close();
	}

}
