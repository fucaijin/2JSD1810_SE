package string;

/**
 * �ַ���֧���������ʽ������:
 * String replaceAll(String regex,String str)
 * ����ǰ�ַ����������������ʽ�Ĳ����滻Ϊ�����ַ���
 * 
 *
 */
public class ReplaceAllDemo {

	public static void main(String[] args) {
		String str = "abc123def456ghi";
		
		/*
		 * ����ǰ�ַ����з����������ʽ�����滻Ϊ���ڶ����������ַ���
		 */
		
		str = str.replace("123", "456");
		System.out.println(str);
		
		str = str.replaceAll("\\d+", "#number#");
		System.out.println(str);
	}

}