package string;

/**
 *�ַ���֧��������ʽ����һ��
 *boolean matches(String regex)
 *ʹ�ø�����������ʽ��֤��ǰ�ַ����Ƿ���ϸ�ʽҪ��
 *�����򷵻�true
 *
 *������Ҫע�⣺
 *���۸�����������ʽ�Ƿ�ָ���˱߽�ƥ��(^...$)��������ȫƥ����֤��
 */
public class MatchesDemo {

	public static void main(String[] args) {
		String email = "fucaijin333_@tedu.cn";
		
		/*
		 * �����������ʽ��\w+@[a-zA-Z0-9]+(\.[a-zA-z]+)+
		 * 
		 * \w�Ǵ������֡���ĸ��_
		 * +����ƥ��ǰ���\wһ������
		 * ƥ��@
		 * [a-zA-Z0-9]+ ƥ��һ������a-z��A-Z��0-9
		 * \.[a-zA-z]+ ƥ��һ������.��Сд��ĸ
		 * (\.[a-zA-z]+)+ƥ��һ������.��Сд��ĸ�Ҷ�Ρ�����.com��.cn��.com��cn��
		 */
		
		String regex = "\\w+@[a-zA-Z0-9]+(\\.[a-zA-z]+)+";
		boolean matches = email.matches(regex);
		if (matches) {
			System.out.println("������");
		}else {
			System.out.println("��������");
		}
		
	}

}
