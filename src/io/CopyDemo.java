package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流
 * 缓冲流是一对高级流,作用是加快读写效率.这使得我们在读写
 * 数据时无论用随机读写还是块读写都可以保证效率.
 * 实际上缓冲流会将我们的读写最终统一转化为块读写提高的效率
 * 
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("data.text");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("data_cp.text");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int len = -1;
		while((len = bis.read()) != -1){
			bos.write(len);
		}
		
		System.out.println("复制文件完毕");
		bis.close();
		bos.close();
	}

}
