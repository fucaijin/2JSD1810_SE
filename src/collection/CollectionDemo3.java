package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型在集合中使用广泛,而泛型在集合中是用来约束集合的元素类型的
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

		// 迭代器指定的泛型与遍历的集合一致即可
		Iterator<String> it = c.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}

		// 新循环不再需要用Object接收元素
		for (String str : c) {
			System.out.println(str);
		}

	}

}
