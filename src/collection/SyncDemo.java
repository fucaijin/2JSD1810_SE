package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * �̰߳�ȫ�ļ���
 * ���ϵĹ�����:java.util.Collections�ṩ��һ�龲̬�ķ���,���Խ���������ת��Ϊ�̰߳�ȫ��
 * 
 * ���ǳ��õļ���ʵ����:ArrayList,LinkedList,HashSet���Ƕ������̰߳�ȫ��,������ڲ�������ʱ,Ҫ������ת��
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
		 * ��������list����ת��Ϊ�̰߳�ȫ��
		 */
		list = Collections.synchronizedList(list);
		System.out.println(list);
		
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);
		
		/*
		 * ��������set����ת��Ϊ�̰߳�ȫ��
		 */
		set = Collections.synchronizedSet(set);
		System.out.println(set);
		
		/*
		 * API�ֲ�Ҳ��˵����һ���̰߳�ȫ�ļ���Ҳ����������������ϵĲ������⣬
		 * ���������߳�ͬʱ�������ϱ�������ɾԪ��ʱ����Ҫ����ά������֮��Ļ����ϵ���ɲο�������Server�˲��� 
		 */
	}

}
