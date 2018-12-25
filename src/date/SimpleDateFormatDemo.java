package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * ������String��Date֮��ת��
 *
 */
public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//2018-12-21 10:38:13
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a E");//2018-12-21 10:38:13 ���� ������
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��  ��HHСʱmm����ss�� a E");//2018��12��21��  ��10Сʱ39����27�� ���� ������
		/*
		 * String format(Date date)
		 * ��ָ�������ڶ�����ָ����ʽ��Ϊ�ַ���
		 */
		String time = sdf.format(now);
		System.out.println(time);
	}

}
