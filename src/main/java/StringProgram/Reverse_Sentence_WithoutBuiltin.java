package StringProgram;

public class Reverse_Sentence_WithoutBuiltin {

	public static void main(String[] args) 
	{
		String str = "All the best";
		char[] ch = str.toCharArray();
		String reversedStr = "";

		for (int i = ch.length - 1; i >= 0; i--) 
		{
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
