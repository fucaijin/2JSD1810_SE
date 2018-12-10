package collection;

/**
 * 泛型在使用时可以不指定,若不指定则默认为原型Object
 * 但通常有泛型的地方都应当指定泛型的实际类型
 */
public class TypeDemo2 {

	public static void main(String[] args) {
		Type<Integer> t1 = new Type<Integer>(1, 2);
		t1.setX(2);
		Integer x1 = t1.getX();
		System.out.println("x1:" + x1);
		System.out.println("t1:" + t1);
		
		Type t2 = t1;
		t2.setX("一");
		Object x2 = t2.getX();
		System.out.println("x2:" + x2);
		System.out.println("t2:" + t2);
		
		System.out.println("t1:" + t1);
		
		x1 = t1.getX();	//此步会类造型异常(在运行时会抛出异常)
		System.out.println("x1:" + x1);
		System.out.println("t1:" + t1);
	}

}
