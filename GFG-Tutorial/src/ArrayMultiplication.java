import java.util.ArrayList;

public class ArrayMultiplication {

	int[] arrs = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {

		ArrayList<Integer> intarr = new ArrayList<>();

		intarr.add(2);
		intarr.add(3);
		intarr.add(4);
		intarr.add(5);
		intarr.add(6);

		ArrayList<Integer> productArr = new ArrayList<>();
		ArrayMultiplication arrayMultiplication = new ArrayMultiplication();
		int itr = 0;
		for (int i : arrayMultiplication.arrs) {
			int productObj = 0;
			productObj = i * intarr.get(itr);
			productArr.add(productObj);
			itr++;
		}
		// lambda expression
		productArr.forEach((t) -> {
			System.out.println(t);
		});

		
		// product of first 5 even and odd numbers
		
		for (int j = 1; j <= 5; j++) {

			int z = 2 *j ;
			int s = 0;
			
			for (int i = 0; i < j; i++) {
				
				s = 2 * i +1;
			}
			System.out.println(s * z);
		}
	}

}
