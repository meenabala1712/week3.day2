package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
	
		String original = "madam";
		String reverse = "";
		char[] character = original.toCharArray();

		for (int i = character.length - 1; i >= 0; i--)
			reverse += character[i];

		if (original.equalsIgnoreCase(reverse))
			System.out.println("String " + original + " is a palindrome");
		else
			System.out.println("String " + original + " is not a palindrome");

	}

}

