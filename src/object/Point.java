package object;

/**
 * 使用当前类测试Object常用方法
 */
public class Point {
	private int x;
	private int y;

	public static void main(String[] args) {
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
	 * 重写toString方法。 toString方法是一个非常常用的方法。很多API操作都会间接调用该方法。
	 * 方法的目的是将当前对象转换为字符串，具体返回的字符串格式没有固定要求， 遵循的原则是返回的内容中包含当前对象的属性信息。可以通过该字符串的内容
	 * 直观反映出当前对象的内容
	 */
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	/**
	 * Object定义的equals方法的设计意图是比较两个对象的内容是否相同。如果不重写该方法，那么Object内部是用"=="比较的，
	 * 这样就失去了equals比较的意义了。因此当我们需要调用一个雷的equals时，该方法就应当重写。
	 * 注：java提供的类大多都已经重写过了，只有我们自定义的类需要自行重写。
	 */
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}

		if (this == o) {
			return true;
		}

		if (o instanceof Point) {
			Point p = (Point) o;
			return p.x == this.x && p.y == this.y;
		}
		return false;
	}

}
