package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ���ϴ�ŵ���Ԫ�ص�Ӧ��
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection<Point> c = new ArrayList<Point>();
		Point p = new Point(1,2);
		c.add(p);
		
		System.out.println("p:" + p);
		System.out.println("c:" + c);
		
		p.setX(5);
		System.out.println("p:" + p);
		System.out.println("c:" + c);
		
	}

}
