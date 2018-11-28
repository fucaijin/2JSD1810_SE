package string;

import java.util.Arrays;

/**
 * �ַ���֧��������ʽ���� String[] split(String regex) ����ǰ�ַ����а�������������ʽ�Ĳ��ֽ��в�֣�
 * ������ֳ���ÿһ������һ���ַ���������ʽ����
 */
public class SplitDemo {
	public static void main(String[] args) {
		String str = "abc123def456ghi";
		/*
		 * �������ֲ��ֲ�֣��õ�������ĸ����
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
		 * �������ƥ��������Ҫ��ֵ�����ʱ���м���ֳ�һ�����ַ����� �����������ַ���ĩβ����ƥ�䣬�����в�ֳ��Ŀ��ַ������ᱻ����
		 */

		str = ",,,,,,,,,,abc,,,def,ghi";
		arr = str.split(",");
		System.out.println(Arrays.toString(arr));// [, , , , , , , , , , abc, , , def, ghi]

		str = "abc,,,def,ghi,,,,,,,,,,";
		arr = str.split(",");
		System.out.println(Arrays.toString(arr));// [abc, , , def, ghi]
	}
}
