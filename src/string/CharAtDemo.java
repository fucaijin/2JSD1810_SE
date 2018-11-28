package string;

/**
 * char charAt(int index)
 * 获取给定位置对应的字符
 */
public class CharAtDemo {

	public static void main(String[] args) {
//					   0123456789012345
		String str  = "thinking in java";
		
		char charAt = str.charAt(5);
		System.out.println(charAt);
		
//		判断回文(正读和倒读是一样的，例如：“上海自来水来自海上”)
		String stringLine = "上海自来水来自海上";
		for (int i = 0; i < stringLine.length()/2; i++) {
			if (stringLine.charAt(i) != stringLine.charAt(stringLine.length()-1-i)) {
				System.out.println("不是回文");
				return;
			}
		}
		System.out.println("是回文");
		
		
	}

}
