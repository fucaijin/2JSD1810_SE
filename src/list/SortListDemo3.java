package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序字符串
 * String已经实现了Comparable接口,但有时该比较规则不符合我们的排序需求,这时我们也可以使用比较器来提供额外的比较规则并进行排序
 */
public class SortListDemo3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("流流");
		list.add("无无无无");
		list.add("二二二");
		list.add("三");
		list.add("一一一一一");
		System.out.println(list);
		
		Collections.sort(list, new Comparator<String>(){
			public int compare(String str1, String str2){
				return str1.length() - str2.length();
			}
		});
		System.out.println(list);
	}

}
