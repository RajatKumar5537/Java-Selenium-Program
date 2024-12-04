package StringProgram;

/*
 * I/P = Today is Monday
 * O/P = yadot si yadnom 
 * 
 */

public class Reverse_Word_Sentence {
	public static void main(String[] args) {
		String str = "Today is Monday";
		String[] words = str.split(" "); // Split by spaces to get words
		String reverseString = "";

		for (String word : words) 
		{
			String reverseWord = "";
			for (int i = word.length() - 1; i >= 0; i--) 
			{
				reverseWord += word.charAt(i);
			}
//	        Add space between reversed words
			reverseString += reverseWord + " ";
		}
		System.out.println(reverseString.trim().toLowerCase());
	}
}
