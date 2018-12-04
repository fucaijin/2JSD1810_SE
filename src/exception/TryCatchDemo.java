package exception;

/**
 * java�쳣��������е�try-catch
 * 
 * try{
 * 	���ܳ����쳣�Ĵ���Ƭ��
 * }catch(XXXExeption e){
 * 	������XXXExeption��Ĵ������
 * }
 */
public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		
		try {
//			String str = null;
//			String str = "";
			String str = "a";
			/*
			 * ��JVMִ�й����г���ĳ���쳣ʱ,��ʵ������Ӧ���쳣ʵ��,��������ִ�й������ý�ȥ.
			 * ��ʱ���쳣ʵ����������˵����ǰ���.
			 * ʵ������Ϻ�,JVM�Ὣ���쳣�׳� 
			 */
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			//try�����г���Ĵ�����һ�µ����ݶ�����ִ��
			System.out.println("������,��������");
		} catch (NullPointerException e) {
			System.out.println("�����˿�ָ���쳣");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("�ַ����±�Խ���쳣");
		} catch (Exception e){
			/*
			 * ͨ���������һ��catch�в���Exception,��ֹ��Ϊһ��δ������쳣���³����ж�
			 */
			System.out.println("�����������쳣");
		}
		System.out.println("���������");
	}

}
