package StringProgram;

public class Count_Words_String {

	public static void main(String[] args) {
		String str = "Java is a programming language";
		char[] ch = str.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			if ((i == 0 && ch[i] != ' ') || (ch[i] != ' ' && ch[i - 1] == ' ')) {
				count++;
			}
		}
		System.out.println("The total number of words in the string is: " + count);
	}
}
/*
 * Word Counting Logic: 
 * The first condition (i == 0 && ch[i] != ' ') 
 * checks if the first character is not a space, which means the string starts with a word.
 * 
 * The second condition (ch[i] != ' ' && ch[i - 1] == ' ') 
 * checks if the current character is not a space, but the previous character is a space,
 * indicating the start of a new word.
 */