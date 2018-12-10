package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JDK5后退出了一个特性:增强for循环,也称为新循环 新循环与传统for循环不同,它是用来遍历集合或数组使用的
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
		 * 遍历集合 
		 */
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/*
		 * 新循环这个特性是java编译器认可,而非虚拟机.编译器在编译源代码时,若发现我们使用新循环遍历数组时,
		 * 会将代码改为普通for循环遍历.
		 * 若发现使用新循环遍历集合,则会改为使用迭代器方式遍历.
		 * 因此要注意,使用新循环遍历集合时,不要通过集合的方法增删元素.
		 */
		for (Object o : c) {
			String str = (String)o;
			System.out.println(str);
		}
	}

}
