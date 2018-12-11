package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ���ϵ�����
 * ���ϵĹ�����:java.util.Collections
 * ���ṩ��һ����̬����:sort,���Զ�List���Ͻ�����Ȼ����
 * ��:��С���������
 */
public class SortListDemo1 {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println("��ʼ����");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*100));
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("�������!��ʱ:" + (System.currentTimeMillis()-time) + "ms");
	}

}
