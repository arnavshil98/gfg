/*
 *  sub class constructor implicitly call super class 
 *  constructor before doing any initialization,
 *   which guarantees that non static or instance variables of
 *    super class is initialized before sub class.
 *  */
 


public class ExtChildClass extends ExtClass {

	String s;

	public ExtChildClass(int i , String str) {
		super(i);
		this.s = str;
		System.out.println("child class constructor");

	}

	public static void main(String[] args) {

		ExtChildClass obj = new ExtChildClass(34, "Arnav");
		System.out.println(obj.s);
		System.out.println(obj.z);
	}

}
