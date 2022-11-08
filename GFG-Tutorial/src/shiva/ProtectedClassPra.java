package shiva;

/*
 * class can't be declared private or protected unless it is inner class
 */

public class ProtectedClassPra {
	
	String str = "parent string";
	public void meth(){
		System.out.println("hi from parent");
	}

	protected void printMeth() {
		System.out.println("i am protected method of parent class");
	}
}
