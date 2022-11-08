import java.util.Collections;
import java.util.LinkedList;

public class LinkedlistPrc {

	public static void main(String[] args) {
		/*
		 * linear data structure where the elements are not stored in contiguous and is non synchronised.
		 * locations and every element is a separate object with a data part and address
		 * part. The elements are linked using pointers and addresses. Each element is
		 * known as a node.
		 * LinkedList internally uses a doubly linked list to store the elements.
		 * Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
		 * LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
		 * LinkedList is better for manipulating data
		 */
		LinkedList<String> cars = new LinkedList<>();
		cars.add("bmw");
		cars.add("audi");
		cars.add("porshe");
		cars.add("porshe");
		Collections.sort(cars);
		cars.addFirst("Hyundai");
// for-each on array
		for (String car : cars) {
			System.out.println(car);

//	System.out.println(car.length()); 
		}

		System.out.println(cars.get(3) == cars.get(4)); // checking memory referencing
	}

}
