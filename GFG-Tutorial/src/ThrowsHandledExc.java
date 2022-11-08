import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * throws is used as method signature. throws can handle both checked and unchecked exceptions
 * generally throws is used to handle checked exceptions.
 * throw is used to handle unchecked exceptions inside a method, i.e. handling exceptions in runtime.
 * if any code inside the method, may throw exception.
 * With throw we can enjoy custom message for exceptions
 * If we know that the method called may throw an exception, we must handle the method inside try-catch block,
 * so that if the method called throws an exception, the remaining code can be executed without any problem
 */

public class ThrowsHandledExc {
	// checked exceptions
	public static void fileReader() throws FileNotFoundException {
		FileReader file = new FileReader("C:\\Users\\dell\\Desktop\\java_note");
		BufferedReader fileInput = new BufferedReader(file);

	}

	public static void main(String[] args) {

		try {
			fileReader();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		finally {
			System.out.println("this block will be executed even if exception is not handled with catch block");
			System.out.println("generally used to execute most important codes such as ending connections");
		}
		System.out.println("remaining code executed");
	}

}
