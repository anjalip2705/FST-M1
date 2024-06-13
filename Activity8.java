package Activities;

class CustomException extends Exception {

	private String message;

	public CustomException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}

class Main {
	static void exceptionTest(String message) throws CustomException {
		if (message == null) {
			System.out.println("String cannot be null");
		} else {
			System.out.println("Message is" + " " + message);
		}

	}
}

public class Activity8 {

	public static void main(String[] args) {

		try {
			Main.exceptionTest("Hi");
//			Main.exceptionTest(null);
		} catch (CustomException mm) {
			System.out.println("Catch:" + mm.getMessage());
		}

	}

}
