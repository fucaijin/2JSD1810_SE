package exception;

/**
 * finally��
 * finally�����쳣������Ƶ����һ��.������ֱ�Ӹ���try����֮��,
 * �������һ��catch��֮��.
 * finally��ȷ��ֻҪ����ִ�е�try������,����try�����еĴ����Ƿ��׳��쳣,finally���еĴ���ض�ִ��.
 * ͨ���Ὣ�޹غ��������Ҫִ�еĴ����������.������Դ���ͷŲ���:IO������Ĺرյ�
 */
public class FinallyDemo1 {

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str = null;
//			String str = "";
			System.out.println(str.length());
			return;
		} catch(Exception e){
			System.out.println("���������");
		}finally {
			System.out.println("����finally��");
		}
		System.out.println("���������");
	}

}
