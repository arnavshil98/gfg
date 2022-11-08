import java.util.ArrayDeque;
import java.util.Deque;

public class DequePra {
	/*
	 * linkedList inherits List and Deque interface. Due to deque interface it is
	 * faster than arraylist. linkedList each element is node.
	 */

	/*
	 * public interface Deque<E> extends Queue<E> elemets can be removed from both
	 * ends it is faster than arraylist and stack ############ public interface
	 * Deque<E> extends Queue<E> #################
	 * `````````````````````````````````````````````````````````````````````````````
	 * ```````````````````````````````````````````````````````````````````
	 */

	public static void main(String[] args) {
		/*
		 * public class ArrayDeque<E> extends AbstractCollection<E> implements Deque<E>,
		 * Cloneable, Serializable ArrayDeque is non synchronized and as it implements
		 * Deque it is faster. It it avoids requirement of bit shifting, as the elements
		 * can be added and removed from both ends. It is faster than LinkedList and
		 * stack.
		 */

		Deque<String> arrDeqObj = new ArrayDeque<>();
		arrDeqObj.add("B");
		arrDeqObj.add("C");
		arrDeqObj.addFirst("A");
		arrDeqObj.addLast("D");
		System.out.println(arrDeqObj);
		arrDeqObj.removeLast();
		System.out.println(arrDeqObj);

	}
}
