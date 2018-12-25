package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar 日历类，本身是一个抽象类，规定了日历类的功能定义。 常用实现类:GregorianCalendar,即:阳历
 * 
 * Calendar是操作时间的API
 *
 */
public class CalendarDemo1 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		// 不能直观反映日期
		System.out.println(calendar);

		/*
		 * Date getTime() 以一个Date实例形式返回当前Calendar表示的日期
		 */

		Date date = calendar.getTime();
		System.out.println(date);
		
		/*
		 * void setTime(Date date)
		 * 调整当前Calendar表示给定Date所表示的日期
		 */
		calendar.setTime(date);
		
	}

}
