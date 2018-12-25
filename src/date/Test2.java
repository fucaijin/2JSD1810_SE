package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算商品促销日期
 * 程序启动后,要求用户输入商品生产日期,格式:yyyy-MM-dd
 * 然后再输入保质期的天数.
 * 经过程序运算后输出该商品的促销日期,格式:yyyy-MM-dd
 * 
 * 规则:
 * 商品过期前两周的周三
 */
public class Test2 {

	public static void main(String[] args) throws ParseException {
		Scanner scn = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("请输入商品的生产日期(格式为:yyyy-MM-dd):");
		String dateOfManufactureStr = scn.nextLine();
		Date dateOfManufacture = sdf.parse(dateOfManufactureStr);
		calendar.setTime(dateOfManufacture);
		
		System.out.println("请输入保质期的天数");
		int expirationDays = Integer.parseInt(scn.nextLine());
		calendar.add(Calendar.DAY_OF_YEAR, expirationDays);
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		System.out.println("促销日期是 :" + sdf.format(calendar.getTime()));//2018-05-15  180   Thu Nov 01 00:00:00 CST 2018
		
//		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
//		System.out.println("促销日期是 :" + sdf.format(calendar.getTime()));//2018-05-15  180   Thu Nov 01 00:00:00 CST 2018
		
		scn.close();
	}

}
