package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ����������Ҫ�������û�������,��ʽ:yyyy-MM-dd
 * Ȼ�󾭹������������������Ϊֹһ�����˶�����?
 * ��������û�����10000��ļ�����Ϊ����?��ʽ:yyyy-MM-dd
 */
public class Test {

	public static void main(String[] args) throws ParseException {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("�����������������(��ʽΪ:yyyy-MM-dd)");
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
//		System.out.println((nowLongTime - birthLongTime)/1000/60/60/24);// �ӳ���������һ�����˶�����
//		
//		birthDate.setTime(birthLongTime + 10000L*1000*60*60*24);// ���ó�����10000����ʱ��
//		
//		String format = sdf.format(birthDate);
//		System.out.println(format);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("��������������:");
		String birthStr = scn.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birth = sdf.parse(birthStr);
		Date now = new Date();
		long time = now.getTime() - birth.getTime();
		time = time/1000/60/60/24;
		if (time<0) {
			System.out.println("������" + (-time) + "�����");
		}else{
			System.out.println("��ϲ���Ѿ�����:" + time + "��!���������!");
		}
		//����10000������յ�����
		time = birth.getTime()+1000L*60*60*24*10000;
		Date date = new Date(time);
		String str = sdf.format(date);
		System.out.println("������10000��ļ�����Ϊ:" + str);
		
		scn.close();
	}

}
