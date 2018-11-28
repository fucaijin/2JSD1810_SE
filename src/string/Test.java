package string;

public class Test {
	public static void main(String[] args) {
		String str = getName("www.tedu.com");
		System.out.println(str);
		
		str = getName("http://www.baidu.com");
		System.out.println(str);
	}
	
	/**
	 * 获取给定地址中的域名
	 * 
	 * 例如：要满足于截取"www.tedu.com"、"http://www.baidu.com"、
	 * "http://www.baidu.com.cn"中的tedu、baidu字符串
	 * 
	 * @param url 给定的地址
	 * @return	域名
	 */
	public static String getName(String url){
//		第一个点“.”之后第一个字符的位置
		int firstIndex = url.indexOf('.') + 1;
//		第二个点“.”的位置
		int lastIndex = url.indexOf('.', firstIndex);
		return url.substring(firstIndex, lastIndex);
	}
}
