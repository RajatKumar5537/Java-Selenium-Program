package StringProgram;

public class Palindrome_String {

	public static void main(String[] args) {
		String str = "madam";
		boolean result = palindrome(str);
		if (result) {
			System.out.println(str + " -: is a palindrome");
		} else
			System.out.println(str + " -: is not a palindrome");
	}

	public static boolean palindrome(String str) {
		int i = 0; // Initialize an index variable to track the current character

		// Loop until we reach the middle of the string
		while (i <= str.length() / 2) {
			// Compare characters from the start and end of the string
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false; // If characters do not match, it's not a palindrome
			}
			i++; // Move to the next character
		}

		return true; // If all characters match, it is a palindrome
	}
}
