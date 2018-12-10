package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ���ϵı���
 * ���ϱ���Ԫ�ز��õ�����ģʽ:
 * Iterator iterator()
 * �÷������Ի�ȡһ������������ǰ����Ԫ�صĵ�����
 * 
 * java.utile.Iterator�ӿ�
 * �������ӿڹ涨�����е�������������Ԫ�ص���ز���,ÿ�����϶��ṩ��
 * һ�����ڱ�������Ԫ�صĵ�����ʵ����.�����������ס���ǵ�����,ֻ������ΪIteratorȥʹ�ü���
 * 
 * ����������������ѭ:��,ȡ,ɾ��˳�����,����ɾ�����Ǳ����
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
		
//		��ȡ�����ü��ϵĵ�����
		Iterator<String> it = c.iterator();
		/*
		 * ��
		 * boolean hasNext()
		 * �жϼ����Ƿ�����һ��Ԫ�ؿ��Ի�ȡ
		 */
		while(it.hasNext()){
			/*
			 * ȡ
			 * E next()
			 * ��ȡ�����е���һ��Ԫ��
			 */
			String next = it.next();
			
			if ("#".equals(next)) {
				/*
				 * �������ڱ���ʱ������ͨ��������������ɾ���,��������쳣 
				 */
				it.remove();
			}
			
			System.out.println(next);
//			System.out.println(it.next());
		}
		
		System.out.println(c);
	}

}
