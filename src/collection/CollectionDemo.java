package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合框架
 * java.util.Collection接口
 * Collection是所有集合的顶级接口,里面规定了所有集合都必须具备的方法
 * 
 * 集合与数组一样都用来保存一组元素,但是集合提供了操作元素的相关方法,使用更便捷
 * Collection下面有两个常见的子接口:
 * java.util.List:可重复集合
 * java.util.Set:不可重复集合
 * 重复指的是元素是否可以重复,重复元素的判断依据是靠元素自身equal比较的结果.
 */
public class CollectionDemo {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		
		/*
		 * boolean add(E e)
		 * 向当前集合中添加给定元素,成功添加后返回true
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
		/*
		 * int size()
		 * 返回当前集合元素个数
		 */
		int size = c.size();
		System.out.println(size);
		
		/*
		 * boolean isEmpty()
		 * 判断该集合是否为空集(不含有任何元素)
		 */
		boolean empty = c.isEmpty();
		System.out.println("isEmpty:" + empty);
		
		/*
		 * boolean isEmpty()
		 * 清空(不含有任何元素)
		 */
		c.clear();
		System.out.println(c);
		System.out.println(c.size());
		System.out.println("isEmpty:" + c.isEmpty());
		
	}

}
