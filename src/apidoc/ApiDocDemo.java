package apidoc;

/**
 * �ĵ�ע���ǹ��ܼ�ע�ͣ�ֻ˵�������ط���
 * �࣬����������
 * �ĵ�ע�Ϳ��Ա�java�ṩ������javadoc������һ���ĵ�
 * 
 * ������ʹ���ĵ�ע��˵����ǰ��������ͼ�����������
 * @author fucaijin
 * @version 1.0
 * @since JDK1.0
 * @see java.lang.String
 * 
 */
public class ApiDocDemo {
	
	/**
	 * sayHello�����е��ʺ���
	 */
	public static final String INFO = "Hello!";
	
	/**
	 * ��ָ�����û�����ʺ���
	 * @param name �û�ָ��������
	 * @return ����"���"���ʺ����ַ���
	 */
	public String sayHello(String name){
		return "hello:" + name;
	}
}
