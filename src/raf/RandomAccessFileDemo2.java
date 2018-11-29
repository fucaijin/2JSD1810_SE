package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读写基本类型数据，以及RAF如何基于指针进行读写操作
 */
public class RandomAccessFileDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("data.txt", "rw");
		int num = 369874125;
		
		raf.write(num >>> 24);
		raf.write(num >>> 16);
		raf.write(num >>> 8);
		raf.write(num);
		
		raf.writeInt(num);//一次性写出4字节，将给定的int值写出
		raf.writeDouble(3.1415);//一次性写出8字节，将给定的double值写出
		raf.writeLong(13464132131321L);//一次性写出8字节，将给定的long值写出
		raf.close();
		System.out.println("写入完毕");
	}

}
