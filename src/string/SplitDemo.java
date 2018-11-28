package string;

import java.util.Arrays;

/**
 * 字符串支持正则表达式二： String[] split(String regex) 将当前字符串中按照满足正则表达式的部分进行拆分，
 * 并将拆分出的每一部分以一个字符串数组形式返回
 */
public class SplitDemo {
	public static void main(String[] args) {
		String str = "abc123def456ghi";
		/*
		 * 按照数字部分拆分，得到所有字母部分
		 */

		String[] arr = str.split("[0-9]+");
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));// [abc, def, ghi]

		arr = str.split("[0-9]");
		System.out.println(Arrays.toString(arr));// [abc, , , def, , , ghi]

		StringBuilder stringBuilder = new StringBuilder();
		for (String string : arr) {
			stringBuilder.append(string);
		}
		System.out.println(stringBuilder);

		/*
		 * 如果连续匹配了两次要拆分的内容时，中间会拆分出一个空字符串； 但是若是在字符串末尾连续匹配，则所有拆分出的空字符串都会被忽略
		 */

		str = ",,,,,,,,,,abc,,,def,ghi";
		arr = str.split(",");
		System.out.println(Arrays.toString(arr));// [, , , , , , , , , , abc, , , def, ghi]

		str = "abc,,,def,ghi,,,,,,,,,,";
		arr = str.split(",");
		System.out.println(Arrays.toString(arr));// [abc, , , def, ghi]
	}
}
