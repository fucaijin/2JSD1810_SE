package string;

/**
 * boolean startsWith(String str) boolean endsWith(String str)
 * �ж��ַ����Ƿ����Ը������ַ�����ʼ���β��
 */
public class StartsWithsDemo {

	public static void main(String[] args) {
		String string = "thinking of java";
		boolean startsWith = string.startsWith("think");
		System.out.println(startsWith);

		boolean endsWith = string.endsWith("java");
		System.out.println(endsWith);
	}

}
