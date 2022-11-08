package vishnu;

import shiva.ProtectedClassPra;

public class AccesingProtectedPra extends ProtectedClassPra {

	String str = "child string";

	@Override
	public void meth() {
		System.out.println("hi from child");
	}

	public static void main(String[] args) {

		AccesingProtectedPra accesingProtectedPra = new AccesingProtectedPra();
		accesingProtectedPra.meth();
		System.out.println(accesingProtectedPra.str);
		/*
		 * upcasting -implicit method will be overridden
		 */
		ProtectedClassPra protectedClassPra = (ProtectedClassPra) new AccesingProtectedPra();
		protectedClassPra.meth();
		// System.out.println(protectedClassPra.str); data members can't be overridden

		/*
		 * downcasting -explicit downcasting of Java objects is not possible.
		 */
		/*
		 * AccesingProtectedPra accesingProtectedPra1 = (AccesingProtectedPra) new
		 * ProtectedClassPra(); accesingProtectedPra1.meth();
		 */
		
		
		/*
		 * accessing protected method is only possible in other packages under subclass only
		 * through reference Class of Child.
		 */
		accesingProtectedPra.printMeth();
		// protectedClassPra.printMeth(); not possible
	}

}
