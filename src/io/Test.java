package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制
 * 步骤:
 * 1.创建一个文件输入流用于读取原文件
 * 2.创建一个文件输出流用于将数据写入复制文件
 * 3.循环读取原文件的字节写入到复制文件完成复制
 * 4.将两个流关闭
 * 
 * 可参考使用RAF对文件进行复制操作
 */
public class Test{
	public static void main(String[] args) throws IOException {
		copyFile("fos.txt",null);
		standarCopyFile();
	}

	/**
	 * 老师教的复制的
	 * @throws IOException 
	 */
	public static void standarCopyFile() throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		FileOutputStream fos = new FileOutputStream("fos_cp.txt");
		byte[] data = new byte[1024];
		int len = -1;
		while ((len = fis.read(data)) != -1) {
			fos.write(data,0,len);
		}
		System.out.println("复制完毕");
		fis.close();
		fos.close();
	}

	/**
	 * 传进来一份原文件的文件名和复制后的文件名,实现文件的复制.
	 * 
	 * @param rawFile 要复制的文件的文件名
	 * @param copyFile 复制出来的新文件的文件名
	 * @throws IOException 如果读取或写入流文件不存在,则会抛出此异常
	 */
	public static void copyFile(String rawFile, String copyFile) throws IOException {
//		如果输入了空的文件名,则提示用户输入文件名,并结束本方法
		if (rawFile == null || rawFile.isEmpty()) {
			System.out.println("请输入文件名");
			return;
		}
		
//		如果用户没有指定复制后的文件名,则自动默认在文件名末尾加"_cp"
		if (copyFile == null || copyFile.isEmpty()) {
			StringBuilder sb = new StringBuilder(rawFile);
			sb.insert(rawFile.indexOf("."), "_cp");
			copyFile = sb.toString();
		}
		
		File file = new File(rawFile);
		FileInputStream fis = new FileInputStream(rawFile);
		FileOutputStream fos = new FileOutputStream(copyFile);
		byte[] b = new byte[(int)file.length()];
		while (fis.read(b) != -1) {
			System.out.println(new String(b,"utf-8"));
			fos.write(b);
		}
		
		System.out.println("复制完毕");
		fos.close();
		fis.close();
		
	}
}
