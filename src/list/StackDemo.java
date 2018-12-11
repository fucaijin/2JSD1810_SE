package list;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈
 * 双端队列若只从一端做进出队操作时,就形成了栈结构.栈结构存取元素遵循先进后出原则.
 * 通常我们使用栈是完成"后退"这样的功能
 *
 */
public class StackDemo {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.push("one");
		deque.push("two");
		deque.push("three");
		deque.push("four");
		System.out.println(deque);
		
		String pop = deque.pop();
		System.out.println(pop);
		System.out.println(deque);
		
		for (String string : deque) {
			System.out.println(string);
		}
		
		while(deque.size()>0){
			System.out.println(deque.pop());
		}
		System.out.println(deque);
	}

}
