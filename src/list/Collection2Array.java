package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * ����ת��Ϊ����
 * Collection�ӿ��ṩ��һ������:toArray,���Խ���ǰ����ת��Ϊһ������.�κμ��϶�����ת��Ϊ����
 */
public class Collection2Array {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		
		System.out.println(c);
		
		String[] arr = c.toArray(new String[c.size()]);
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
	}

}
