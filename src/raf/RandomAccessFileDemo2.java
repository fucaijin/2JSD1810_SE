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
		System.out.println(raf.getFilePointer());	// 0
		
		raf.write(num >>> 24);
		raf.write(num >>> 16);
		raf.write(num >>> 8);
		raf.write(num);
		
		raf.writeInt(num);//一次性写出4字节，将给定的int值写出
		System.out.println(raf.getFilePointer());	// 8
		raf.writeDouble(3.1415);//一次性写出8字节，将给定的double值写出
		System.out.println(raf.getFilePointer());	// 16
		raf.writeLong(13464132131321L);//一次性写出8字节，将给定的long值写出
		System.out.println(raf.getFilePointer());	// 24
		System.out.println(raf.read());		
		
//		将指针移到指定位置
		raf.seek(0);
		System.out.println(raf.readInt());
		System.out.println(raf.getFilePointer());	// 读完第一个int,然后到4
		
//		读取double值
//		先将指针移到double的第一个字节位置
		raf.seek(8);
		System.out.println(raf.readDouble());
		System.out.println(raf.getFilePointer());	// double从第8位开始，再读8位的double后，就是到了16
		
//		读取double值
//		先将指针移到double的第一个字节位置
		raf.seek(16);
		System.out.println(raf.readLong());
		System.out.println(raf.getFilePointer());	// 24

		raf.seek(8);
		raf.writeDouble(1.34);
		
		raf.seek(8);
		System.out.println(raf.readDouble());
		
		raf.close();
		System.out.println("写入完毕");
		
//		System.exit(0);
	}

}
