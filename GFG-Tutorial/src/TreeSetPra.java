import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPra {

	/*
	 * public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable 
	 */
	public static void main(String[] args) {
		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		 /*
		  *  al.add(null);
		  *  can't add null to a treeset unlike hashset 
		  */
		  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  

	}

}
