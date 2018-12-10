package list;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * List�ӿ�
 * List�ӿ���Collection��һ�������ӽӿ�,��ʾ���ظ���,���Ҹü�������.�ص��ǿ���ͨ���±����Ԫ��
 * ����ʵ����:
 * java.util.ArrayList
 * ����ʵ��,��ѯ���ܸ���
 * 
 * java.util.LinkList
 * ����ʵ��,��ɾԪ�����ܸ���,������β��ɾԪ��Ч�����
 * 
 * ������û�м��˿���Ҫ��ʱ,ͨ��ʹ��ArrayList
 *
 */
public class ListDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		/*
		 * E get(int index)
		 * ��ȡָ���±��Ӧ��Ԫ��(List���ж�Setû�еķ���)
		 */
		String str = list.get(1);
		System.out.println(str);
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
		/*
		 * E set(int index, E e)
		 * ������Ԫ�����õ�ָ��λ��,����ֵΪԭλ�ö�Ӧ��Ԫ��.(�滻Ԫ�ز���)
		 */
		String old = list.set(1, "2");
		System.out.println(list);
		System.out.println(old);
	}
}
