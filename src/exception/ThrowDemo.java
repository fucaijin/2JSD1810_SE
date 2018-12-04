package exception;

/**
 * �쳣���׳�
 * 
 * throw�ؼ������ڽ�һ���쳣�׳�
 * ͨ�������������,���ǻ�������һ���������׳��쳣:
 * 1.��������ʱ������һ���쳣,���Ǹ��쳣��Ӧ���ڵ�ǰ�����б����ʱ,�����׳��������ߴ���.
 * 2.��������ʱ�����˲�����ҵ���߼������ʱ,��������ʵ����һ���쳣���׳��������߸�֪�������ĵ��ò�����.
 */

public class ThrowDemo {

	public static void main(String[] args) {
		Person person = new Person();
		try {
			/*
			 * �����ǵ���һ������throws�����쳣�׳��ķ���ʱ,������Ҫ�����Ǳ��봦����쳣,������벻ͨ��
			 * �����쳣���ֶ�������:
			 * 1.ʹ��try-catch����÷���throws�����׳����쳣
			 * 2.�ڵ�ǰ�����ϼ���ʹ��throw�������쳣���׳�
			 */
			person.setAge(1000);
		} catch (IllegalAgeExcetpion e) {
//			e.printStackTrace();
			System.out.println("������!");
		}
		System.out.println(person.getAge());
	}

}
