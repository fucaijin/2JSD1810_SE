package exception;


/**
 * 自定义异常
 * 通常自定义异常时用来说明业务逻辑错误
 * 
 * 年龄不合法异常
 * 当年龄超过取值范围时,会抛出该异常
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
