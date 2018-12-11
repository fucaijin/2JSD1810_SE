package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * �����ַ���
 * String�Ѿ�ʵ����Comparable�ӿ�,����ʱ�ñȽϹ��򲻷������ǵ���������,��ʱ����Ҳ����ʹ�ñȽ������ṩ����ıȽϹ��򲢽�������
 */
public class SortListDemo3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("��������");
		list.add("������");
		list.add("��");
		list.add("һһһһһ");
		System.out.println(list);
		
		Collections.sort(list, new Comparator<String>(){
			public int compare(String str1, String str2){
				return str1.length() - str2.length();
			}
		});
		System.out.println(list);
	}

}
