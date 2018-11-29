package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成用户注册功能
 * 要求用户输入注册信息，包括：用户名、密码、昵称、年龄
 * 其中前三个为字符串，年龄为int值
 * 每个用户信息都写入到user.dat文件中保存
 *
 * 设计:
 * 每条记录占用固定的100字节
 * 其中:用户名、密码、昵称、各占32字节，年龄占4字节。
 * 
 * 字符串故意留白有利于后期修改数据，并且格式固定，长度固定
 * 读取时效率高。但是会有部分空间上的浪费
 */
public class RegDemo {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		raf.seek(raf.length());
		
		System.out.println("欢迎注册~");
		System.out.println("请输入用户名:");
		String username = scanner.nextLine();
		
		System.out.println("请输入密码:");
		String psw = scanner.nextLine();
		
		System.out.println("请输入昵称:");
		String nick = scanner.nextLine();
		
		System.out.println("请输入年龄:");
		int age = Integer.parseInt(scanner.nextLine());

//		写入用户名
		byte[] data = username.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
//		写入用户名
		data = psw.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
//		写入用户名
		data = nick.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
//		写入用户名
		raf.writeInt(age);
		
		System.out.println("position = " + raf.getFilePointer());
		System.out.println("写入完毕");
		raf.close();
		scanner.close();
	}

}
