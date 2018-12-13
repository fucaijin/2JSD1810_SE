package map;

import java.util.HashMap;
import java.util.Map;

/**
 * 统计字符串中每个字符出现的次数
 */
public class Test {

	public static void main(String[] args) {
		String str = "helloworld!this is java!i love java!";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		// 遍历字符串
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);// 如果map中已经有了当前遍历到的字符,就将key为此字符的value:+1
			} else {
				map.put(c, 1);// 否则就将此字符加入到map中,将其value设置为1.代表第一次遍历到
			}
		}

		System.out.println("统计结果:");
		System.out.println(map);
	}

}
