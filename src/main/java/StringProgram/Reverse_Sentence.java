package StringProgram;

/*
 * I/P = All the best
 * O/P = best the All
 */
public class Reverse_Sentence {

	public static void main(String[] args) {
		String str = "All the best";
		String[] words = str.split(" "); // Split the string by spaces to get words

		// Reverse the words and print them
		for (int i = words.length - 1; i >= 0; i--) 
		{
			System.out.print(words[i] + (i > 0 ? " " : "")); 
			// Using conditional operator
			// Add space between words, but not after the last word
		}
	}

//	********** END ***********

	public static void reverse(String[] args) // change to main
	{
		String str = "All the best";
		char[] ch = str.toCharArray();
		String reversedStr = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			int wordEnd = i;
			while (i >= 0 && ch[i] != ' ') { // Use single quotes for char comparison
				i--;
			}

			int wordStart = i + 1;
			while (wordStart <= wordEnd) {
				reversedStr += ch[wordStart];
				wordStart++;
			}

			if (i >= 0) {
				reversedStr += ch[i]; // Add the space between words
			}
		}
		System.out.println(reversedStr);
	}
}
