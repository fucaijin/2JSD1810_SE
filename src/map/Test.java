package map;

import java.util.HashMap;
import java.util.Map;

/**
 * ͳ���ַ�����ÿ���ַ����ֵĴ���
 */
public class Test {

	public static void main(String[] args) {
		String str = "helloworld!this is java!i love java!";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		// �����ַ���
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);// ���map���Ѿ����˵�ǰ���������ַ�,�ͽ�keyΪ���ַ���value:+1
			} else {
				map.put(c, 1);// ����ͽ����ַ����뵽map��,����value����Ϊ1.�����һ�α�����
			}
		}

		System.out.println("ͳ�ƽ��:");
		System.out.println(map);
	}

}
