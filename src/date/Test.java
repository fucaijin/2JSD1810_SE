package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 程序启动后要求输入用户的生日,格式:yyyy-MM-dd
 * 然后经过程序运算输出到今天为止一共活了多少天?
 * 在输出该用户出生10000天的纪念日为哪天?格式:yyyy-MM-dd
 */
public class Test {

	public static void main(String[] args) throws ParseException {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("请输入你的生日日期(格式为:yyyy-MM-dd)");
//		String inputLine = scn.nextLine();
//		scn.close();
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		
//		Date birthDate = sdf.parse(inputLine);
//		long birthLongTime = birthDate.getTime();
//		
//		long nowLongTime = new Date().getTime();
//		
//		System.out.println((nowLongTime - birthLongTime)/1000/60/60/24);// 从出生到现在一共活了多少天
//		
//		birthDate.setTime(birthLongTime + 10000L*1000*60*60*24);// 设置出生后10000天后的时间
//		
//		String format = sdf.format(birthDate);
//		System.out.println(format);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("请输入您的生日:");
		String birthStr = scn.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birth = sdf.parse(birthStr);
		Date now = new Date();
		long time = now.getTime() - birth.getTime();
		time = time/1000/60/60/24;
		if (time<0) {
			System.out.println("您还有" + (-time) + "天出生");
		}else{
			System.out.println("恭喜您已经活了:" + time + "天!请继续保持!");
		}
		//计算10000天纪念日的日期
		time = birth.getTime()+1000L*60*60*24*10000;
		Date date = new Date(time);
		String str = sdf.format(date);
		System.out.println("您出生10000天的纪念日为:" + str);
		
		scn.close();
	}

}
