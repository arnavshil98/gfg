import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPrc {
	/*
	 * it avoids duplicate data public class HashSet<E> extends AbstractSet<E>
	 * implements Set<E>, Cloneable, Serializable hashset data is in order of
	 * hashcode.
	 */
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("d");
		arr.add("b");
		arr.add("c");
		arr.add("a");
		arr.add("c");

		/*
		 * passing ArrayList into Hash set.
		 */
		HashSet<String> hst = new HashSet<String>(arr);
		hst.add("e");
		hst.remove("a");

		Iterator<String> itr = hst.iterator();
		while (itr.hasNext()) {
			// we can't have hashcode for null value
			System.out.println("hashcode is " + itr.next().hashCode());
		}
		
		HashSet<String> hst1 = new HashSet<String>(arr);
		hst1.add(null);
		Iterator<String> itr1 = hst1.iterator();
		while (itr1.hasNext()) {
			System.out.println("value is " + itr1.next());
		}
	}

}
