
/*
 * if superclass doesn't declare an exception, 
 * then subclass method can't declare checked exception  but can throw unchecked exception
 */

public class ParentException {

	public void msg() {
		System.out.println("parent class method");
	}

	public void msg1() {
		System.out.println("parent class method1");
	}
}
