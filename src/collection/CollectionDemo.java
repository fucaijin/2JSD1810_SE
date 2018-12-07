package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ���Ͽ��
 * java.util.Collection�ӿ�
 * Collection�����м��ϵĶ����ӿ�,����涨�����м��϶�����߱��ķ���
 * 
 * ����������һ������������һ��Ԫ��,���Ǽ����ṩ�˲���Ԫ�ص���ط���,ʹ�ø����
 * Collection�����������������ӽӿ�:
 * java.util.List:���ظ�����
 * java.util.Set:�����ظ�����
 * �ظ�ָ����Ԫ���Ƿ�����ظ�,�ظ�Ԫ�ص��ж������ǿ�Ԫ������equal�ȽϵĽ��.
 */
public class CollectionDemo {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		
		/*
		 * boolean add(E e)
		 * ��ǰ��������Ӹ���Ԫ��,�ɹ���Ӻ󷵻�true
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
		/*
		 * int size()
		 * ���ص�ǰ����Ԫ�ظ���
		 */
		int size = c.size();
		System.out.println(size);
		
		/*
		 * boolean isEmpty()
		 * �жϸü����Ƿ�Ϊ�ռ�(�������κ�Ԫ��)
		 */
		boolean empty = c.isEmpty();
		System.out.println("isEmpty:" + empty);
		
		/*
		 * boolean isEmpty()
		 * ���(�������κ�Ԫ��)
		 */
		c.clear();
		System.out.println(c);
		System.out.println(c.size());
		System.out.println("isEmpty:" + c.isEmpty());
		
	}

}
