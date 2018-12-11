package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 集合的排序
 * 集合的工具类:java.util.Collections
 * 其提供了一个静态方法:sort,可以对List集合进行自然排序
 * 即:从小到大的排序
 */
public class SortListDemo1 {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println("开始生成");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*100));
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("排序完毕!用时:" + (System.currentTimeMillis()-time) + "ms");
	}

}
