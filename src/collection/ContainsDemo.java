package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 判断当前集合是否包含给定元素
 * boolean contains(Objct o)
 * 判断依据是依靠元素自身equals比较的结果
 */
public class ContainsDemo {

	public static void main(String[] args) {
		Collection<Point> c = new ArrayList<Point>();
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(5, 6));
		c.add(new Point(1, 2));
		
		Point p = new Point(1,2);
		System.out.println(c.contains(p));
	}

}
