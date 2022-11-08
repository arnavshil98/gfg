/*
 * class Encapsulation1 is declared public but when accessed 
 * through another class is declared private. this class must be accsees using setter
 * and getter. 
 * data members declared in Encapsulation1 is private hence they must be accessed  from the 
 * Encapsulation1 object reference, using setters and getters.
 */

public class Encapsulatiuon3 {

	public static void main(String[] args) {

		Encapsulation2 encapsulation2 = new Encapsulation2();

		encapsulation2.setX(12);

		Encapsulation1 obj = new Encapsulation1();

		encapsulation2.setEncapsulation1(obj);

		encapsulation2.getEncapsulation1().setI(1);
		encapsulation2.getEncapsulation1().setS("hello");

		System.out.println(obj.getI());
		System.out.println(obj.getS());
	}

}
