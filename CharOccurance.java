package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char[] str1 = str.toCharArray();
		int arrLength = str1.length;
		for (int i = 0; i < arrLength - 1; i++) {
			if (str1[i] == 'e') {
				count++;
			}
		}
		System.out.println(count);

	}

}
