package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 通过数组的工具类Arrays提供的方法:asList()可以将一个数组转换为一个List集合
 */
public class Array2Collection {

	public static void main(String[] args) {
		String[] array = { "one", "two", "three" };
		List<String> list = Arrays.asList(array);
		System.out.println("size:" + list.size());
		System.out.println("list:" + list);

		/*
		 * 对转换过来的集合操作,就是对原数组进行操作
		 */
		System.out.println();
		list.set(1, "2");
		System.out.println("list:" + list);
		System.out.println("array:" + Arrays.toString(array));

		/*
		 * 从数组转换的集合不支持增删元素操作,因为原数组的长度是固定的,无法被改变
		 */
//		list.add("four");// 此行会报错java.lang.UnsupportedOperationException
//		System.out.println("list:" + list);
//		System.out.println("array:" + Arrays.toString(array));
		
		/*
		 * 如果只想改变转换过来的集合,可以使用转换过来的集合再创建一个新集合再操作新集合
		 */
//		List<String> list2 = new ArrayList<String>();
//		list2.addAll(list);
//		以上两行操作等于以下使用构造直接传集合的操作↓↓↓
		
		/*
		 * 所有集合都支持一个参数为集合的构造方法,作用是创建当前集合的同时包含给定集合所有元素
		 */
		List<String> list2 = new ArrayList<String>(list);
		//此处的参数可以传任何的集合包括List和Set.此处的new的对象也可以是任何集合包括List和Set,但是如果是new的set传进list,重复元素会丢失只保留一个
		System.out.println("list2:" + list2);
		list2.add("four");
		System.out.println("list2:" + list2);
	}

}
