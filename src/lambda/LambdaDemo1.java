package lambda;

/**
 * lambda表达式,JDK8之后推出的特性
 * lambda可以用更简洁的语法定义匿名内部类.
 * 语法:
 * ([实参列表]) -> {
 * 	   方法体
 * }
 * 
 * 使用lambda表达式创建匿名内部类时,要求实现的接口必须只能有一个方法,否则不可以使用
 */
public class LambdaDemo1 {

	public static void main(String[] args) {
		Runnable r1 = new Runnable(){
			@Override
			public void run() {
				System.out.println("hello world!");
			}
		};
		new Thread(r1).start();
		
		Runnable r2 = ()->{System.out.println("hello world2");};
		new Thread(r2).start();
		
//		如果方法体只有一句代码，那么"{}"可以省略不写
		Runnable r3 = ()->System.out.println("hello world3");
		new Thread(r3).start();
		
		new Thread(()->{System.out.println("hello world4");}).start();
	}

}
