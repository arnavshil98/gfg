
public class ChildException extends ParentException{

	// only unchecked exceptions are thrown 
	@Override
	public void msg() throws ArithmeticException {
		System.out.println("child class method");
	}
	public static void main(String[] args) {
		
		ParentException excObj = new ChildException();
		excObj.msg();
		excObj.msg1();
		
//		ChildException excObj1 = new ChildException();
//		excObj1.msg();
//		excObj1.msg1();
//		
//		ParentException excObj2 = new ParentException();
//		excObj2.msg();
//		excObj2.msg1();
	}

}
