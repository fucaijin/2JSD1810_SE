package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ͳ�Ļ�еӲ���������������Ծ����˵��ֽڶ�дЧ�ʲ� ���ǿ��дЧ���ǿ��Ա�֤�ġ� ��������ͨ�����ÿ�ζ�ȡ��������������ʵ�ʶ�д�Ĵ�����
 * ������߶�д��Ч��
 * 
 * �����д:ͨ���ǵ��ֽڶ�дģʽ ���д:һ�ζ�дһ���ֽڵ�ģʽ
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rawFile = new RandomAccessFile("demo.txt", "r");
		RandomAccessFile cpFile = new RandomAccessFile("demo_cp.txt", "rw");

		int i = -1;
		byte[] b = new byte[1024 * 10];
		while ((i = rawFile.read(b)) != -1) {
			cpFile.write(b, 0, i);
		}

		rawFile.close();
		cpFile.close();
	}

}
