// import PrivateClassPct.PrivateInner;

public class CallingClass {

	public static void main(String[] args) {
	
		PrivateClassPct obj = new PrivateClassPct();
		obj.meth1();
		
	//	PrivateClassPct.PrivateInner pvtInner  = obj.new PrivateInner();
		/*
		 * as the private class PrivateInner inside the public class PrivateClassPct, 
		 * is private it can't be accessed from outside the class. 
		 * private variables,methods,class can't be accessed within the package. 
		 */
		
		Encap_Test obj1 = new Encap_Test();
		// static block inside Encap_Test class is called as we instantiate the class here
		obj1.setAge(14); 
		/* though the variable age is declared private inside the Encap_Test class.
		 * the method setAge() is public. 
		 */
		System.out.println(obj1.getAge());
		
	}

}
