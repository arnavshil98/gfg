
/*
 * checked exceptions inherit Throwable class except Runtime Exception and errors are checked at compilation time IOException, SQLException, etc.
 * unchecked exceptions inherit Runtime Exception. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.
 */
public class ExcHandling {
	static double[] arr = new double[5];

	public static void main(String[] args) {
		try {
			/*
			 * in case of multiple unchecked exceptions,
			 * which ever exception occurs first, that will be caught by executing 
			 * either of the catch blocks.
			 * 
			 */
			arr[5] = 30 / 0; 
			arr[6] = 3; 
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("rest of code executed");

	}
}
