package integer;

/**
 * ��װ���ṩ��һ����̬������parseXXX(String str)
 * ���Խ��������ַ���ת��Ϊ��Ӧ�Ļ������ͣ�ǰ���Ǹ��ַ���
 * ����Ҫ��ȷ�������������Ϳ��Ա����ֵ
 */
public class ParseDemo {

	public static void main(String[] args) {
		int parseInt = Integer.parseInt("5");
		double parseDouble = Double.parseDouble("5.5");

		System.out.println(parseInt + 10);
		System.out.println(parseDouble + 10);
	}

}
