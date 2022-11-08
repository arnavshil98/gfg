
public class ExtClass {

	int z;
	
	public ExtClass(int i) {
		this.z = i;
		System.out.println("parent class constructor");
	}

	
	
	public static void main(String[] args) {
		
		
		System.out.println("Hi");
		System.out.println("CALLING variable from  Encap_Test, This loads Encap_Test class");
		 System.out.println(Encap_Test.companyName);
		 
		 Encap_Test obj = new Encap_Test();
		 obj.setName("Sohini");
		 System.out.println(obj.getName());
		 
		 ExtClass obj1 = new ExtClass(2);
		 System.out.println(obj1.z);
	}
		
	
}

