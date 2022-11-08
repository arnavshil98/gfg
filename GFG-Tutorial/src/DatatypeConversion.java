
public class DatatypeConversion {

	String s = "true";
	String i = "0";
	
	public static void main(String[] args) {
		DatatypeConversion datatypeConversion = new DatatypeConversion();
		
		System.out.println(Boolean.valueOf(datatypeConversion.s));
		
		if(datatypeConversion.i.equals("1")) {
			datatypeConversion.i = "true";
		}
		else {
			datatypeConversion.i = "false";
		}
		
		System.out.println(Boolean.valueOf(datatypeConversion.i));

	}

}
