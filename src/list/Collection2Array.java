package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转换为数组
 * Collection接口提供了一个方法:toArray,可以将当前集合转换为一个数组.任何集合都可以转换为数组
 */
public class Collection2Array {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		
		System.out.println(c);
		
		String[] arr = c.toArray(new String[c.size()]);
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
	}

}
