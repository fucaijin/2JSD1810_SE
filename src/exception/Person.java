package exception;

/**
 * ʹ�õ�ǰ������쳣�׳�
 *
 */
public class Person {
	private int age;
	
	public int getAge() {
		return age;
	}
	
	
	/**
	 * ͨ��һ��������ͨ��throw�׳�ʲô�쳣,��Ҫ�ڷ���������ͬʱʹ��throws�������쳣���׳�.
	 * ��һ�������������쳣���׳���,��ô�����ø÷���ʱ,��������Ҫ����õĴ���Ƭ�α��봦���쳣
	 * 
	 * ע:ֻ�з������׳�RuntimeException�����������쳣ʱ���Բ��ڷ�������ʱʹ��throws���������쳣���׳�
	 */
	public void setAge(int age) throws IllegalAgeExcetpion{
//		public void setAge(int age) {
		if(age < 0 || age > 100){
//			throw new Exception("���䲻�Ϸ�");
//			throw new RuntimeException("���䲻�Ϸ�");
			throw new IllegalAgeExcetpion();
		}
		this.age = age;
	}
	
}
