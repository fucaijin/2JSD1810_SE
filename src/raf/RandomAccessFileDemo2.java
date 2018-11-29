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
		
		raf.write(num >>> 24);
		raf.write(num >>> 16);
		raf.write(num >>> 8);
		raf.write(num);
		
		raf.writeInt(num);//һ����д��4�ֽڣ���������intֵд��
		raf.writeDouble(3.1415);//һ����д��8�ֽڣ���������doubleֵд��
		raf.writeLong(13464132131321L);//һ����д��8�ֽڣ���������longֵд��
		raf.close();
		System.out.println("д�����");
	}

}
