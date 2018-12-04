package exception;

import java.io.FileOutputStream;

/**
 * finally在IO中的使用
 *
 */
public class FinallyDemo2 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
//			fos = new FileOutputStream("fos.dat");
			fos.write(1);
		} catch (Exception e) {
			System.out.println("有Bug");
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (Exception e) {
			}
		}
		
		System.out.println("程序执行结束");
	}

}
