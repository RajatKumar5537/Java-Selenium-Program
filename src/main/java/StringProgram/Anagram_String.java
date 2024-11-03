package StringProgram;

/*
 * An anagram is a word, phrase, or name formed 
 * by rearranging the letters of another word, phrase, or name.
 */
public class Anagram_String {
	public static void main(String[] args) {
		String str1 = "GOD";
		String str2 = "dog";

		boolean result = anagram(str1, str2);
		if (result) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}

	// Method to check if two strings are anagrams
	public static boolean anagram(String str1, String str2) {
		// Get the occurrence count of characters in both strings
		int[] count1 = occurrences(str1);
		int[] count2 = occurrences(str2);

		for (int i = 0; i < count1.length; i++) { // Compare the occurrence counts
			if (count1[i] != count2[i]) {
				return false; // If counts differ, strings are not anagrams
			}
		}
		return true; // Strings are anagrams if all counts match
	}

	// Method to count occurrences of each character in the string
	public static int[] occurrences(String str) {
		int[] count = new int[26]; // Array to hold counts of letters A-Z

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				count[ch - 'A']++; // Increment the count for this character
			}
			if (ch >= 'a' && ch <= 'z') {
				count[ch - 'a']++; // Increment the count for this character
			}
		}
		return count;
	}

}
