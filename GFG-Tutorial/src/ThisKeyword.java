
public class ThisKeyword {
	/*
	 * this keyword for referring instance variables,methods. for calling
	 * constructors. for passing parameters to constructors.
	 */

	int i;

	public void assign(int i) {
		// this refers to the variable declared at the class level
		this.i = i;
	}

	public void referAssign(int x) {
		System.out.println("referencing assign method(){}");
		this.assign(x);

	}

	ThisKeyword() {

		System.out.println("calling constructor without parameter");

	};

	ThisKeyword(int a) {
		this(); // will call the previously mentioned constructor
		System.out.println("calling constructor with parameter " + a);
	}

	ThisKeyword(int a, String s) {
		this(8); // will call the previously mentioned constructor
		System.out.println("calling constructor with parameters " + a + " " + s);
	}

	public static void main(String[] args) {

		ThisKeyword thisKeyword = new ThisKeyword();
		thisKeyword.assign(2);
		System.out.println(thisKeyword.i);
		thisKeyword.referAssign(5);
		System.out.println(thisKeyword.i);

		// calling default constructor
		ThisKeyword thisKeyword1 = new ThisKeyword(7);
		// calling default parameterized constructor
		ThisKeyword thisKeyword2 = new ThisKeyword(8, "hi");
	}

}
