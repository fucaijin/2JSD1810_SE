package date;

import java.util.Calendar;

/**
 * ����ָ����ʱ�������Ӧ��ֵ
 */
public class Calendar_set {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		calendar.set(Calendar.YEAR, 2008);
		
		calendar.set(Calendar.MONTH, Calendar.AUGUST);//����Ϊ8��,Ҳ����ʹ������7��������
		/*
		 * set������һ��ע������:
		 * ��set����������,������Ӱ���ʱ�����һ��ʱ��:
		 * ���������˼��ź�,���������ܼ�,���������Ʋ�ͬ��ʱ�����Ӱ��Ķ������е���.��ô�����õĻḲ��֮ǰ���õĲ���.
		 * �������Ƕ���Ч��,����������һ�������getTime()��������һ���޸ĺ������,Ȼ����������һ��.
		 */
		calendar.set(Calendar.DATE, 8);
		// ע��������������벻ע��Ч���ǲ�ͬ��.
		System.out.println(calendar.getTime());
		
		// ����Ϊ����
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		System.out.println(calendar.getTime());
	}

}
