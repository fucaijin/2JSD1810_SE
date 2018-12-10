package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 删除集合元素
 */
public class RemoveDemo {

	public static void main(String[] args) {
		Collection<Point> c = new ArrayList<Point>();
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(5, 6));
		c.add(new Point(1, 2));
		Point p = new Point(1,2);
		System.out.println("p:" + p);
		System.out.println("c:" + c);
		
		/*
		 * 集合的remove方法是删除集合中给定元素equals比较为true的元素
		 */
		c.remove(p);
		System.out.println("c:" + c);
		
	}

}
