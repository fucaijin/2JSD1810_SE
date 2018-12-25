package date;

import java.util.Calendar;

/**
 * ʹ��Calendar����ʱ��
 * 
 * void add(int field, int amount)
 * ��ָ��ʱ��������ϸ�����ֵ,��������ֵΪ�������Ǽ�ȥ
 */
public class Calendar_add {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		/*
		 * 3��2������25���Ժ�������
		 */
		
		calendar.add(Calendar.YEAR, 3);//��3��
		calendar.add(Calendar.MONTH, 2);//��2����
		calendar.add(Calendar.DAY_OF_YEAR, 25);// ��25�� ��ʦҪ�����ʹ��Calendar.DAY_OF_YEAR
		System.out.println(calendar.getTime());
		
		// ����Ϊ���ܵ�����
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		System.out.println(calendar.getTime());
	}
}
