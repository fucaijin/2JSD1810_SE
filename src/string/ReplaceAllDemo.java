package string;

/**
 * 字符串支持正则表达式方法三:
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定字符串
 * 
 *
 */
public class ReplaceAllDemo {

	public static void main(String[] args) {
		String str = "abc123def456ghi";
		
		/*
		 * 将当前字符串中符合正则表达式部分替换为，第二个参数的字符串
		 */
		
		str = str.replace("123", "456");
		System.out.println(str);
		
		str = str.replaceAll("\\d+", "#number#");
		System.out.println(str);
	}

}
