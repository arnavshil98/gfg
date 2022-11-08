
public class RecursivePra {

	public void printRev(int i) {
		
		if(i<1)return;
		System.out.print(i);
		printRev(i-1);
	}
	public static void main(String[] args) {

		RecursivePra obj = new RecursivePra();
		obj.printRev(5);
	}

}
