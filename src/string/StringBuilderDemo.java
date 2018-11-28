package string;

/**
 *StringBuilder是专门设计用来编辑字符串内容的API。
 *由于String不适合频繁修改，所以在实际开发中如果有经常修改
 *字符串的操作时，可以使用StringBuilder来完成。
 *
 *StringBuilder内部维护一个可变的字符数组，所以修改的过程
 *中资源开销小。并且提供了对应的操作，增、删、查、改、插
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		String str = "好好学习java";
		
//		默认方式创建内部表示一个空字符串""
//		StringBuilder stringBuilder = new StringBuilder();
		
//		创建时表示给定字符串内容
		StringBuilder stringBuilder = new StringBuilder(str);
		stringBuilder.append("，为了找个好工作");
		str = stringBuilder.toString();
		System.out.println(str);
		
		/*
		 * 好好学习Java,为了找个好工作
		 * 好好学习Java,就是为了改变世界
		 * replace(起始下标，结束下标，要更换进来的字符串):将指定范围内的字符串替换为给定内容
		 */
		stringBuilder.replace(9, stringBuilder.length(), "就是为了改变世界");
		str = stringBuilder.toString();
		System.out.println(str);
		
		/*
		 * 好好学习java，就是为了改变世界！
		 * ，就是为了改变世界！
		 * delete(删除的起始位置，结束位置):删除指定范围内的字符串
		 */
		stringBuilder.delete(0, 8);
		str = stringBuilder.toString();
		System.out.println(str);

		
		/*
		 * ，就是为了改变世界
		 * 活着，就是为了改变世界
		 * insert():将制定内容插入到指定位置
		 */
		stringBuilder.insert(0, "活着");
		str = stringBuilder.toString();
		System.out.println(str);
	}

}
