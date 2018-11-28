package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * java.io.RandomAccessFile
 * 用来读写文件数据的类，其基于指针对文件数据进行读写操作
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * RandomAccessFile创建有两种模式:
		 * r:只读模式，只读文件数据，不写入内容
		 * rw:读写模式，对文件既可读，也可写
		 * 
		 * 参加构造方法:
		 * RandomAccessFile(String path, String mode)
		 * RandomAccessFile(File file, String mode)
		 * mode:创建的模式(r, rw)
		 * 
		 * 对当前目录下的raf.dat文件进行读写操作
		 * 对于"rw"模式创建时，若指定的文件不存在时，会自动
		 * 创建出来，若为"r"模式时，若指定的文件不存在
		 * 则会直接抛出异常:FileNotFoundException
		 */
		
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		/*
		 * void write(int d)
		 * 向文件写入1个字节，写入的是给定的int值对应的2进制的"低8位":
		 * 即写入给定的int值的二进制的最右边的8位，即一个字节
		 * 
		 */
		raf.write(65);
		System.out.println("写出完毕");
		raf.close();
	}

}
