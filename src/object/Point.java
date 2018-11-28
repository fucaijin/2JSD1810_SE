package object;

/**
 * ʹ�õ�ǰ�����Object���÷���
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
	 * ��дtoString������ toString������һ���ǳ����õķ������ܶ�API���������ӵ��ø÷�����
	 * ������Ŀ���ǽ���ǰ����ת��Ϊ�ַ��������巵�ص��ַ�����ʽû�й̶�Ҫ�� ��ѭ��ԭ���Ƿ��ص������а�����ǰ�����������Ϣ������ͨ�����ַ���������
	 * ֱ�۷�ӳ����ǰ���������
	 */
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	/**
	 * Object�����equals�����������ͼ�ǱȽ���������������Ƿ���ͬ���������д�÷�������ôObject�ڲ�����"=="�Ƚϵģ�
	 * ������ʧȥ��equals�Ƚϵ������ˡ���˵�������Ҫ����һ���׵�equalsʱ���÷�����Ӧ����д��
	 * ע��java�ṩ�����඼�Ѿ���д���ˣ�ֻ�������Զ��������Ҫ������д��
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
