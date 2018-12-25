package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ������Ʒ��������
 * ����������,Ҫ���û�������Ʒ��������,��ʽ:yyyy-MM-dd
 * Ȼ�������뱣���ڵ�����.
 * ��������������������Ʒ�Ĵ�������,��ʽ:yyyy-MM-dd
 * 
 * ����:
 * ��Ʒ����ǰ���ܵ�����
 */
public class Test2 {

	public static void main(String[] args) throws ParseException {
		Scanner scn = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("��������Ʒ����������(��ʽΪ:yyyy-MM-dd):");
		String dateOfManufactureStr = scn.nextLine();
		Date dateOfManufacture = sdf.parse(dateOfManufactureStr);
		calendar.setTime(dateOfManufacture);
		
		System.out.println("�����뱣���ڵ�����");
		int expirationDays = Integer.parseInt(scn.nextLine());
		calendar.add(Calendar.DAY_OF_YEAR, expirationDays);
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		System.out.println("���������� :" + sdf.format(calendar.getTime()));//2018-05-15  180   Thu Nov 01 00:00:00 CST 2018
		
//		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
//		System.out.println("���������� :" + sdf.format(calendar.getTime()));//2018-05-15  180   Thu Nov 01 00:00:00 CST 2018
		
		scn.close();
	}

}
