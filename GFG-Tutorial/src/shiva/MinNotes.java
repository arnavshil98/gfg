package shiva;

import java.util.HashMap;

public class MinNotes {

	public static void main(String[] args) {
		int[] denominations = {2000,500,200,100,50,20,10,1};
		int x = 2783;
 int quotient = 0;
 HashMap<Integer, Integer> denoCount= new HashMap<>();
	for(int i:denominations)
	{
		quotient = x/i;
		if(quotient>=1.0f) {
			denoCount.put(i,(int) quotient);
			x = x%i;
		}
	}
	
	for (Integer hashObj : denoCount.keySet()) {
		System.out.println("denomination is : " + hashObj + " & count is : " + denoCount.get(hashObj));

	}
	
	
	}
}
