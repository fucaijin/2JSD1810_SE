package file;

import java.io.File;

/**
 * 删除一个文件
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args) {
		/*
		 * 删除当前目录下的test.txt
		 * "./"可以忽略不写，默认就是当前目录
		 */
		File file = new File("./test.txt");

		// 判断File表示的文件或目录是否已经真实存在了
		if (file.exists()) {
			// 删除文件
			file.delete();
			System.out.println("文件已删除");
		}
	}
}
