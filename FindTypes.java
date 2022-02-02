package week3.day2;

public class FindTypes {

	public static void main(String[] args) {

		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;

		char[] charArr = test.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (Character.isLetter(charArr[i]))
				letter += 1;
			else if (Character.isDigit(charArr[i]))
				num += 1;
			else if (Character.isSpaceChar(charArr[i]))
				space += 1;
			else
				specialChar += 1;
		}

		System.out.println("Count of letters in the string is : " + letter);
		System.out.println("Count of digits in the string is : " + num);
		System.out.println("Count of spaces in the string is : " + space);
		System.out.println("Count of special characters in the string is : " + specialChar);
	}
}