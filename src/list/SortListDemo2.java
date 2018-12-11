package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序保存自定义类型元素的集合
 */
public class SortListDemo2 {

	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(1, 2));
		list.add(new Point(7, 8));
		list.add(new Point(1, 6));
		list.add(new Point(5, 0));
		list.add(new Point(4, 8));
		System.out.println(list);

		/*
		 * Collections的该sort方法在排序集合时要求集合元素必须实现Comparable接口并重写其中定义的比较方法。
		 * 否则编译不通过。java API中常见数据类型都实现了该接口，比如包装类和字符串。
		 * 但是我们自定义的元素通常不要去实现该接口，因为当我们使用某个方法时，该方法要求我们为其修改其他额外的代码时，这个方法就具有侵入性，
		 * 这样对程序结构不利，尽量避免使用
		 */
		
		/*
		 * 重载的Collections.sort(List, Comparator)
		 * 该方法要求我们传入要排序的集合外，再额外传入一个比较器,该比较器是用来为集合元素定义的一种比较大小的规则,这样sort方法就会利用给定比较器
		 * 的比较规则对集合元素进行比较大小后进行自然排序了,这也就不再要求集合元素必须去实现接口:Comparable了
		 */
		Comparator<Point> comparator = new Comparator<Point>(){
			/**
			 * 实现Comparator接口后,要求必须重写方法:
			 * compare,该方法用来定义o1,o2的大小关系,返回值为int型,该值不关心具体值,只关注取值范围:
			 * 当返回值>0:表示o1>o2;
			 * 当返回值<0:表示o1<o2;
			 * 当返回值=0:表示两个对象相等
			 */
			public int compare(Point p1, Point p2){
				int x1 = p1.getX();
				int y1 = p1.getY();
				int x2 = p2.getX();
				int y2 = p2.getY();
				return (x1*x1+y1*y1) - (x2*x2+y2*y2);
			}
		};
		Collections.sort(list, comparator);
		
		
		Collections.sort(list, new Comparator<Point>() {
			public int compare(Point p1, Point p2) {
				int x1 = p1.getX();
				int y1 = p1.getY();
				int x2 = p2.getX();
				int y2 = p2.getY();
				return (x1*x1+y1*y1) - (x2*x2+y2*y2);
			}
		});
		
//		一下为lambda表达式的写法,直接用(p1,p2)表示此位置的对象的参数的形参,然后指向要执行的代码或代码块,或返回值
//		Collections.sort(list, (p1, p2)-> {
//				int x1 = p1.getX();
//				int y1 = p1.getY();
//				int x2 = p2.getX();
//				int y2 = p2.getY();
//				return (x1*x1+y1*y1) - (x2*x2+y2*y2);
//			}
//		);
		
		System.out.println(list);
	}

}
