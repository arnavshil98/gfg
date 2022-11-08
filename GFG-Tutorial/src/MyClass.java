 
// Java program to demonstrate Need for
// Anonymous Inner class

// Interface
interface Age {

	// Defining variables and methods
	int x = 21;
	void getAge();
}

// Class 1
// Helper class implementing methods of Age Interface
class MyClass implements Age {

	// Overriding getAge() method
	@Override 
	public void getAge()
	{
		// Print statement
		System.out.print("Age is " + x);
	}
	
	public static void main(String[] args)
	{
		// Class 1 is implementation class of Age interface
		MyClass obj = new MyClass();
		
		// calling static variable of public class TestOuter.java
		System.out.println(TestOuter.str);
		TestOuter.StaticNestedClass obj1 = new TestOuter.StaticNestedClass();
		
		TestOuter.str = "good morning!";
		// calling method on object created. 
		obj1.meth();
		// calling static method of nested class
		TestOuter.StaticNestedClass.meth1();
		obj.getAge();
	}
}

