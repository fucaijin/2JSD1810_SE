package exception;

/**
 * 使用当前类测试异常抛出
 *
 */
public class Person {
	private int age;
	
	public int getAge() {
		return age;
	}
	
	
	/**
	 * 通常一个方法中通过throw抛出什么异常,就要在方法声明的同时使用throws声明该异常的抛出.
	 * 当一个方法声明了异常的抛出后,那么当调用该方法时,编译器会要求调用的代码片段必须处理异常
	 * 
	 * 注:只有方法中抛出RuntimeException及其子类型异常时可以不在方法声明时使用throws声明该类异常的抛出
	 */
	public void setAge(int age) throws IllegalAgeExcetpion{
//		public void setAge(int age) {
		if(age < 0 || age > 100){
//			throw new Exception("年龄不合法");
//			throw new RuntimeException("年龄不合法");
			throw new IllegalAgeExcetpion();
		}
		this.age = age;
	}
	
}
