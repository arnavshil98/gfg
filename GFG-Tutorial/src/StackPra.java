import java.util.Iterator;
import java.util.Stack;
import java.util.logging.Logger;

public class StackPra {

	public static void main(String[] args) {
		
/*
 * stack is subclass of vector and is a legacy class
 * the class is based on last-in and first-out
 * It is thread-safe which might be overhead in an environment where thread safety is not needed.
 */
		Stack<String> stk = new Stack<>();
		stk.push("hello");
		stk.push("good");
		stk.push("morning");
		
		Iterator<String> itr = stk.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("----------------------------------------------");
		System.out.println(stk.peek()); // returns object at the top of the stack.
		System.out.println("----------------------------------------------");
		System.out.println(stk.pop()); // removes the last object from the stack. and returns the removed object
		System.out.println("----------------------------------------------");
		for(String s:stk) {
			System.out.println(s);
		}
	}

}
