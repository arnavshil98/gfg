import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 7, 9, 12, 43, 23 };
		Integer[] arr1 = { 4, 3, 7, 9, 12, 43, 23 };

		Arrays.sort(arr);

		/*
		 * Collections.reverseOrder() doesn't work for primitive data type.
		 */
		Arrays.sort(arr1, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));

	}

}
