package exception;

/*
 * finally����������
 * 1.��ֱ�˵��:final\finally\finalize?
 * final���ε���\����\����
 * finally���쳣��
 * finalize:��Object�еķ���,�˷����ڱ�GC����ǰ�ᱻ����(ֻ�ᱻ����һ��),ͨ��������д�˷���,
 * �������д�˷���,�����ڲ�Ӧ�к�ʱ����,��Ȼ���������ղ���,��Ӱ��GC�Ļ��չ���.GC�ͻ�һֱ�����ڴ˴�,����������������޷�����.
 * 2.������Ĵ���
 */
public class FinallyDemo3 {

	public static void main(String[] args) {
		System.out.println(test("0") + "," + test(null) + "," + test(""));// ��Ϊ3,3,3
	}

	public static int test(String str) {
		// �����finally,��ô�ض�����finally.���finally��return,
		// ��ô����try��catch���return���ᱻfinally��return����
		try {
			System.out.println("test:" + str);
			return str.charAt(0) - '0'; // char��char�������תΪintֵ��������
		} catch (NullPointerException e) {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}

}
