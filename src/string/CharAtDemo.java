package string;

/**
 * char charAt(int index)
 * ��ȡ����λ�ö�Ӧ���ַ�
 */
public class CharAtDemo {

	public static void main(String[] args) {
//					   0123456789012345
		String str  = "thinking in java";
		
		char charAt = str.charAt(5);
		System.out.println(charAt);
		
//		�жϻ���(�����͵�����һ���ģ����磺���Ϻ�����ˮ���Ժ��ϡ�)
		String stringLine = "�Ϻ�����ˮ���Ժ���";
		for (int i = 0; i < stringLine.length()/2; i++) {
			if (stringLine.charAt(i) != stringLine.charAt(stringLine.length()-1-i)) {
				System.out.println("���ǻ���");
				return;
			}
		}
		System.out.println("�ǻ���");
		
		
	}

}
