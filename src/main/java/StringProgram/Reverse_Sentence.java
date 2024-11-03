package StringProgram;

public class Reverse_Sentence {
	public static void main(String[] args) {
		String str = "All the best";
		String[] words = str.split(" "); // Split the string by spaces to get words

		// Reverse the words and print them
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + (i > 0 ? " " : "")); // Add space between words, but not after the last word
		}
	}
}
