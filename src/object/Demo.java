package object;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		int x = p1.getX();
		int Y = p1.getY();

		/*
		 * Object��toString�����������ͼ�ǽ���ǰ��ʵ��ת��Ϊһ���ַ�����
		 * Object�Ѿ�ʵ����toString������Ĭ�Ϸ��ص�ǰ����ľ��(������@��ַ)��
		 * ��ʵ���϶����ǵĿ���û��ʲô���������ͨ�����Ƕ�����д�ⷽ����
		 * ע��java��������඼�Ѿ�ʵ����toString������ֻ�������Լ�������������� Ҫʹ�ø÷�����Ҫ������д
		 */
		String string = p1.toString();
		System.out.println(string);

		/*
		 * System.out.println(Object o); �÷����Ὣ��������toString�������ص��ַ��� ���������̨
		 */
		System.out.println(p1);

		
		/*
		 * һ�����������ں��ַ������Ӳ���ʱ��
		 * Ҳ���ȵ��ø��������͵�toString��������ת��Ϊ�ַ�����ź��ַ��������Ӳ�����
		 */
		string = "point" + p1; // �˲�point�����Զ�����point��toString()����
		System.out.println(string);
		
		Point[] arr = {new Point(1, 2), new Point(5, 6), new Point(9, 4)};
		System.out.println(Arrays.toString(arr));
		
		Point p2 = new Point(1, 2);
		System.out.println("p1==p2 : " + ( p1 == p2 ));
		System.out.println("p1.equals(p2) : " + p1.equals(p2));
		
	}
}
