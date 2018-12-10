package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * �����ڼ�����ʹ�ù㷺,�������ڼ�����������Լ�����ϵ�Ԫ�����͵�
 */
public class CollectionDemo3 {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");

		System.out.println(c);

		// ������ָ���ķ���������ļ���һ�¼���
		Iterator<String> it = c.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}

		// ��ѭ��������Ҫ��Object����Ԫ��
		for (String str : c) {
			System.out.println(str);
		}

	}

}
