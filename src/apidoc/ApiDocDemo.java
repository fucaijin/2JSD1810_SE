package apidoc;

/**
 * 文档注释是功能级注释，只说明三个地方：
 * 类，常量，方法
 * 文档注释可以被java提供的命令javadoc导出成一个文档
 * 
 * 在类上使用文档注释说明当前类的设计意图及解决的问题
 * @author fucaijin
 * @version 1.0
 * @since JDK1.0
 * @see java.lang.String
 * 
 */
public class ApiDocDemo {
	
	/**
	 * sayHello方法中的问候语
	 */
	public static final String INFO = "Hello!";
	
	/**
	 * 对指定的用户添加问候语
	 * @param name 用户指定的名字
	 * @return 含有"你好"的问候语字符串
	 */
	public String sayHello(String name){
		return "hello:" + name;
	}
}
