package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 */
public class SortListDemo2 {

	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(1, 2));
		list.add(new Point(3, 4));
		list.add(new Point(5, 6));
		list.add(new Point(7, 8));
		System.out.println(list);

		/*
		 * Collections�ĸ�sort���������򼯺�ʱҪ�󼯺�Ԫ�ر���ʵ��Comparable�ӿڲ���д���ж���ıȽϷ�����
		 * ������벻ͨ����java API�г����������Ͷ�ʵ���˸ýӿڣ������װ����ַ�����
		 * ���������Զ����Ԫ��ͨ����Ҫȥʵ�ָýӿڣ���Ϊ������ʹ��ĳ������ʱ���÷���Ҫ������Ϊ���޸���������Ĵ���ʱ����������;��������ԣ�
		 * �����Գ���ṹ��������������ʹ��
		 */
		
		/*
		 * ���ص�Collections.sort(List, Comparator)
		 * �÷���Ҫ�����Ǵ���Ҫ����ļ����⣬�ٶ��⴫��һ���Ƚ���,�ñȽ���������Ϊ����Ԫ�ض����һ�ֱȽϴ�С�Ĺ���,����sort�����ͻ����ø����Ƚ���
		 * �ıȽϹ���Լ���Ԫ�ؽ��бȽϴ�С�������Ȼ������,��Ҳ�Ͳ���Ҫ�󼯺�Ԫ�ر���ȥʵ�ֽӿ�:Comparable��
		 */
		Comparator<Point> comparator = new Comparator<Point>(){
			/**
			 * ʵ��Comparator�ӿں�,Ҫ�������д����:
			 * compare,�÷�����������o1,o2�Ĵ�С��ϵ,����ֵΪint��,��ֵ�����ľ���ֵ,ֻ��עȡֵ��Χ:
			 * ������ֵ>0:��ʾo1>o2;
			 * ������ֵ<0:��ʾo1<o2;
			 * ������ֵ=0:��ʾ�����������
			 */
			public int compare(Point p1, Point p2){
				return 0;
			}
		};
		Collections.sort(list, comparator);
		
		
		Collections.sort(list, new Comparator<Point>() {
			public int compare(Point p1, Point p2) {
				if (p1.getX() > p2.getX()) {
					return -1;
				}else if (p1.getX() < p2.getX()){
					return 1;
				}
				return 0;
			}
		});

		System.out.println(list);
	}

}
