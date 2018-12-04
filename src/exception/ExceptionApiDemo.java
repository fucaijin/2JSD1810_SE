package exception;

/**
 * 异常常用方法
 *
 */
public class ExceptionApiDemo {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			System.out.println("出错了");
//			输出错误堆栈信息,有助于我们解决问题
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("程序结束了");
	}

}
