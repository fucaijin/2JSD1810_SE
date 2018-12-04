package exception;

/**
 * finally块
 * finally块是异常处理机制的最后一块.它可以直接跟在try语句块之后,
 * 或者最后一个catch块之后.
 * finally能确保只要程序执行到try语句块中,无论try语句块中的代码是否抛出异常,finally块中的代码必定执行.
 * 通常会将无关乎程序出错都要执行的代码放在这里.比如资源的释放操作:IO里的流的关闭等
 */
public class FinallyDemo1 {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str = null;
//			String str = "";
			System.out.println(str.length());
			return;
		} catch(Exception e){
			System.out.println("处理错误啦");
		}finally {
			System.out.println("进入finally啦");
		}
		System.out.println("程序结束了");
	}

}
