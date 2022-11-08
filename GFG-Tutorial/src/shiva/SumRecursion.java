package shiva;

public class SumRecursion {

	public int sum(int n) {
		if(n==0)return 0;
		return n+ sum(n-1);
	}
	/*
	 * tail recursive
	 */
	public static void main(String[] args) {
		SumRecursion obj = new SumRecursion();
		System.out.println(obj.sum(5));

	}

}
