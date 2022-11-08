import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPra {

	public static void main(String[] args) {
		
		/* in arraylist can't be used on primitive datatypes ,
		 *  thus we need wrapper class.
		 *  ArrayList is non-synchronized, thus can handle multi-threading.
		 *  1) ArrayList internally uses a dynamic array to store the elements.
		 *  2) Manipulation with ArrayList is slow because it internally uses an array. 
		 *  If any element is removed from the array, all the bits are shifted in memory.
		 *  3) An ArrayList class can act as a list only because it implements List only.
		 *  4) ArrayList is better for storing and accessing data.
		 */
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(12);
		
		System.out.println(list.get(0));
		
		 Collections.sort(list);
		for(Integer arr:list) {
			 if(arr != null) {
			System.out.println("index value linklist :" + arr);
			}
			 else {
				 System.out.println("index value :" + "--");
			 }
		}
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*
		 * ArrayList methods:
		 * list.get(index);
		 * list.set(index,new value);
		 * list.remove(index);
		 * list.clear();
		 * list.size();
		 * 
		 */
		ArrayListPra arrayListPra = new ArrayListPra();
		
	}

}
