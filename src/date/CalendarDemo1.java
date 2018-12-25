package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar �����࣬������һ�������࣬�涨��������Ĺ��ܶ��塣 ����ʵ����:GregorianCalendar,��:����
 * 
 * Calendar�ǲ���ʱ���API
 *
 */
public class CalendarDemo1 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		// ����ֱ�۷�ӳ����
		System.out.println(calendar);

		/*
		 * Date getTime() ��һ��Dateʵ����ʽ���ص�ǰCalendar��ʾ������
		 */

		Date date = calendar.getTime();
		System.out.println(date);
		
		/*
		 * void setTime(Date date)
		 * ������ǰCalendar��ʾ����Date����ʾ������
		 */
		calendar.setTime(date);
		
	}

}
