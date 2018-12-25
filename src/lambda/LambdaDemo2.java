package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 有参方法
 */
public class LambdaDemo2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("六小龄童");
		list.add("唐僧");
		list.add("猪八戒");
		System.out.println(list);
		
//		排序一
		Collections.sort(list, new Comparator<String>(){
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		System.out.println(list);
		
//		排序二
		Comparator<String> comparator = (o1,o2)->{return o1.length()-o2.length();};
		Collections.sort(list,comparator);
		System.out.println(list);
		
//		排序三
		Comparator<String> comparator2 = (o1,o2)->o1.length()-o2.length();//如果不要大括号，return也不能写，否则会报错
		Collections.sort(list,comparator2);
		System.out.println(list);
//		
//		排序四
		Collections.sort(list, (o1,o2)->{return o1.length()-o2.length();});
		System.out.println(list);
//		
//		排序五
		Collections.sort(list, (o1,o2)->o1.length()-o2.length());//如果不要大括号，return也不能写，否则会报错
		System.out.println(list);
	}

}
