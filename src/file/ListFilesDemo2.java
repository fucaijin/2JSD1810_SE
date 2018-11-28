package file;

import java.io.File;
import java.io.FileFilter;

/**
 * listFiles()有一个重载方法，允许我们传入一个参数，该参 数为一个文件过滤器，那么该方法会将目录中满足过滤器要求的子项返回
 */
public class ListFilesDemo2 {

	public static void main(String[] args) {
		/*
		 * 获取当前目录中名字以"."开头的子项
		 */

//		方法一:匿名内部类
		File file = new File(".");
		File[] listFiles = file.listFiles(new FileFilter() {
			public boolean accept(File pathname) {
				return pathname.getName().startsWith(".");
			}
		});
		for (int i = 0; i < listFiles.length; i++) {
			String name = listFiles[i].getName();
			System.out.println(name);
		}

//		方法二：实现FileFilter类
		// File file2 = new File(".");
		// MyFileter myFileter = new MyFileter();
		// File[] listFiles2 = file2.listFiles(myFileter);
		// for (int i = 0; i < listFiles2.length; i++) {
		// String name = listFiles2[i].getName();
		// System.out.println(name);
		// }
	}

}

class MyFileter implements FileFilter {
	public boolean accept(File pathname) {
		String name = pathname.getName();
		return name.startsWith(".");
	}

}
