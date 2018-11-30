package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 修改昵称 启动程序后，要求用户输入用户名以及新的昵称，然后对user.dat 文件中该用户的昵称进行修改。若文件中没有此用户，则提示：没有此用户
 * 实现思路: 循环读取user.dat文件中的每条记录中的用户名，然后与用户输入的用户名进行比对，
 * 若不是则进行下一次循环。若是该用户，则将指针移动到该条记录的昵称位置，然后重写新的昵称 以32字节的形式写入以覆盖原昵称，完成修改操作
 * 若循环完毕后仍然没有匹配到用户，则最终提示：没有此用户
 *
 */
public class UpdateDemo {

	public static void main(String[] args) throws IOException {
//		excersize1();
		excersize2();
	}

	public static void excersize2() throws IOException {
		Scanner scn = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String userName = scn.nextLine().trim();
		System.out.println("请输入新昵称：");
		String newNickName = scn.nextLine().trim();
		
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		byte[] b;
		
		boolean flag = false;
		for (int i = 0; i < raf.length()/10; i++) {
			raf.seek(i*100);
			b = new byte[32];
			raf.read(b);
			String searchUsrName = new String(b,"utf-8").trim();
			
			if (searchUsrName.equals(userName)) {
				raf.seek(i*100 + 64);
				b = newNickName.getBytes("utf-8");
				b = Arrays.copyOf(b, 32);
				raf.write(b);
				
				System.out.println("昵称修改成功");
				flag = true;
			}
		}
		
		if(!flag){
			System.out.println("没有此用户");
		}
		
		scn.close();
		raf.close();
	}

	public static void excersize1() throws FileNotFoundException, IOException, UnsupportedEncodingException {
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		String userName = scanner.nextLine();
		System.out.println("请输入新的昵称");
		String newNick = scanner.nextLine();

		byte[] b = new byte[32];
		
		boolean hasUser = false;
		for (int i = 0; i < raf.length() / 100; i++) {
			raf.read(b);
			if (new String(b, "utf-8").trim().equals(userName)) {
				raf.seek(raf.getFilePointer() + 32);
				System.out.println("point = " + raf.getFilePointer());
				
				b = newNick.getBytes("utf-8");
				b = Arrays.copyOf(b, 32);
				raf.write(b);
				raf.seek(raf.getFilePointer() - 32);
				
				hasUser = true;
				break;
			}
			
			raf.seek((i+1)*100);
		}
		
		if (hasUser) {
			System.out.println("昵称更新成功");
		}else{
			System.out.println("没有此用户");
		}

		scanner.close();
		raf.close();
	}

}
