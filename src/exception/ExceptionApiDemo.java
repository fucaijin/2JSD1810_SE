package exception;

/**
 * �쳣���÷���
 *
 */
public class ExceptionApiDemo {

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			System.out.println("������");
//			��������ջ��Ϣ,���������ǽ������
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("���������");
	}

}
