package exception;

/**
 * 异常的抛出
 * 
 * throw关键字用于将一个异常抛出
 * 通常遇到以下情况,我们会主动在一个方法中抛出异常:
 * 1.程序运行时出现了一个异常,但是该异常不应当在当前方法中被解决时,可以抛出给调用者处理.
 * 2.程序运行时出现了不符合业务逻辑的情况时,可以主动实例化一个异常的抛出给调用者告知其这样的调用不合理.
 */

public class ThrowDemo {

	public static void main(String[] args) {
		Person person = new Person();
		try {
			/*
			 * 当我们调用一个含有throws声明异常抛出的方法时,编译器要求我们必须处理该异常,否则编译不通过
			 * 处理异常的手段有两种:
			 * 1.使用try-catch捕获该方法throws声明抛出的异常
			 * 2.在当前方法上继续使用throw声明该异常的抛出
			 */
			person.setAge(1000);
		} catch (IllegalAgeExcetpion e) {
//			e.printStackTrace();
			System.out.println("出错了!");
		}
		System.out.println(person.getAge());
	}

}
