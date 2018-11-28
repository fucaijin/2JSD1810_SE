package string;

/**
 * int indexOf(String str) 获取给定字符串在当前字符串中的位置，若当前字符串中不含有给定内容 则返回-1，若是空字符串则返回0
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		String str = "Thinking in java";
		int index = str.indexOf("in");
		System.out.println(index); // 2 符合的第一个字符的下标

		index = str.indexOf("In");
		System.out.println(index); // -1 找不到就返回-1

		index = str.indexOf("in", 3);
		System.out.println(index); // 5 指定从某个下标开始找

		index = str.lastIndexOf("in");
		System.out.println(index); // 9 找最后一个的下标
	}

}
