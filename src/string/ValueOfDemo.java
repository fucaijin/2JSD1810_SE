package string;

/**
 *�ַ����ṩ��һ�����ص�valueOf���������Խ���������ת��Ϊ�ַ���
 */
public class ValueOfDemo {

	public static void main(String[] args) {
		int d = 123;
		String str = String.valueOf(d);
		
//		�κ�
		str = d + "";
		System.out.println(str);
		
		char[] c = {'a','b'};
		String valueOf = String.valueOf(c);
		System.out.println(valueOf);
	}

}
