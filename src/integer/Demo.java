package integer;

/**
 * JDK5����ʱ���Ƴ���һ������:�Զ���װ��
 * ����������ڱ���Դ����ʱ����������������������֮�以�ำֵʱ��ȫ�����Զ�����ת��
 */
public class Demo {

	public static void main(String[] args) {
		int i = new Integer(1); // �����˱������Զ���װ�����ԡ��������ڴ���ʱ�����Զ�תΪint i = new Integer(1).intValue();
		Integer d = i;			// �������ڴ��У����Զ�תΪInteger d = Integer.valueOf(d);
		
		System.out.println(i);
		System.out.println(d);
	}
}
