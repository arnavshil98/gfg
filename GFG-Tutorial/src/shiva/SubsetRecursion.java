package shiva;

public class SubsetRecursion {

	public void generateSubset(String str, String var, int i) {

		if(i==str.length()) {
			System.out.println("subsets are: "+"'"+var+"'");
			return;
		}
		i=i+1;
		generateSubset(str,var+str.charAt(i-1),i);
		generateSubset(str,var,i);

	}

	public static void main(String[] args) {

		SubsetRecursion obj = new SubsetRecursion();
		obj.generateSubset("abc","", 0);

	}

}
