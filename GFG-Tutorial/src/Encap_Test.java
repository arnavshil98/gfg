
public class Encap_Test {
	  private int age;
	    
	    private String name;
	    
	    public double height;
	    
	    public static String companyName;
	    
	    {
	        height = 5.56;
	    }
	    
	    public void setAge(int ag){
	       this.age = ag;
	    }
	    
	    public int getAge(){
	       return age;
	    }
	    
	     public void setName(String nam){
	         this.name = nam;
	    }
	    
	    public String getName(){
	        return name;
	    }
	    
	   static {
	        companyName = "CCS";
	        System.out.println("static block is executed even before class is instantiated, i.e. while loading the class");
	        System.out.println("static variable doesn't need static block");
	    }
	    
	    public static void main(String args[]){
	        
	    	Encap_Test obj = new Encap_Test();
	        obj.setAge(14);
	        obj.setName("Arnav");
	        System.out.println(obj.getAge());
	        System.out.println(obj.getName());
	        System.out.println(obj.height);
	        System.out.println(companyName);
	        
	    }
	}



