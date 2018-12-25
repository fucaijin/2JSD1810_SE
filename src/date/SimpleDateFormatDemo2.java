package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将一个字符串解析为Date
 */
public class SimpleDateFormatDemo2 {

	public static void main(String[] args) throws ParseException {
		String str = "2009-09-09 19:09:09";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(str);
		System.out.println(date);
	}

}
