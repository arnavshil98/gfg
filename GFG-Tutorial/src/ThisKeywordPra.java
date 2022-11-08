
/*
 * this keyword is used to reference variables is class,
 * for calling constructors and constructors with parameters.
 * special purpose is to reuse constructors
 * passing parameters to methods. 
 * this can be used to reference class in java.
 */
public class ThisKeywordPra {

	public ThisKeywordPra fetchReturn() {
		return this; // will return current class instance
	}

	void method(ThisKeywordPra instObj) {
		System.out.println("method with class instance is called");
	}

	public void display() {
		method(this);
	}

	int i;
	String s;
	double d;

	ThisKeywordPra() {
		this.d = 2.57; // assigning value to referenced variable
	}

	ThisKeywordPra(int x) {
		this(); // calling default constructor
		this.i = x;
	}

	public ThisKeywordPra(int a, String q) {
		/*
		 * instead of assigning value directly to the constructor, the value will be
		 * passed through the current constructor. this is the main purpose of this(),
		 * i.e code resusability
		 */
		this(a); // calling parameterized constructor
		this.s = q;
	}

	public static void main(String[] args) {

		ThisKeywordPra obj = new ThisKeywordPra(3, "java this keyword");
		System.out.println(obj.d);
		System.out.println(obj.i);
		System.out.println(obj.s);

		new ThisKeywordPra().fetchReturn().display();
		new ThisKeywordPra().display();

	}

}
