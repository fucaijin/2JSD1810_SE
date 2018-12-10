package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合操作
 */
public class CollectionDemo4 {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();
		c1.add("java");
		c1.add("c");
		c1.add("c++");
		c1.add("python");
		System.out.println("c1 : " + c1);
		//[java, c, c++, python]
		
		Collection<String> c2 = new HashSet<String>();
		c2.add("php");
		c2.add("js");
		c2.add("java");
		System.out.println("c2 : " + c2);
//		[java, php, js]
		
//		将给定集合中的所有元素添加到当前集合中,即将给定的参数的集合加到当前集合中
		c1.addAll(c2);
		System.out.println("c1 add c2 : " + c1);
//		[java, c, c++, python, java, php, js]
		
//		c2.addAll(c1);
//		System.out.println("c2" + c2);
//		[c++, python, java, c, php, js]
		
		Collection<String> c3 = new ArrayList<String>();
//		c3.add("android");
		c3.add("c++");
		c3.add("php");
		System.out.println("c3 : " + c3);
//		[android, c++, php]
		boolean contains = c1.containsAll(c3);
		System.out.println("c1.contains c3 : " + contains);
		
		/*
		 * 删除交集:将c1中与c3相同元素删除
		 */
		c1.removeAll(c3);
		System.out.println("c1.removeAll(c3) : " + c1);
		
	}

}
