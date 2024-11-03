package StringProgram;

import java.util.Scanner;

public class Count_UpperLowerSpecialCharacter {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();

		int upperCh = 0;
		int lowerCh = 0;
		int specialCh = 0;
		int digit = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upperCh++;
			} else if (ch >= 'a' && ch <= 'z') {
				lowerCh++;
			} else if (ch >= '0' && ch <= '9') {
				digit++;
			} else {
				specialCh++;
			}
		}

		System.out.println("The total count of uppercase character : " + upperCh);
		System.out.println("The total count of lowercase character : " + lowerCh);
		System.out.println("The total count of special character : " + specialCh);
		System.out.println("The total count of digit character : " + digit);
		
		scanner.close();
	}
}
