package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��д�����������ݣ��Լ�RAF��λ���ָ����ж�д����
 */
public class RandomAccessFileDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("data.txt", "rw");
		int num = 369874125;
		System.out.println(raf.getFilePointer());	// 0
		
		raf.write(num >>> 24);
		raf.write(num >>> 16);
		raf.write(num >>> 8);
		raf.write(num);
		
		raf.writeInt(num);//һ����д��4�ֽڣ���������intֵд��
		System.out.println(raf.getFilePointer());	// 8
		raf.writeDouble(3.1415);//һ����д��8�ֽڣ���������doubleֵд��
		System.out.println(raf.getFilePointer());	// 16
		raf.writeLong(13464132131321L);//һ����д��8�ֽڣ���������longֵд��
		System.out.println(raf.getFilePointer());	// 24
		System.out.println(raf.read());		
		
//		��ָ���Ƶ�ָ��λ��
		raf.seek(0);
		System.out.println(raf.readInt());
		System.out.println(raf.getFilePointer());	// �����һ��int,Ȼ��4
		
//		��ȡdoubleֵ
//		�Ƚ�ָ���Ƶ�double�ĵ�һ���ֽ�λ��
		raf.seek(8);
		System.out.println(raf.readDouble());
		System.out.println(raf.getFilePointer());	// double�ӵ�8λ��ʼ���ٶ�8λ��double�󣬾��ǵ���16
		
//		��ȡdoubleֵ
//		�Ƚ�ָ���Ƶ�double�ĵ�һ���ֽ�λ��
		raf.seek(16);
		System.out.println(raf.readLong());
		System.out.println(raf.getFilePointer());	// 24

		raf.seek(8);
		raf.writeDouble(1.34);
		
		raf.seek(8);
		System.out.println(raf.readDouble());
		
		raf.close();
		System.out.println("д�����");
		
//		System.exit(0);
	}

}
