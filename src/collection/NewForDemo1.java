package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JDK5���˳���һ������:��ǿforѭ��,Ҳ��Ϊ��ѭ�� ��ѭ���봫ͳforѭ����ͬ,���������������ϻ�����ʹ�õ�
 *
 */
public class NewForDemo1 {

	public static void main(String[] args) {

		String[] arr = { "one", "two", "three", "four", "five" };
		
		for(int i = 0; i < arr.length;i++){
			String str = arr[i];
			System.out.println(str);
		}
		System.out.println("-----------------------------");
		
		for (String string : arr) {
			System.out.println(string);
		}
		
		System.out.println("=============================");
		
		/*
		 * �������� 
		 */
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/*
		 * ��ѭ�����������java�������Ͽ�,���������.�������ڱ���Դ����ʱ,����������ʹ����ѭ����������ʱ,
		 * �Ὣ�����Ϊ��ͨforѭ������.
		 * ������ʹ����ѭ����������,����Ϊʹ�õ�������ʽ����.
		 * ���Ҫע��,ʹ����ѭ����������ʱ,��Ҫͨ�����ϵķ�����ɾԪ��.
		 */
		for (Object o : c) {
			String str = (String)o;
			System.out.println(str);
		}
	}

}
