package list;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * List接口
 * List接口是Collection的一个常用子接口,表示可重复集,并且该集合有序.特点是可以通过下标操作元素
 * 常见实现类:
 * java.util.ArrayList
 * 数组实现,查询性能更好
 * 
 * java.util.LinkList
 * 链表实现,增删元素性能更好,尤其首尾增删元素效率最佳
 * 
 * 对性能没有极端苛刻要求时,通常使用ArrayList
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
		 * 获取指定下标对应的元素(List特有而Set没有的方法)
		 */
		String str = list.get(1);
		System.out.println(str);
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
		/*
		 * E set(int index, E e)
		 * 将给定元素设置到指定位置,返回值为原位置对应的元素.(替换元素操作)
		 */
		String old = list.set(1, "2");
		System.out.println(list);
		System.out.println(old);
	}
}
