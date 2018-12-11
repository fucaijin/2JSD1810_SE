package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 线程安全的集合
 * 集合的工具类:java.util.Collections提供了一组静态的方法,可以将给定集合转换为线程安全的
 * 
 * 我们常用的集合实现类:ArrayList,LinkedList,HashSet它们都不是线程安全的,如果存在并发访问时,要将他们转换
 *
 */
public class SyncDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("seven");
		System.out.println(list);
		
		/*
		 * 将给定的list集合转换为线程安全的
		 */
		list = Collections.synchronizedList(list);
		System.out.println(list);
		
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);
		
		/*
		 * 将给定的set集合转换为线程安全的
		 */
		set = Collections.synchronizedSet(set);
		System.out.println(set);
		
		/*
		 * API手册也有说明，一个线程安全的集合也不与迭代器遍历集合的操作互斥，
		 * 所以若多线程同时操作集合遍历和增删元素时，需要自行维护他们之间的互斥关系。可参考聊天室Server端操作 
		 */
	}

}
