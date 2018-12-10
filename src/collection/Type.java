package collection;

/**
 * 泛型
 * JDK5推出时的一个特性
 * 
 * 泛型也成为参数化类型,允许我们在使用一个类时,指定其属性,方法参数,
 * 方法返回值类型.使得该类的使用更符合需求,更灵活
 */
public class Type<T> {
	
	/*
	 * 泛型是编译器认可,而非虚拟机
	 * 所有泛型定义的地方最终会被编译器改为Object
	 * 下面有泛型定义的地方会改为:
	 * private Object x;
	 * public Type(Object x, Object y)
	 * public Type(Object x)
	 * public setX(Object x)
	 * public Object getX()
	 * 所以泛型的原型就是Object
	 */
	private T x;
	private T y;
	
	public Type(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

	public String toString() {
		return "Type [x=" + x + ", y=" + y + "]";
	}
}
