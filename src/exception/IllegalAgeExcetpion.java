package exception;


/**
 * �Զ����쳣
 * ͨ���Զ����쳣ʱ����˵��ҵ���߼�����
 * 
 * ���䲻�Ϸ��쳣
 * �����䳬��ȡֵ��Χʱ,���׳����쳣
 */
public class IllegalAgeExcetpion extends Exception{
	private static final long serialVersionUID = 1L;

	public IllegalAgeExcetpion() {
		super();
	}

	public IllegalAgeExcetpion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public IllegalAgeExcetpion(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalAgeExcetpion(String message) {
		super(message);
	}

	public IllegalAgeExcetpion(Throwable cause) {
		super(cause);
	}
	
	
}
