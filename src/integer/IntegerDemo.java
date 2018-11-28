package integer;

/**
 * ��װ��
 * ��װ����Ϊ�˽���������Ͳ���ֱ�Ӳ���������󿪷�������
 * ����6���������͵İ�װ�඼�̳���java.lang.Nunber��
 * ��������(Charter��Boolean)ֱ�Ӽ̳���Object
 * Number��һ�������࣬�������������Ͱ�װ�๲�е���Ϊ:
 * ��������������֮��ת��
 */
public class IntegerDemo {

	public static void main(String[] args) {
		
		// �ӻ�������ת��Ϊ��װ�ཨ��ʹ��valueOf������

		int i = 128;
		Integer i1 = Integer.valueOf(i);
		Integer i2 = Integer.valueOf(i);
		System.out.println(i1 == i2);	// true  
		//���i>=128Ϊfalse����ΪInteger.valueOf(i)�����У����i>=128���return new Integer(i)
		System.out.println(i1.equals(i2));	// true 
		
		System.out.println();
		
		double d = 1.0;
		Double d1 = Double.valueOf(d);
		Double d2 = Double.valueOf(d);
		System.out.println(d1 == d2);	// false
		System.out.println(d1.equals(d2));	// true
		
		// ����װ��ת��Ϊ��������
		int in = i1.intValue();
		System.out.println(in);
		
		double dd = i1.doubleValue();
		System.out.println(dd);
		
		// ���ܻ������������i1������127����ֻص�byte�ĸ�ֵ(����128ת������Ϊ-127)
		byte byteValue = i1.byteValue();
		System.out.println(byteValue);
		
		/**
		 * �������͵İ�װ�඼֧������������
		 * MAX_VALUE��MIN_VALUE
		 * ���ڱ�ʾ���Ӧ�Ļ����������ݵ�ȡֵ��Χ
		 */
		
		int intMax = Integer.MAX_VALUE;
		int intMin = Integer.MIN_VALUE;
		System.out.println(intMax);
		System.out.println(intMin);
		
		long longMax = Long.MAX_VALUE;
		long longMin = Long.MIN_VALUE;
		System.out.println(longMax);
		System.out.println(longMin);
	}

}
