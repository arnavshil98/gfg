/**
 * 
 */

/**
 * @author dell
 *
 */
public class JavaConstructorPra {

	int i;
	String s;

	JavaConstructorPra(int a, String b) {

		i = a;
		s = b;
	}
	/*
	 * Copying values of one object to another using constructor.
	 */
	JavaConstructorPra(JavaConstructorPra q) {
		i = q.i;
		s = q.s;
	}

	public JavaConstructorPra() {
System.out.println("i am constructor of JavaConstructorPra");
	}

	public void display() {
		System.out.println(i + " " + s);
	}

	
	public static void main(String[] args) {
		// constructor overloading
		JavaConstructorPra obj = new JavaConstructorPra();
		JavaConstructorPra obj1 = new JavaConstructorPra(2, "hi");
		/**
		 * Copying values of one object to another using constructor.
		 */
		JavaConstructorPra obj2 = new JavaConstructorPra(obj1);
		obj.display();
		obj1.display();
		obj2.display();
	}

}
