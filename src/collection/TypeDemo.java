package collection;

public class TypeDemo {

	public static void main(String[] args) {
		/*
		 * ʹ�÷���ʱ,����������������:
		 * 1.�ڸ��������͸�ֵʱ,�����������ֵ�����Ƿ���Ϸ���Ҫ��.
		 * ����:
		 * t1.setX(2)
		 * ����t1����,���ڷ���ָ��ΪInteger,��˱���������setX()���ݵĲ����Ƿ�Ϊ����,�������������ͨ��
		 * 
		 * 2.�ڻ�ȡ�������͵�ֵʱ,������������������͵Ĵ��뽫��ת��Ϊ����ָ������
		 * int x1 = t1.getX()
		 * ʵ�ʱ������Ϊ
		 * int x1 = (Integer)t1.getX();
		 * ��Ȼ���ﻹ�Զ����Զ���װ��,����ʵ�ʸ�Ϊ��
		 * int x1 = ((Integer)t1.getX()).intValue();
		 */
		Type<Integer> t1 = new Type<Integer>(1,2);
		t1.setX(5);
		Integer x = t1.getX();
		System.out.println("x1:" + x);
		System.out.println("t1:" + t1);
		
		System.out.println();
		
		Type<Double> t2 = new Type<Double>(1.1, 2.2);
		t2.setX(5.5);
		Double x2 = t2.getX();
		System.out.println("x2:" + x2);
		System.out.println("t2:" + t2);
		
		System.out.println();

		Type<String> t3 = new Type<String>("һ","��");
		t3.setX("��");
		String x3 = t3.getX();
		System.out.println("x3:" + x3);
		System.out.println("t3:" + t3);
	}

}
