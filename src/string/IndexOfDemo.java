package string;

/**
 * int indexOf(String str) ��ȡ�����ַ����ڵ�ǰ�ַ����е�λ�ã�����ǰ�ַ����в����и������� �򷵻�-1�����ǿ��ַ����򷵻�0
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		String str = "Thinking in java";
		int index = str.indexOf("in");
		System.out.println(index); // 2 ���ϵĵ�һ���ַ����±�

		index = str.indexOf("In");
		System.out.println(index); // -1 �Ҳ����ͷ���-1

		index = str.indexOf("in", 3);
		System.out.println(index); // 5 ָ����ĳ���±꿪ʼ��

		index = str.lastIndexOf("in");
		System.out.println(index); // 9 �����һ�����±�
	}

}
