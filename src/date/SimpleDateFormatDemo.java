package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 可以在String和Date之间转换
 *
 */
public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//2018-12-21 10:38:13
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a E");//2018-12-21 10:38:13 上午 星期五
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  第HH小时mm分钟ss秒 a E");//2018年12月21日  第10小时39分钟27秒 上午 星期五
		/*
		 * String format(Date date)
		 * 将指定的日期对象按照指定格式化为字符串
		 */
		String time = sdf.format(now);
		System.out.println(time);
	}

}
