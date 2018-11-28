package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个新文件
 */
public class CrateNewFileDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 在当前目录下新建一个文件test.txt
		 */
		File file = new File("./test.txt");

		// 判断File表示的文件或目录是否已经真实存在了
		if (!file.exists()) {
			// 将File表示的文件创建出来
			file.createNewFile();
			System.out.println("文件创建成功");
		} else {
			System.out.println("文件已经存在");
			// 删除文件
			file.delete();
			System.out.println("文件已删除");
		}

	}

}
