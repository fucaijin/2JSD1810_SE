package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ͨ������Ĺ�����Arrays�ṩ�ķ���:asList()���Խ�һ������ת��Ϊһ��List����
 */
public class Array2Collection {

	public static void main(String[] args) {
		String[] array = { "one", "two", "three" };
		List<String> list = Arrays.asList(array);
		System.out.println("size:" + list.size());
		System.out.println("list:" + list);

		/*
		 * ��ת�������ļ��ϲ���,���Ƕ�ԭ������в���
		 */
		System.out.println();
		list.set(1, "2");
		System.out.println("list:" + list);
		System.out.println("array:" + Arrays.toString(array));

		/*
		 * ������ת���ļ��ϲ�֧����ɾԪ�ز���,��Ϊԭ����ĳ����ǹ̶���,�޷����ı�
		 */
//		list.add("four");// ���лᱨ��java.lang.UnsupportedOperationException
//		System.out.println("list:" + list);
//		System.out.println("array:" + Arrays.toString(array));
		
		/*
		 * ���ֻ��ı�ת�������ļ���,����ʹ��ת�������ļ����ٴ���һ���¼����ٲ����¼���
		 */
//		List<String> list2 = new ArrayList<String>();
//		list2.addAll(list);
//		�������в�����������ʹ�ù���ֱ�Ӵ����ϵĲ���������
		
		/*
		 * ���м��϶�֧��һ������Ϊ���ϵĹ��췽��,�����Ǵ�����ǰ���ϵ�ͬʱ����������������Ԫ��
		 */
		List<String> list2 = new ArrayList<String>(list);
		//�˴��Ĳ������Դ��κεļ��ϰ���List��Set.�˴���new�Ķ���Ҳ�������κμ��ϰ���List��Set,���������new��set����list,�ظ�Ԫ�ػᶪʧֻ����һ��
		System.out.println("list2:" + list2);
		list2.add("four");
		System.out.println("list2:" + list2);
	}

}
