package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String paln = "madam";
		String rev = "";
		int length = paln.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + paln.charAt(i);
			if (rev.equals(paln)) {
				System.out.println("Given string is a palindrome");
			}
		}

	}

}
