package map;

/**
 * HashMap是当今查询速度最快的数据结构.但是作为key元素的hashCode()方法和equals()方法的实现如果不妥当,就会降低散列表的查询性能
 * 在HashMap中出现链表就会影响其查询性能,而出现链表的一个主要原因是:
 * 当两个Key元素的hashCode值(hashCode()方法返回的数字)相同时(hashCode决定该元素在HashMap内部数组的下标位置)但它们equals比较不为true
 * (equals方法决定HashMap是否认为这两个key为重复的)时,则会在HashMap内部形成链表.
 * 
 * hashCode()方法与equals()方法是Object定义的方法,这两个方法在API手册的Object类中有明确的说明:
 * 当我们需要重写一个类的equals()或hashCode()方法时,要遵循下面几点要求:
 * 1.成对重写,当我们重写一个类的equals()方法时,就应当连同重写hashCode,反过来也一样
 * 2.一致性,当两个对象的equals比较为true时,hashCode()方法返回的数字必须相等.返回来则不是必须的,但是也尽量保证当两个对象hashCode相同时equals()比较也为true
 * 3.稳定性,当一个对象参与equals比较的属性值没有发生过改变的前提下,多次调用hashCode方法返回的数字应当不变.(即一个对象的属性没有变化时,调用此对象的hashCode()返回的结果应当是不变的)
 */
public class Key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	

}
