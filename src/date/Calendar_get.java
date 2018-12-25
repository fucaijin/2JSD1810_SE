package date;

import java.util.Calendar;

/**
 * Calendar提供了获取指定时间分量所对应的值的方法:
 * int get(int field)
 * 
 * int值表示时间分量,Calendar提供了大量的常量与之对应
 */
public class Calendar_get {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		// 获取年
		int year = calendar.get(Calendar.YEAR);
		
		// 获取月(月份的值从0开始,即:0表示1月)
		int month = calendar.get(Calendar.MONTH)+1;
		
		/*
		 * 获取日:
		 * 和天相关的常量:
		 * DAY_OF_MONTH:月中的天
		 * DAY_OF_WEEK:周中的天
		 * DAY_OF_YEAR:年中的天
		 * DATE:与DAY_OF_MONTH一致
		 */
		// 获取日
		int day = calendar.get(Calendar.DATE);//或者Calendar.DAY_OF_MONTH
		System.out.println(year+"-"+month+"-"+day);
		
		int hour = calendar.get(Calendar.HOUR);//12小时
		int h = calendar.get(Calendar.HOUR_OF_DAY);//24小时制
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		
		System.out.println(h + ":" + m + ":" + s);
		
		// 今天是今年的第几天?
		int doy = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的第" + doy + "天");
		
		// 今年是星期几?
		int dow = calendar.get(Calendar.DAY_OF_WEEK)-1; // 因为默认是以周日为一周的第一天,因此需要-1
		String[] data = {"日", "一", "二", "三", "四", "五", "六"};
		System.out.println("今天是周" + data[dow]);
		
		/*
		 * 获取指定时间分量允许的最大值
		 */
		int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);// 获取calendar对象的年份的Calendar.DAY_OF_YEAR可以获取到的最大值
		System.out.println("今年共:" + days + "天"); //今年共:365天
		
	}

}
