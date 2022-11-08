/*
 * a class can be made singleton by stopping creation of its instance.
 */
public class SingletonClassPra {

	static SingletonClassPra singletonClassObj = new SingletonClassPra();
	// we need to define its default constructor, which can't be accessed.
	private SingletonClassPra() {
		
	};

	public static SingletonClassPra getInstance() {
		return singletonClassObj;
	}
	
}
