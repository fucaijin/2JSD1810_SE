package collection;

/**
 * 作为集合元素测试集合相关操作
 */
public class Point {
	private int x;
	private int y;
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
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public boolean equals(Object obj){
		if (obj == null) {
			return false;
		}
		
		if (obj == this){
			return true;
		}
		
		if (obj != null && obj instanceof Point) {
			Point p = (Point)obj;
			return p.getX()==this.x && p.getY()==this.y;
		}
		
		return false;
	}
}
