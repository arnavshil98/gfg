import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDateTimePra {

	public static void main(String[] args) {

		LocalDateTime dateTimeObj = LocalDateTime.now();
		System.out.println(dateTimeObj);
		/*
		 * formatting date-time as per requirement.
		 */
		DateTimeFormatter formattedDateTime = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = dateTimeObj.format(formattedDateTime);
		System.out.println(formattedDate);
		
		/*
		 * user input for date time. and formatting the same
		 */
	}

}
