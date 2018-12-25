package date;

import java.util.Date;

/**
 * java.util.Date
 * Date的每一个实例用于表示一个具体的时间,内部维护一个long值,表示自1970年1月1日 00:00:00到该Date表示的时间所经过的毫秒
 * 由于Date存在时区问题和千年虫问题,因此大部分操作时间的方法都被声明为过时的(不再建议使用了)
 */
public class DateDemo {
	public static void main(String[] args){
		Date now = new Date();
		System.out.println(now);
		
		long longTime = now.getTime();
		System.out.println(longTime);
		
		now.setTime(0);
		System.out.println(now);
	}
}
