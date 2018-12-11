package list;

import java.util.ArrayList;
import java.util.List;

/**
 * List����֧�ֽ�ȡ�Ӽ�
 * List subList(int start, int end)
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++){
			list.add(i);
		}
		
//		��ȡ2-7��Ԫ��(ʵ���±�Ϊ2-8��ͷ����β)��Ϊ�Ӽ���
		List<Integer> subList = list.subList(2, 8);
		System.out.println(subList);
		
		/*
		 * ���Ӽ���ÿ��Ԫ������10��,��ÿ��Ԫ�س���10
		 */
		for (int i = 0; i < subList.size(); i++) {
			subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);
		System.out.println(list);
		
//		���Ӽ��������Ƕ�ԭ��������Ӧ�Ĳ���
		list.subList(2, 8).clear();
		System.out.println(list);
		
	}
}
