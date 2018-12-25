package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * �вη���
 */
public class LambdaDemo2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("��С��ͯ");
		list.add("��ɮ");
		list.add("��˽�");
		System.out.println(list);
		
//		����һ
		Collections.sort(list, new Comparator<String>(){
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		System.out.println(list);
		
//		�����
		Comparator<String> comparator = (o1,o2)->{return o1.length()-o2.length();};
		Collections.sort(list,comparator);
		System.out.println(list);
		
//		������
		Comparator<String> comparator2 = (o1,o2)->o1.length()-o2.length();//�����Ҫ�����ţ�returnҲ����д������ᱨ��
		Collections.sort(list,comparator2);
		System.out.println(list);
//		
//		������
		Collections.sort(list, (o1,o2)->{return o1.length()-o2.length();});
		System.out.println(list);
//		
//		������
		Collections.sort(list, (o1,o2)->o1.length()-o2.length());//�����Ҫ�����ţ�returnҲ����д������ᱨ��
		System.out.println(list);
	}

}
