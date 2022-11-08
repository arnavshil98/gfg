/*
 * always static members will be called first
 * then constructor of parent class is called
 * then the initializer block is called,the initializer block is called only when the class is initialized.
 * and then  the constructor of current(child) class
 * 
 */

public class InitializerBlock extends JavaConstructorPra {

	InitializerBlock() {

		System.out.println("constructor of child class");
	};

	{
		System.out.println("Initializer block is called");
	}

	static {
		System.out.println("static Initializer block is called");
	};

	public static void main(String[] args) {
		InitializerBlock obj = new InitializerBlock();

	}

}
