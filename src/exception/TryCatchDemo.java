package exception;

/**
 * java异常处理机制中的try-catch
 * 
 * try{
 * 	可能出现异常的代码片段
 * }catch(XXXExeption e){
 * 	出现了XXXExeption后的处理代码
 * }
 */
public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		
		try {
//			String str = null;
//			String str = "";
			String str = "a";
			/*
			 * 当JVM执行过程中出现某个异常时,会实例化对应的异常实例,并将程序执行过程设置进去.
			 * 这时该异常实例可以完整说明当前情况.
			 * 实例化完毕后,JVM会将该异常抛出 
			 */
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			//try语句块中出错的代码行一下的内容都不会执行
			System.out.println("来来来,运行这里");
		} catch (NullPointerException e) {
			System.out.println("出现了空指针异常");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("字符串下标越界异常");
		} catch (Exception e){
			/*
			 * 通常会在最后一个catch中捕获Exception,防止因为一个未捕获的异常导致程序中断
			 */
			System.out.println("捕获了其他异常");
		}
		System.out.println("程序结束了");
	}

}
