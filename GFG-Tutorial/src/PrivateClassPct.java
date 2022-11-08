
public class PrivateClassPct {
	public void meth1() {
		System.out.println("I am outer class of private inner class");
		
	}
	private class PrivateInner{
		
		public void meth() {
			System.out.println("I am private inner class");
		}
	}
	
	public static void main(String[] args) {
		
		PrivateClassPct obj = new PrivateClassPct();
		PrivateClassPct.PrivateInner pvtInner  = obj.new PrivateInner();
		obj.meth1();
		pvtInner.meth();
	}
}
