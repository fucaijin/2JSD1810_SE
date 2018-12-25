package date;

import java.util.Calendar;

/**
 * 设置指定的时间分量对应的值
 */
public class Calendar_set {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		calendar.set(Calendar.YEAR, 2008);
		
		calendar.set(Calendar.MONTH, Calendar.AUGUST);//设置为8月,也可以使用数字7进行设置
		/*
		 * set方法有一个注意事项:
		 * 当set设置了两次,而两次影响的时间分量一致时候:
		 * 比如设置了几号后,又设置了周几,这两个看似不同的时间分量影响的都是月中的天.那么后设置的会覆盖之前设置的操作.
		 * 若想他们都起效果,可以在设置一个后调用getTime()方法计算一下修改后的日期,然后再设置另一个.
		 */
		calendar.set(Calendar.DATE, 8);
		// 注释下面的输出语句与不注释效果是不同的.
		System.out.println(calendar.getTime());
		
		// 设置为周三
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		System.out.println(calendar.getTime());
	}

}
