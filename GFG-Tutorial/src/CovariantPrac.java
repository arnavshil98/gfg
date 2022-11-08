
public class CovariantPrac extends ThisKeywordPra {

	@Override
	public CovariantPrac fetchReturn() {
		return this; // will return current class instance
	}

	public void response() {
		System.out.println("Covariant return");
	}

	public static void main(String[] args) {
		new CovariantPrac().fetchReturn().response();
	}

}
