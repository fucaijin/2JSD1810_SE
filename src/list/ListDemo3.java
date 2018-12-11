package list;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合支持截取子集
 * List subList(int start, int end)
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++){
			list.add(i);
		}
		
//		获取2-7的元素(实际下标为2-8含头不含尾)作为子集合
		List<Integer> subList = list.subList(2, 8);
		System.out.println(subList);
		
		/*
		 * 将子集中每个元素扩大10倍,即每个元素乘以10
		 */
		for (int i = 0; i < subList.size(); i++) {
			subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);
		System.out.println(list);
		
//		对子集操作就是对原集合做对应的操作
		list.subList(2, 8).clear();
		System.out.println(list);
		
	}
}
