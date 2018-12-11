package list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列
 * java.util.Queue接口,该接口是队列接口,规定了队列具有的相关方法.
 * Queue接口继承自Collection,所以同时具备集合的相关方法.
 * 
 * 队列可以保存一组元素,但是存取元素必须遵循先进先出原则.
 * 常用实现类:java.util.LinkedList
 */
public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		/*
		 * offer为入队操作,将元素添加到队列末尾
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		
		/*
		 * E poll()
		 * 出队操作,获取队首元素,获取后该元素即从队列中被删除
		 */
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * peek方法是引用队首元素,获取后该元素依然在队列中
		 */
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * 使用迭代器遍历不要影响队列元素
		 */
		for (String string : queue) {
			System.out.println(string);
		}
		System.out.println(queue);
		
		/*
		 * 使用poll方式遍历队列,这种方式遍历后队列就没有元素了
		 */
		while (queue.size() > 0) System.out.println(queue.poll());
		System.out.println(queue);
	}

}
