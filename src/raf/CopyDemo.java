package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rawFile = new RandomAccessFile("demo.txt", "r");
		RandomAccessFile cpFile = new RandomAccessFile("demo_cp.txt", "rw");
		
		int i = -1;
		while ((i = rawFile.read()) != -1) {
			cpFile.write(i);
		}
		
		rawFile.close();
		cpFile.close();
		
		System.out.println("¸´ÖÆÍê±Ï");
	}

}
