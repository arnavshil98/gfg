
public class Encapsulation2 {

	private int x;
	private String z;

	private Encapsulation1 encapsulation1;

	public void setX(int a) {
		x = a;
	}

	public int getX() {
		return x;
	}

	public void setZ(String b) {
		z = b;
	}

	public String getZ() {
		return z;
	}

	public void setEncapsulation1(Encapsulation1 obj) {
		this.encapsulation1 = obj;
	}

	public Encapsulation1 getEncapsulation1() {
		return encapsulation1;
	}

}
