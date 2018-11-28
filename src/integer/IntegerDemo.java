package integer;

/**
 * 包装类
 * 包装类是为了解决基本类型不能直接参与面向对象开发的问题
 * 其中6个数字类型的包装类都继承与java.lang.Nunber。
 * 其余两个(Charter、Boolean)直接继承于Object
 * Number是一个抽象类，定义了数字类型包装类共有的行为:
 * 允许在数字类型之间转换
 */
public class IntegerDemo {

	public static void main(String[] args) {
		
		// 从基本类型转换为包装类建议使用valueOf方法；

		int i = 128;
		Integer i1 = Integer.valueOf(i);
		Integer i2 = Integer.valueOf(i);
		System.out.println(i1 == i2);	// true  
		//如果i>=128为false，因为Integer.valueOf(i)方法中，如果i>=128则会return new Integer(i)
		System.out.println(i1.equals(i2));	// true 
		
		System.out.println();
		
		double d = 1.0;
		Double d1 = Double.valueOf(d);
		Double d2 = Double.valueOf(d);
		System.out.println(d1 == d2);	// false
		System.out.println(d1.equals(d2));	// true
		
		// 将包装类转换为基本类型
		int in = i1.intValue();
		System.out.println(in);
		
		double dd = i1.doubleValue();
		System.out.println(dd);
		
		// 可能会出现溢出，如果i1超过了127则会轮回到byte的负值(例如128转换后会变为-127)
		byte byteValue = i1.byteValue();
		System.out.println(byteValue);
		
		/**
		 * 数字类型的包装类都支持两个常量：
		 * MAX_VALUE、MIN_VALUE
		 * 用于表示其对应的基本类型数据的取值范围
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
