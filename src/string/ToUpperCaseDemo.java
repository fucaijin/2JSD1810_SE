package string;

/**
 * String toUpperCase() 
 * String toLowerCase() 
 * 将当前字符串中的英文部分转换为全大写或小写
 */
public class ToUpperCaseDemo {

	public static void main(String[] args) {
		String string = "我爱Java";
		String lowerCase = string.toLowerCase();
		System.out.println(lowerCase);
		
		String upperCase = string.toUpperCase();
		System.out.println(upperCase);
	}

}
