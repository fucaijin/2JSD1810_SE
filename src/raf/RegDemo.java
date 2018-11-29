package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ����û�ע�Ṧ��
 * Ҫ���û�����ע����Ϣ���������û��������롢�ǳơ�����
 * ����ǰ����Ϊ�ַ���������Ϊintֵ
 * ÿ���û���Ϣ��д�뵽user.dat�ļ��б���
 *
 * ���:
 * ÿ����¼ռ�ù̶���100�ֽ�
 * ����:�û��������롢�ǳơ���ռ32�ֽڣ�����ռ4�ֽڡ�
 * 
 * �ַ����������������ں����޸����ݣ����Ҹ�ʽ�̶������ȹ̶�
 * ��ȡʱЧ�ʸߡ����ǻ��в��ֿռ��ϵ��˷�
 */
public class RegDemo {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		raf.seek(raf.length());
		
		System.out.println("��ӭע��~");
		System.out.println("�������û���:");
		String username = scanner.nextLine();
		
		System.out.println("����������:");
		String psw = scanner.nextLine();
		
		System.out.println("�������ǳ�:");
		String nick = scanner.nextLine();
		
		System.out.println("����������:");
		int age = Integer.parseInt(scanner.nextLine());

//		д���û���
		byte[] data = username.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
//		д���û���
		data = psw.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
//		д���û���
		data = nick.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
//		д���û���
		raf.writeInt(age);
		
		System.out.println("position = " + raf.getFilePointer());
		System.out.println("д�����");
		raf.close();
		scanner.close();
	}

}
