package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 传统的机械硬盘由于其物理特性决定了单字节读写效率差 但是块读写效率是可以保证的。 所以我们通过提高每次读取的数据量，减少实际读写的次数，
 * 可以提高读写的效率
 * 
 * 随机读写:通常是单字节读写模式 块读写:一次读写一组字节的模式
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
