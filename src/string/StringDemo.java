package string;

/**
 * String�ǲ������ JVM��String��һ���Ż����������� ��ʹ��ֱ����(������)�����ַ�������ʱ��JVM�Ὣ�仺���ڳ�������
 * ���ٴ�ʹ�ø��ַ�������ʱ�����ö��󣬱����ڴ��жѻ���������һ�����ַ������� �����ڴ濪��
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		// ������ ֱ����
		String s1 = "123abc";
		String s2 = "123abc";
		String s3 = "123abc";
		// s2 s3������s1�����Ķ���
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		/*
		 * �ַ���Ϊ�������
		 * ��:�ַ���һ�������������ǲ��ɱ�ģ�
		 * ��Ҫ�ı����ݣ�һ���ᴴ���¶���
		 */
		s1 = s1 + "!";
		System.out.println(s1);	//Hello!
		System.out.println(s2);	//Hello
		System.out.println(s1==s2);	//false
		
		
		/*
		 * ���﷢���˱�������һ�����ԣ�
		 * �������ڱ���Դ����ʱ��������һ��������ʽ
		 * ���������������ȷ��ֵʱ�����ڱ����ڼ�ֱ��
		 * ���м��㣬�������������뵽class�ļ��С�����
		 * JVMÿ��ִ�г���ʱ�������㣬�Ӷ��������
		 * ���´��룬������������Ϊ�ˣ�
		 * String s4 = "123" + "abc";
		 * 
		 * (��ֻҪֱ�������㣬�ͻ��ڱ���ʱ�����������
		 * ֻҪ���б����ļ�����ʽ���ͻ������µĶ��������==�жϻ�false)
		 */
		String s4 = "123" + "abc";
		System.out.println(s4);
		System.out.println(s2 == s4);
		
		String s5 = "123";
		String s6 = s5 + "abc";
		System.out.println(s6);
		System.out.println(s2 == s6);
		
		
	}
}
