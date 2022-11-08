
/*
 * String is immutable, but 
 * string buffer class is used to make mutable String
 */
public class StringBufferPra {

	public static void main(String[] args) {

		StringBuffer varStrObj = new StringBuffer("Arnav");

		System.out.println(varStrObj);
		varStrObj.append(" Shil");
		System.out.println(varStrObj);
	}

}
