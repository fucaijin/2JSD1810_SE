package integer;

/**
 * JDK5发布时，推出了一个特性:自动拆装箱
 * 允许编译器在编译源代码时，将基本类型与引用类型之间互相赋值时补全代码自动进行转换
 */
public class Demo {

	public static void main(String[] args) {
		int i = new Integer(1); // 触发了编译器自动拆装箱特性。编译器在此行时，会自动转为int i = new Integer(1).intValue();
		Integer d = i;			// 编译器在此行，会自动转为Integer d = Integer.valueOf(d);
		
		System.out.println(i);
		System.out.println(d);
	}
}
