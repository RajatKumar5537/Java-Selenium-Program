package StringProgram;

import java.util.Scanner;

public class Count_VowelConsonant 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter characte : ");
		String str = scanner.nextLine();

		int vowel = 0;
		int consonant = 0;

		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') 
			{
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || 
					ch == 'a' || ch == 'e' || ch == 'i'	|| ch == 'o' || ch == 'u') 
				{
					vowel++;
				} else 
					consonant++;
			}
		}

		System.out.println("Count of vowel : " + vowel);
		System.out.println("Count of consonant : " + consonant);
		scanner.close();
	}
}
