package StringProgram;

public class Convert_To_InitCap {

	public static void main(String[] args) {
		String input = "raJAt kumAr praDHan";
		String output = toInitCap(input);
		System.out.println(output); // Rajat Kumar Pradhan
	}

	public static String toInitCap(String str) {
		// Split the string into words based on space
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			// Capitalize the first letter and make the rest lowercase
			if (word.length() > 0) {
				  result.append(word.substring(0, 1).toUpperCase())
						.append(word.substring(1).toLowerCase())
						.append(" ");
			}
		}

		// Remove the last space and return the result
		return result.toString().trim();
	}

//	----*****---- End ----*****----	

	public static void rajat() { // Use main(String[] args)
		String str = "raJAt kumAr praDHanqwsd";
		String result = initCap(str);
		System.out.println("Converted string: " + result); // Rajat Kumar Pradhan
	}

	public static String initCap(String str) {
		char[] ch = str.toCharArray();

		// Handle the first character
		if (ch.length > 0 && ch[0] != ' ') {
			ch[0] = Character.toUpperCase(ch[0]);
		}

		// Iterate through the rest of the characters
		for (int i = 1; i < ch.length; i++) {
			// Capitalize if the previous character is a space
			if (ch[i - 1] == ' ' && ch[i] != ' ') {
				ch[i] = Character.toUpperCase(ch[i]);
			} else {
				ch[i] = Character.toLowerCase(ch[i]);
			}
		}
		return new String(ch);
	}
}
