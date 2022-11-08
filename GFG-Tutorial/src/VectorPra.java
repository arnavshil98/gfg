import java.util.Iterator;
import java.util.Vector;

public class VectorPra {

	public static void main(String[] args) {
	
		/*
		 * vector is synchronised ,i.e.only one thread can be accessed at a time.
		 * vector is slower than arrayList.   
		 */
		Vector<Integer> vec = new Vector<>();
		vec.addElement(1);
		vec.addElement(2);
		vec.addElement(3);
		
		System.out.println(vec);
		
		Iterator<Integer> iter = vec.iterator(); 
		System.out.println(iter);
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	

	}

}
