package file;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 */
public class ListFilesDemo {

	public static void main(String[] args) {
		/*
		 * 获取当前目录中的所有子项
		 */
		
		File dir = new File(".");
		
		/*
		 * boolean isDirectory()
		 * 判断当前File对象表示的是否是一个目录
		 * boolean isFile()
		 * 是否为一个文件
		 */
		if (dir.isDirectory()) {
			/*
			 * listFiles用来获取一个目录下的所有子项
			 */
			File[] listFiles = dir.listFiles();
			for (int i = 0; i < listFiles.length; i++) {
				System.out.println(listFiles[i].getName());
//				if (listFiles[i].isDirectory()) {
//					
//				}
			}
		}
	}

}
