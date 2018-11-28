package string;

/**
 * String是不变对象 JVM对String有一个优化，即常量池 当使用直接量(字面量)创建字符串对象时，JVM会将其缓存在常量池中
 * 当再次使用该字符串对象时即重用对象，避免内存中堆积大量内容一样的字符串对象 减少内存开销
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		// 字面量 直接量
		String s1 = "123abc";
		String s2 = "123abc";
		String s3 = "123abc";
		// s2 s3重用了s1创建的对象
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		/*
		 * 字符串为不变对象
		 * 即:字符串一旦创建，内容是不可变的，
		 * 若要改变内容，一定会创建新对象
		 */
		s1 = s1 + "!";
		System.out.println(s1);	//Hello!
		System.out.println(s2);	//Hello
		System.out.println(s1==s2);	//false
		
		
		/*
		 * 这里发挥了编译器的一个特性：
		 * 编译器在编译源代码时，若发现一个计算表达式
		 * 参与运算的内容是确定值时，会在编译期间直接
		 * 进行计算，并将计算结果编译到class文件中。避免
		 * JVM每次执行程序时在做运算，从而提高性能
		 * 如下代码，编译器变异后改为了：
		 * String s4 = "123" + "abc";
		 * 
		 * (即只要直接量运算，就会在编译时候计算出结果。
		 * 只要是有变量的计算表达式，就会生成新的对象，因此用==判断会false)
		 */
		String s4 = "123" + "abc";
		System.out.println(s4);
		System.out.println(s2 == s4);
		
		String s5 = "123";
		String s6 = s5 + "abc";
		System.out.println(s6);
		System.out.println(s2 == s6);
		
		
	}
}
