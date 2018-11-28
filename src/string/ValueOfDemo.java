package string;

/**
 *字符串提供了一组重载的valueOf方法，可以将其他类型转换为字符串
 */
public class ValueOfDemo {

	public static void main(String[] args) {
		int d = 123;
		String str = String.valueOf(d);
		
//		任何
		str = d + "";
		System.out.println(str);
		
		char[] c = {'a','b'};
		String valueOf = String.valueOf(c);
		System.out.println(valueOf);
	}

}
