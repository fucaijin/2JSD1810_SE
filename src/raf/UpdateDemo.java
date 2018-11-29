package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �޸��ǳ� ���������Ҫ���û������û����Լ��µ��ǳƣ�Ȼ���user.dat �ļ��и��û����ǳƽ����޸ġ����ļ���û�д��û�������ʾ��û�д��û�
 * ʵ��˼·: ѭ����ȡuser.dat�ļ��е�ÿ����¼�е��û�����Ȼ�����û�������û������бȶԣ�
 * �������������һ��ѭ�������Ǹ��û�����ָ���ƶ���������¼���ǳ�λ�ã�Ȼ����д�µ��ǳ� ��32�ֽڵ���ʽд���Ը���ԭ�ǳƣ�����޸Ĳ���
 * ��ѭ����Ϻ���Ȼû��ƥ�䵽�û�����������ʾ��û�д��û�
 *
 */
public class UpdateDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û���");
		String userName = scanner.nextLine();
		System.out.println("�������µ��ǳ�");
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
			System.out.println("�ǳƸ��³ɹ�");
		}else{
			System.out.println("û�д��û�");
		}

		scanner.close();
		raf.close();
	}

}
