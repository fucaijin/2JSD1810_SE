package collection;

/**
 * ������ʹ��ʱ���Բ�ָ��,����ָ����Ĭ��Ϊԭ��Object
 * ��ͨ���з��͵ĵط���Ӧ��ָ�����͵�ʵ������
 */
public class TypeDemo2 {

	public static void main(String[] args) {
		Type<Integer> t1 = new Type<Integer>(1, 2);
		t1.setX(2);
		Integer x1 = t1.getX();
		System.out.println("x1:" + x1);
		System.out.println("t1:" + t1);
		
		Type t2 = t1;
		t2.setX("һ");
		Object x2 = t2.getX();
		System.out.println("x2:" + x2);
		System.out.println("t2:" + t2);
		
		System.out.println("t1:" + t1);
		
		x1 = t1.getX();	//�˲����������쳣(������ʱ���׳��쳣)
		System.out.println("x1:" + x1);
		System.out.println("t1:" + t1);
	}

}
