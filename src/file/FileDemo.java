package file;

import java.io.File;

/**
 * java.io.File
 * File用于表示文件系统中的一个文件或目录
 * 使用File可以:
 * 1.访问其表示的文件或目录的属性信息(文件名、大小等)
 * 2.创建、删除文件或目录
 * 3.访问目录子项
 * 
 * 但是不能访问文件数据
 */
public class FileDemo {

	public static void main(String[] args) {
		
		/**
		 * 创建File是要指定路径，使其表示该路径下的文件或目录。
		 * 这里路径通常使用相对路径，相对路径虽然不能准确描述位置，但是是根据运行环境而定的，
		 * 这样做的好处是跨平台可以使用。
		 * "./"指的是当前目录，在eclipse下运行java程序时，
		 * 当前目录的位置为该程序说在项目的项目目录
		 */
		File file = new File("./demo.txt");
		
		String name = file.getName();
		System.out.println(name);
		
		long length = file.length();
		System.out.println(length);
		
		boolean canRead = file.canRead();
		boolean canWrite = file.canWrite();
		boolean hidden = file.isHidden();
		System.out.println(canRead);
		System.out.println(canWrite);
		System.out.println(hidden);
	}

}
