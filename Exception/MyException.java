package Exception;

public class MyException extends Exception {
		private int errorCode;
		
	public MyException(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	public String toString() {
		
		return "MyException [" + errorCode + "]: " + getMessage();

	}
}
