package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester";
		String[] strArr = test.split(" ");
		char[] charArr = new char[test.length()];

		for (int i = 0; i < strArr.length; i++) {
			if (i % 2 == 0) {
				charArr = strArr[i].toCharArray();

				for (int j = charArr.length - 1; j >= 0; j--) {
					System.out.print(charArr[j]);
				}
				System.out.print(" ");
			}

			else
				System.out.print(strArr[i] + " ");
		}

	}

}
