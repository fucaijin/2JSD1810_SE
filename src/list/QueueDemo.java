package list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ����
 * java.util.Queue�ӿ�,�ýӿ��Ƕ��нӿ�,�涨�˶��о��е���ط���.
 * Queue�ӿڼ̳���Collection,����ͬʱ�߱����ϵ���ط���.
 * 
 * ���п��Ա���һ��Ԫ��,���Ǵ�ȡԪ�ر�����ѭ�Ƚ��ȳ�ԭ��.
 * ����ʵ����:java.util.LinkedList
 */
public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		/*
		 * offerΪ��Ӳ���,��Ԫ����ӵ�����ĩβ
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		
		/*
		 * E poll()
		 * ���Ӳ���,��ȡ����Ԫ��,��ȡ���Ԫ�ؼ��Ӷ����б�ɾ��
		 */
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * peek���������ö���Ԫ��,��ȡ���Ԫ����Ȼ�ڶ�����
		 */
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * ʹ�õ�����������ҪӰ�����Ԫ��
		 */
		for (String string : queue) {
			System.out.println(string);
		}
		System.out.println(queue);
		
		/*
		 * ʹ��poll��ʽ��������,���ַ�ʽ��������о�û��Ԫ����
		 */
		while (queue.size() > 0) System.out.println(queue.poll());
		System.out.println(queue);
	}

}
