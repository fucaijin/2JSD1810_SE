package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * �жϵ�ǰ�����Ƿ��������Ԫ��
 * boolean contains(Objct o)
 * �ж�����������Ԫ������equals�ȽϵĽ��
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
