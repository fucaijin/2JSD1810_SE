package string;

/**
 *String substring(int start, int end)
 *��ȡָ����Χ�ڵ��ַ���
 */
public class SubStringDemo {

	public static void main(String[] args) {
//					  0123456789
		String str = "www.tedu.cn";
		
		/*
		 * java api����һ���ص㣬ͨ��ʹ���������ֱ�ʾ��Χʱ�����Ǻ�ͷ����β
		 */
		String sub = str.substring(4, 8);	// ��ͷ����β
		System.out.println(sub);
		
		/*
		 * һ��������Ϊ��ָ��λ�ý�ȡ���ַ���ĩβ
		 */
		sub = str.substring(4);	// ��ȡ��ĩβ
		System.out.println(sub);

	}

}
