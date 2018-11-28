package string;

/**
 *字符串支持正则表达式方法一：
 *boolean matches(String regex)
 *使用给定的正则表达式验证当前字符串是否符合格式要求，
 *符合则返回true
 *
 *以下需要注意：
 *无论给定的正则表达式是否指定了边界匹配(^...$)都是做完全匹配验证的
 */
public class MatchesDemo {

	public static void main(String[] args) {
		String email = "fucaijin333_@tedu.cn";
		
		/*
		 * 邮箱的正则表达式：\w+@[a-zA-Z0-9]+(\.[a-zA-z]+)+
		 * 
		 * \w是代表数字、字母、_
		 * +代表匹配前面的\w一个或多个
		 * 匹配@
		 * [a-zA-Z0-9]+ 匹配一个或多个a-z、A-Z、0-9
		 * \.[a-zA-z]+ 匹配一个或多个.大小写字母
		 * (\.[a-zA-z]+)+匹配一个或多个.大小写字母且多次。比如.com、.cn、.com，cn等
		 */
		
		String regex = "\\w+@[a-zA-Z0-9]+(\\.[a-zA-z]+)+";
		boolean matches = email.matches(regex);
		if (matches) {
			System.out.println("是邮箱");
		}else {
			System.out.println("不是邮箱");
		}
		
	}

}
