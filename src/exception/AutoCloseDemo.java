package exception;

import java.io.FileOutputStream;

/**
 * JDK1.7之后推出了一个新特性:自动关闭
 * 使用该特性,对于IO操作后的关闭变得比较简单了
 *
 */
public class AutoCloseDemo {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("fos.txt")){
			/*
			 * JDK1.7后提供了一个接口:AutoCloseable
			 * 实现了该接口的类可以在此定义.最终会在finally中被关闭(编译器会在编译后改变代码)
			 */
			fos.write(1);
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
