package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * java.io.RandomAccessFile
 * ������д�ļ����ݵ��࣬�����ָ����ļ����ݽ��ж�д����
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * RandomAccessFile����������ģʽ:
		 * r:ֻ��ģʽ��ֻ���ļ����ݣ���д������
		 * rw:��дģʽ�����ļ��ȿɶ���Ҳ��д
		 * 
		 * �μӹ��췽��:
		 * RandomAccessFile(String path, String mode)
		 * RandomAccessFile(File file, String mode)
		 * mode:������ģʽ(r, rw)
		 * 
		 * �Ե�ǰĿ¼�µ�raf.dat�ļ����ж�д����
		 * ����"rw"ģʽ����ʱ����ָ�����ļ�������ʱ�����Զ�
		 * ������������Ϊ"r"ģʽʱ����ָ�����ļ�������
		 * ���ֱ���׳��쳣:FileNotFoundException
		 */
		
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		/*
		 * void write(int d)
		 * ���ļ�д��1���ֽڣ�д����Ǹ�����intֵ��Ӧ��2���Ƶ�"��8λ":
		 * ��д�������intֵ�Ķ����Ƶ����ұߵ�8λ����һ���ֽ�
		 * 
		 */
		raf.write(65);
		System.out.println("д�����");
		raf.close();
	}

}
