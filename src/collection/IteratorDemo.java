package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合的遍历
 * 集合遍历元素采用迭代器模式:
 * Iterator iterator()
 * 该方法可以获取一个用来遍历当前集合元素的迭代器
 * 
 * java.utile.Iterator接口
 * 迭代器接口规定了所有迭代器遍历集合元素的相关操作,每个集合都提供了
 * 一个用于遍历自身元素的迭代器实现类.而我们无需记住他们的名字,只当他们为Iterator去使用即可
 * 
 * 迭代器遍历集合遵循:问,取,删的顺序遍历,其中删除不是必须的
 */
public class IteratorDemo {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("#");
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		c.add("#");
		
//		获取遍历该集合的迭代器
		Iterator<String> it = c.iterator();
		/*
		 * 问
		 * boolean hasNext()
		 * 判断集合是否还有下一个元素可以获取
		 */
		while(it.hasNext()){
			/*
			 * 取
			 * E next()
			 * 获取集合中的下一个元素
			 */
			String next = it.next();
			
			if ("#".equals(next)) {
				/*
				 * 迭代器在遍历时不允许通过集合自身方法增删查改,否则会抛异常 
				 */
				it.remove();
			}
			
			System.out.println(next);
//			System.out.println(it.next());
		}
		
		System.out.println(c);
	}

}
