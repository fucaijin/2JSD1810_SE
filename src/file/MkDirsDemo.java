package file;

import java.io.File;

/*
 * 创建一个多级目录
 */
public class MkDirsDemo {
	public static void main(String[] args) {
		/*
		 *在当前项目目录下新建目录:./a/b/c/d/e/f
		 */
		
		File dir = new File("a/b/c/d/e/f");
		if (!dir.exists()) {
			dir.mkdirs();//创建最后一个目录/f时，会自动创建其不存在的父目录。大多时候都会使用此方法
			System.out.println("目录已创建!");
		}else {
			System.out.println("目录已存在!");
		}
	}
}
