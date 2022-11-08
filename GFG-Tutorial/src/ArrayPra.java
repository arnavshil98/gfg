import java.util.Arrays;

public class ArrayPra {

 int[] arrs = {1,2,3};

 public static void main(String[] args) {
		
		ArrayPra obj = new ArrayPra();
		obj.arrs[0] = 15;
		obj.arrs[1] = 16;
		obj.arrs[2] = 12;
	//	obj.arrs[3] = 15;
		
		Arrays.sort(obj.arrs);
		System.out.println("UPDATING ARRAY");
		for(int arr:obj.arrs) {
			System.out.println(arr);
		}
		System.out.println(obj.arrs);
		System.out.println("NEW ARRAY");
		String[] array = new String[5];
		array[0] =  "dqwef";
		array[1] = "dqwef";
		array[2] = "gwed";
		array[3] = "adcfdg";
		array[4] = "";
		Arrays.sort(array);
		// Collections.sort(array);
	// we can't add new data into array which has predefined allocated memory
	//	array[5] = "f";
		
		for(String arr:array) {
			 if(!arr.isEmpty()) {
			System.out.println("index value array :" + arr);
			// System.out.println(arr.length());
			
			}
			 else {
				 System.out.println("index value array :" + "--");
			 }
		}
		System.out.println(array[3]);
		System.out.println(array[2]);
		System.out.println(array[2] == array[3]); // checking memory referencing
	
		
		/*
		 * program for reversing an string
		 */
		
		String name = "abc";
		char [] strArr = name.toCharArray();
		for(char i:strArr) {
			System.out.println(i);
		}
		
		
	}

}
