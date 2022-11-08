public class ThrowsUnhandledExcPra {
// unchecked exceptions
	public static void validate(int age) {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			// with throw we can give custom exceptions
			// with try catch we can't give custom exceptions
			throw new ArithmeticException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}

	public static void main(String[] args) {

		validate(13);

// remaining code will not be executed.  
		System.out.println("executing rest codes");
	}

}
