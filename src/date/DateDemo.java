package date;

import java.util.Date;

/**
 * java.util.Date
 * Date��ÿһ��ʵ�����ڱ�ʾһ�������ʱ��,�ڲ�ά��һ��longֵ,��ʾ��1970��1��1�� 00:00:00����Date��ʾ��ʱ���������ĺ���
 * ����Date����ʱ�������ǧ�������,��˴󲿷ֲ���ʱ��ķ�����������Ϊ��ʱ��(���ٽ���ʹ����)
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
