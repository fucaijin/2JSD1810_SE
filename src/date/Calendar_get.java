package date;

import java.util.Calendar;

/**
 * Calendar�ṩ�˻�ȡָ��ʱ���������Ӧ��ֵ�ķ���:
 * int get(int field)
 * 
 * intֵ��ʾʱ�����,Calendar�ṩ�˴����ĳ�����֮��Ӧ
 */
public class Calendar_get {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		// ��ȡ��
		int year = calendar.get(Calendar.YEAR);
		
		// ��ȡ��(�·ݵ�ֵ��0��ʼ,��:0��ʾ1��)
		int month = calendar.get(Calendar.MONTH)+1;
		
		/*
		 * ��ȡ��:
		 * ������صĳ���:
		 * DAY_OF_MONTH:���е���
		 * DAY_OF_WEEK:���е���
		 * DAY_OF_YEAR:���е���
		 * DATE:��DAY_OF_MONTHһ��
		 */
		// ��ȡ��
		int day = calendar.get(Calendar.DATE);//����Calendar.DAY_OF_MONTH
		System.out.println(year+"-"+month+"-"+day);
		
		int hour = calendar.get(Calendar.HOUR);//12Сʱ
		int h = calendar.get(Calendar.HOUR_OF_DAY);//24Сʱ��
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		
		System.out.println(h + ":" + m + ":" + s);
		
		// �����ǽ���ĵڼ���?
		int doy = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("�����ǽ���ĵ�" + doy + "��");
		
		// ���������ڼ�?
		int dow = calendar.get(Calendar.DAY_OF_WEEK)-1; // ��ΪĬ����������Ϊһ�ܵĵ�һ��,�����Ҫ-1
		String[] data = {"��", "һ", "��", "��", "��", "��", "��"};
		System.out.println("��������" + data[dow]);
		
		/*
		 * ��ȡָ��ʱ�������������ֵ
		 */
		int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);// ��ȡcalendar�������ݵ�Calendar.DAY_OF_YEAR���Ի�ȡ�������ֵ
		System.out.println("���깲:" + days + "��"); //���깲:365��
		
	}

}
