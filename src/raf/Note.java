package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * ���׼��±�����
 * 
 * ����������Ҫ���û�����һ���ļ�����Ȼ��ʼ���ļ�����д����
 * ֮���û������ÿ���ַ�����д�뵽���ļ��У����û������˵��ʣ�
 * �����˳���
 */
public class Note {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ļ�����");
		String input = scanner.nextLine();
		RandomAccessFile raf = new RandomAccessFile(input, "rw");
		
		while(true){
			System.out.println("�������������:");
			input = scanner.nextLine().toUpperCase();
			
			if (input.equals("EXIT")) {
				break;
			}
			
			byte[] bytes = input.getBytes();
			raf.write(bytes);
		}
		
		System.out.println("д�����");
		raf.close();
		scanner.close();
	}

}
