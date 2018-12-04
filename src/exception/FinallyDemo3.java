package exception;

/*
 * finally常见笔试题
 * 1.请分别说明:final\finally\finalize?
 * final修饰的类\方法\变量
 * finally是异常中
 * finalize:是Object中的方法,此方法在被GC回收前会被调用(只会被调用一次),通常不会重写此方法,
 * 但如果重写此方法,方法内不应有耗时操作,不然如果对象回收不了,会影响GC的回收工作.GC就会一直被拖在此处,导致造成其他垃圾无法回收.
 * 2.本文类的代码
 */
public class FinallyDemo3 {

	public static void main(String[] args) {
		System.out.println(test("0") + "," + test(null) + "," + test(""));// 答案为3,3,3
	}

	public static int test(String str) {
		// 如果有finally,那么必定会走finally.如果finally有return,
		// 那么其他try或catch里的return都会被finally的return覆盖
		try {
			System.out.println("test:" + str);
			return str.charAt(0) - '0'; // char和char的运算会转为int值进行运算
		} catch (NullPointerException e) {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}

}
