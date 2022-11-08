
public class ChildSpecificationException extends ParentSpecificException{

	@Override
	public void msg() throws ArithmeticException {
		System.out.println("child class method");
	}
	
	public static void main(String[] args) {
	
		ParentSpecificException excObj = new ChildSpecificationException();
		
		try {
			excObj.msg();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}

}
