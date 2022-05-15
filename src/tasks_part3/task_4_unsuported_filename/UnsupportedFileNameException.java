package tasks_part3.task_4_unsuported_filename;

public class UnsupportedFileNameException extends Exception {

	public UnsupportedFileNameException() {
		// TODO Auto-generated constructor stub
	}

	public UnsupportedFileNameException(String message) {
		super(message);
		System.out.println("Формат файла не = .txt");
	}

	public UnsupportedFileNameException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public UnsupportedFileNameException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UnsupportedFileNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
