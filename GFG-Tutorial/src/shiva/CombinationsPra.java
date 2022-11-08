package shiva;

public class CombinationsPra {

	 static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }   
	public static void main(String[] args) {
		CombinationsPra obj = new CombinationsPra();
		int [] arr = {4,3,5,8};
		int size = 3;
		int val =obj.factorial(arr.length)/(obj.factorial(size)*obj.factorial(arr.length-size));
		
		System.out.println(val);

	}

}
