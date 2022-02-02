package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	

		String text1 = "stops";
		String text2 = "potss";

		if (text1.length() == text2.length()) {
			char[] charArr1 = text1.toCharArray();
			char[] charArr2 = text2.toCharArray();
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);

			text1 = String.valueOf(charArr1);
			text2 = String.valueOf(charArr2);
			
			System.out.println(charArr1);
			System.out.println(charArr2);
			if (text1.equalsIgnoreCase(text2))
				System.out.println("Both the strings are Anagram");
			else
				System.out.println("Both the strings are not Anagram");
		}

	}

}
