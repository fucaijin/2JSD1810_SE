package file;

import java.io.File;

/**
 * 删除目录
 */
public class DeleteFileDemo {
	public static void main(String[] args) {
		/*
		 * 删除当前目录下的demo目录
		 */
		File dir = new File("demo");

		if (dir.exists()) {
			// 删目录的前提是目录必须是一个空目录
			dir.delete();
			System.out.println("文件已删除!");
		}else {
			System.out.println("目录不存在!");
		}
	}
}
