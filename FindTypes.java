package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;

		char[] testArray = test.toCharArray();

		for (int i = 0; i < testArray.length; i++) {
			if (Character.isLetter(testArray[i])) {
				letter++;
			} else if (Character.isDigit(testArray[i])) {
				num++;
			} else if (Character.isSpaceChar(testArray[i])) {
				space++;
			} else {
				specialChar++;
			}
		}

		System.out.println("Letter: " + letter);
		System.out.println("Space: " + space);
		System.out.println("Number: " + num);
		System.out.println("SpecialCharacter: " + specialChar);

	}

}
