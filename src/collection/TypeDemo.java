package collection;

public class TypeDemo {

	public static void main(String[] args) {
		/*
		 * 使用泛型时,编译器会做两件事:
		 * 1.在给泛型类型赋值时,编译器会检查该值类型是否符合泛型要求.
		 * 例如:
		 * t1.setX(2)
		 * 对于t1而言,由于泛型指定为Integer,因此编译器会检查setX()传递的参数是否为整数,不是则编译器不通过
		 * 
		 * 2.在获取泛型类型的值时,编译器会添加向下造型的代码将其转换为泛型指定类型
		 * int x1 = t1.getX()
		 * 实际编译后会改为
		 * int x1 = (Integer)t1.getX();
		 * 当然这里还自动了自动拆装箱,所以实际改为了
		 * int x1 = ((Integer)t1.getX()).intValue();
		 */
		Type<Integer> t1 = new Type<Integer>(1,2);
		t1.setX(5);
		Integer x = t1.getX();
		System.out.println("x1:" + x);
		System.out.println("t1:" + t1);
		
		System.out.println();
		
		Type<Double> t2 = new Type<Double>(1.1, 2.2);
		t2.setX(5.5);
		Double x2 = t2.getX();
		System.out.println("x2:" + x2);
		System.out.println("t2:" + t2);
		
		System.out.println();

		Type<String> t3 = new Type<String>("一","二");
		t3.setX("三");
		String x3 = t3.getX();
		System.out.println("x3:" + x3);
		System.out.println("t3:" + t3);
	}

}
