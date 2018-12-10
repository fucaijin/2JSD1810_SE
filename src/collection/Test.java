package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * √Ê ‘Ã‚,ƒ⁄¥Êª≠Õº
 *
 */
public class Test {

	public static void main(String[] args) {
		int a = 1;
		String b = "hello";
		Point p = new Point(a, 2);
		Collection<Point> c = new ArrayList<Point>();
		c.add(p);
		test(a,b,p,c);
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("p:" + p);
		System.out.println("c:" + c);
	}

	public static void test(int a, String b, Point p, Collection<Point> c) {
		a = a + 1;
		b = b + "world";
		p.setX(3);
		p = new Point(5, 6);
		p.setX(7);
		c.clear();
		c.add(p);
		c = new ArrayList<Point>();
		c.add(new Point(9,0));
		p.setX(a);
	}

}
