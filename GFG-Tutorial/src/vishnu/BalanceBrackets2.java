package vishnu;

import java.util.Stack;

public class BalanceBrackets2 {

	Stack<Character> stack = new Stack<>();

	public void validateBrackets(String strArr) {
		int balance = strToArr(strArr);
		if (balance == 0)
			System.out.println("The entered String has Balanced Brackets");
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

	public int strToArr(String strArr) {
		int balance = 0;
		for (int i = 0; i < strArr.length(); i++) {

			char c = strArr.charAt(i);

			if (c == '(' || c == '[' || c == '{') {

				stack.push(c);
				balance = balance + 1;
				continue;
			} else {

				if (c == ')') {
					c = '(';
				}
				if (c == ']') {
					c = '[';
				}
				if (c == '}') {
					c = '{';
				}

				char popBracket = stack.pop();
				if (popBracket == c) {
					balance = balance - 1;
					continue;
				} else {
					break;
				}

			}

		}

		return balance;
	}

	public static void main(String[] args) {
		BalanceBrackets2 obj = new BalanceBrackets2();
		String bracketsSequence = "({[]})";
		obj.validateBrackets(bracketsSequence);
	}
}
