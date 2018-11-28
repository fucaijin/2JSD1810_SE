package object;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		int x = p1.getX();
		int Y = p1.getY();

		/*
		 * Object的toString方法的设计意图是将当前类实例转换为一个字符串。
		 * Object已经实现了toString方法，默认返回当前对象的句柄(即类名@地址)。
		 * 但实际上对我们的开发没有什么帮助，因此通常我们都会重写这方法。
		 * 注：java定义的类大多都已经实现了toString方法，只有我们自己定义的类若是需 要使用该方法，要自行重写
		 */
		String string = p1.toString();
		System.out.println(string);

		/*
		 * System.out.println(Object o); 该方法会将给定对象toString方法返回的字符串 输出到控制台
		 */
		System.out.println(p1);

		
		/*
		 * 一个引用类型在和字符串连接操作时，
		 * 也是先调用该引用类型的toString方法将其转换为字符串后才和字符串做连接操作的
		 */
		string = "point" + p1; // 此步point处会自动调用point的toString()方法
		System.out.println(string);
		
		Point[] arr = {new Point(1, 2), new Point(5, 6), new Point(9, 4)};
		System.out.println(Arrays.toString(arr));
		
		Point p2 = new Point(1, 2);
		System.out.println("p1==p2 : " + ( p1 == p2 ));
		System.out.println("p1.equals(p2) : " + p1.equals(p2));
		
	}
}
