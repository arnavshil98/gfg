			/*			Nested Classes
							|
							|
   Static nested class <--------> inner class (non static nested class)
				 							|
				                            |
				 							|
				   member inner class<------|---------> Anonymous classes

*/
// ########## member inner class ############

public class TestMemberOuter1 {
	private int data = 30;

	class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		
		//TestMemberOuter1.Inner obj1 = new TestMemberOuter1.Inner();
		
		TestMemberOuter1 obj = new TestMemberOuter1();
		TestMemberOuter1.Inner obj1 = obj.new Inner();

		obj1.msg();
	}
}
