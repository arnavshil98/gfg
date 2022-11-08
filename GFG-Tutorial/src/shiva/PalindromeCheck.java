package shiva;

public class PalindromeCheck {
// T(n) = T(n-2)+ theta(1); => theta(n)
	// space complexity => n/2 stack; theta(n)
	public void PalindromeCheck(String str) {

		if (str.length() == 0 || str.length() == 1)
			return;

		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			str = str.substring(1, str.length() - 1);
			PalindromeCheck(str);
		} else {
			System.out.println("not palindrome");
		}

	}

	public static void main(String[] args) {
		PalindromeCheck obj = new PalindromeCheck();
		String str = "helileh"; // helleh
		obj.PalindromeCheck(str);

	}

}
