package string;

/**
 *String substring(int start, int end)
 *截取指定范围内的字符串
 */
public class SubStringDemo {

	public static void main(String[] args) {
//					  0123456789
		String str = "www.tedu.cn";
		
		/*
		 * java api中有一个特点，通常使用两个数字表示范围时，都是含头不含尾
		 */
		String sub = str.substring(4, 8);	// 含头不含尾
		System.out.println(sub);
		
		/*
		 * 一个参数的为从指定位置截取到字符串末尾
		 */
		sub = str.substring(4);	// 截取到末尾
		System.out.println(sub);

	}

}
