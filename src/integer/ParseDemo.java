package integer;

/**
 * 包装类提供了一个静态方法：parseXXX(String str)
 * 可以将给定的字符串转换为对应的基本类型，前提是该字符串
 * 内容要正确的描述基本类型可以保存的值
 */
public class ParseDemo {

	public static void main(String[] args) {
		int parseInt = Integer.parseInt("5");
		double parseDouble = Double.parseDouble("5.5");

		System.out.println(parseInt + 10);
		System.out.println(parseDouble + 10);
	}

}
