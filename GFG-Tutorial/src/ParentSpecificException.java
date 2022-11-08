/*
 * if super class declares exception then the subclass can declare same , 
 * subclass exception or no exception  
 * 
 */
public class ParentSpecificException {

	public void msg() throws Exception{
		System.out.println("parent class method");
	}

}
