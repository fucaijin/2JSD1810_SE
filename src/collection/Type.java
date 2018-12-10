package collection;

/**
 * ����
 * JDK5�Ƴ�ʱ��һ������
 * 
 * ����Ҳ��Ϊ����������,����������ʹ��һ����ʱ,ָ��������,��������,
 * ��������ֵ����.ʹ�ø����ʹ�ø���������,�����
 */
public class Type<T> {
	
	/*
	 * �����Ǳ������Ͽ�,���������
	 * ���з��Ͷ���ĵط����ջᱻ��������ΪObject
	 * �����з��Ͷ���ĵط����Ϊ:
	 * private Object x;
	 * public Type(Object x, Object y)
	 * public Type(Object x)
	 * public setX(Object x)
	 * public Object getX()
	 * ���Է��͵�ԭ�;���Object
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
