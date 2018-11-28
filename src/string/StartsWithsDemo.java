package string;

/**
 * boolean startsWith(String str) boolean endsWith(String str)
 * 判断字符串是否是以给定的字符串开始或结尾的
 */
public class StartsWithsDemo {

	public static void main(String[] args) {
		String string = "thinking of java";
		boolean startsWith = string.startsWith("think");
		System.out.println(startsWith);

		boolean endsWith = string.endsWith("java");
		System.out.println(endsWith);
	}

}
