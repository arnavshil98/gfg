import java.util.Iterator;
import java.util.PriorityQueue;


/*
 * priority queue implements queue interface
 * ########## public interface Queue<E> extends Collection<E> ######### 
 * queue works on the principle of first in and first out
 * priority queue inherits AbstractQueue, thus it doesn't follow first in and first out.
 * ########## public class PriorityQueue<E> extends AbstractQueue<E> implements Serializable  ############
 */
/*
 * Queue is an interface and thus can't be instantiated
 */
public class PriorityQueuePra {

	public static void main(String[] args) {

		PriorityQueue<String> queueObj = new PriorityQueue<>();
		queueObj.add("a");
		queueObj.add("b");
		queueObj.add("c");
		queueObj.add("d");
		
		Iterator<String> itr = queueObj.iterator();
		while (itr.hasNext()) {
			System.out.println("the next element is: "+itr.next());
		};
		
		System.out.println("head of the queue: "+queueObj.peek());
	
		System.out.println("poll on priority queue: "+queueObj.poll());
		// returns null in case the the queue is empty 
	//	System.out.println("poll on priority queue: "+queueObj.remove());
		// returns NoSuchElementException in case the queue is empty.
		Iterator<String> itr2 = queueObj.iterator();
		while (itr2.hasNext()) {
			System.out.println("the next element after poll is: "+itr2.next());
		};
		
		
	
	}

}
