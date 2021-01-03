package kh.java.exception;
/**
 * 커스텀 예외클래스
 *  - 의미전달을 명확히 함.
 * 
 *1. checked exception : extends Exception
 *2. unchecked exception : extends RunTimeException
 *
 */
public class UnderAgeException extends Exception {
	
	
	//부모생성자를 따라 만들어 두기 (alt shift s)
	public UnderAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UnderAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UnderAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UnderAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UnderAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
