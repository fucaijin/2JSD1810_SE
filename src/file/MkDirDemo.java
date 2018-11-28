package file;

import java.io.File;

/*
 * 创建一个目录
 */
public class MkDirDemo {
	public static void main(String[] args) {
		/*
		 *在当前项目目录下新建一个目录(文件夹):demo 
		 */
		
		File dir = new File("Demo");
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("目录已创建!");
		}else {
			System.out.println("目录已存在!");
		}
	}
}
