package string;

public class Test {
	public static void main(String[] args) {
		String str = getName("www.tedu.com");
		System.out.println(str);
		
		str = getName("http://www.baidu.com");
		System.out.println(str);
	}
	
	/**
	 * ��ȡ������ַ�е�����
	 * 
	 * ���磺Ҫ�����ڽ�ȡ"www.tedu.com"��"http://www.baidu.com"��
	 * "http://www.baidu.com.cn"�е�tedu��baidu�ַ���
	 * 
	 * @param url �����ĵ�ַ
	 * @return	����
	 */
	public static String getName(String url){
//		��һ���㡰.��֮���һ���ַ���λ��
		int firstIndex = url.indexOf('.') + 1;
//		�ڶ����㡰.����λ��
		int lastIndex = url.indexOf('.', firstIndex);
		return url.substring(firstIndex, lastIndex);
	}
}
