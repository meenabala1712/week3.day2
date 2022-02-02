package week3.day2;

public class CharOccurance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome to chennai";
		int count = 0;
		char[] charArr = str.toCharArray();
		int length = charArr.length;

		for (int i = 0; i < length; i++)
			if (charArr[i] == 'e')
				count += 1;

		System.out.println("No. of occurances of the character 'e' is : " + count);

	}

}
