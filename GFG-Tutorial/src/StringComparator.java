import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringComparator {

	public static void main(String[] args) {

		/*
		 * creating new pools in heap memory.
		 */
		 String s = new String("arnav"); // pool 1
		 String s1 = new String("arnav"); // pool 2 

		System.out.println(s.equals(s1));// data comparison
		System.out.println(s == s1); // reference comparison

		String str1 = "ram"; // pool 3
		String str2 = "Ram"; // pool 3
		/*
		 * str3 is exactly same as str1, new pool is not created inside heap memory
		 * instead of creating str3, str3 will be referenced to str1.
		 */
		String str3 = "ram"; // pool 3

		/*
		 * compateTo() is used to compare two strings lexicographically, i.e. by unicode value
		 */
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1 == str2);
		/*
		 * as both reference to same pool, as the reference is same hence java , instead
		 * of creating new variable in same pool str3, it directly references str1.
		 * Hence in pool both str1 and str3 are exactly same reference.
		 */
		System.out.println(str1 == str3);
		
		
		String str4 = "Javatpoint";
		byte[] bytes = str4.getBytes();
		 
		String s3 = new String(bytes, 1, 4);
		System.out.println(s3);
		 
		s3 = new String(bytes, 1, 4, StandardCharsets.US_ASCII);
		System.out.println(s3);
		 
		try {
		    s3 = new String(bytes, 1, 3, "UTF-8");
		} catch (UnsupportedEncodingException e) {
		    e.printStackTrace();
		}
		System.out.println(s3);
		
		
		

	}
}
