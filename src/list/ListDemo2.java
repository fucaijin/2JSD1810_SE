package list;

import java.util.ArrayList;
import java.util.List;

/**
 * List�ṩ��һ�����ص�add,remove����
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		
		/*
		 * void add(int index, E e)
		 * ������Ԫ�ز��뵽ָ��λ��
		 */
		list.add(1,"2");
		System.out.println(list);
		
		/*
		 * E remove(int index)
		 * ɾ��������ָ��λ�õ�Ԫ��
		 */
		String old = list.remove(1);
		System.out.println(list);
		System.out.println(old);
		
	}
}
