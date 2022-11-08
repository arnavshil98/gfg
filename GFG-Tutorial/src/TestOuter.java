/*
######### STATIC NESTED CLASS #########################

We use inner classes to logically group classes and interfaces in one place to be more readable and maintainable.
Nested classes represent a particular type of relationship that is it can access all the members (data members and methods) of the outer class, including private.
Nested classes are used to develop more readable and maintainable code because it logically group classes and interfaces in one place only.
Code Optimization: It requires less code to write.
Sometimes users need to program a class in such a way so that no other class can access it. 
Therefore, it would be better if you include it within other classes.Sometimes users need to program a class in such a way so that no other class can access it. Therefore, it would be better if you include it within other classes.
*/
/*
 ***A class can be declared static only if it is nested.***
 * Difference between nested class and inner class in Java
 * An inner class is a part of a nested class. Non-static nested classes are known as inner classes.
*/
/*
 * Non-static nested class (inner class)
Member inner class
Anonymous inner class
Local inner class
Static nested class
 */
/* ########### static class and inner class #################
 * https://www.geeksforgeeks.org/static-class-in-java/
 * https://www.javatpoint.com/member-inner-class
 */

// ########### static class and inner class #################
class TestOuter {

	/*
	 * ### go to MyClass.java file , there I have called str variable### this proves
	 * that static variables are distributed across all the classes in a package.
	 */
	private static int i = 10;
	public static String str = "Geek For Geeks";
//	private double var = 234.34;

	static class StaticNestedClass {

		String z = "Hello!";

		// inner class is static thus doesn't need to be instantiated.
		// static inner class can only access static variables of outer class.

		public void meth() {

			System.out.println("integer value is: " + i);
			System.out.println("string value is: " + str);

		}

		public static void meth1() {
			System.out.println("I am static method");

		}

		public static void main(String[] args) {

			System.out.println(str);
			str = "Java Tuitorial Point";
			TestOuter.StaticNestedClass obj = new TestOuter.StaticNestedClass();
			obj.meth();
			meth1();
			System.out.println(obj.z);

		}
	}
}
