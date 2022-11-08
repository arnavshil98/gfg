
/*
 * final block is executed after try-catch block.
 * If the exception is handled or not the final block will be executed. 
 */

public class FinalBlockTest {
	  
	      public static void main(String args[]){   
	  
	      try {    
	  
	        System.out.println("Inside try block");  
	  
	        //below code throws divide by zero exception  
	       int data=25/0;    
	       System.out.println(data);    
	      }   
	  
	      //handles the Arithmetic Exception / Divide by zero exception  
	      catch(ArithmeticException e){  
	        System.out.println("Exception handled");  
	        System.out.println(e);  
	      }   
	  
	      //executes regardless of exception occurred or not   
	      finally {  
	        System.out.println("finally block is always executed");  
	      }    
	  
	      // remaining code will be executed, as the exception is successfully handled.
	      System.out.println("rest of the code...");    
	      }    
	     
}
