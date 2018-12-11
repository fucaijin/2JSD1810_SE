package list;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列
 * java.util.Deque接口,该接口继承自Queue
 * 双端队列是两端都可以做出入队操作的队列.
 * 常用实现类:java.util.LinkedList
 */
public class DequeDemo {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.offer("one");
		deque.offer("two");
		deque.offer("three");
		System.out.println(deque);
		
		deque.offerFirst("four");
		System.out.println(deque);
		
		deque.offerLast("Five");
		System.out.println(deque);
		
		String pollFirst = deque.pollFirst();
		System.out.println(pollFirst);
		System.out.println(deque);
		
		String pollLast = deque.pollLast();
		System.out.println(pollLast);
		System.out.println(deque);
		
	}

}
