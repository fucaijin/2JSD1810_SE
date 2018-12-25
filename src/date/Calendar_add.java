package date;

import java.util.Calendar;

/**
 * 使用Calendar计算时间
 * 
 * void add(int field, int amount)
 * 对指定时间分量加上给定的值,若给定的值为负数则是减去
 */
public class Calendar_add {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		/*
		 * 3年2个月零25天以后是哪天
		 */
		
		calendar.add(Calendar.YEAR, 3);//加3年
		calendar.add(Calendar.MONTH, 2);//加2个月
		calendar.add(Calendar.DAY_OF_YEAR, 25);// 加25天 老师要求必须使用Calendar.DAY_OF_YEAR
		System.out.println(calendar.getTime());
		
		// 调整为当周的周三
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		System.out.println(calendar.getTime());
	}
}
