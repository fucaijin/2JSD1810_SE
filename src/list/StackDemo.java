package list;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ
 * ˫�˶�����ֻ��һ���������Ӳ���ʱ,���γ���ջ�ṹ.ջ�ṹ��ȡԪ����ѭ�Ƚ����ԭ��.
 * ͨ������ʹ��ջ�����"����"�����Ĺ���
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
