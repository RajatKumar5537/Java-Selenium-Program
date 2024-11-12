package StringProgram;

import java.util.Arrays;

/*
 * An anagram is a word, phrase, or name formed 
 * by rearranging the letters of another word, phrase, or name.
 */
public class Anagram_String {

	public static void main(String[] args) {
		String str1 = "DO G";
		String str2 = "god ";

		if (areAnagrams(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}

	public static boolean areAnagrams(String str1, String str2) {
		// Convert strings to lowercase and remove spaces
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		// If lengths differ, they can't be anagrams
		if (str1.length() != str2.length()) {
			return false;
		}

		// Convert to character arrays and sort
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// Check if sorted arrays are equal
		return Arrays.equals(arr1, arr2);
	}

	
//	----*****---- End ----*****---- 
	
	
//	Without using any Built in class -- use main(String[] arg)

	public static void anagram() {
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
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

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
		int[] count = new int[256];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 0 && ch < 256) {
				count[ch]++;
			}
		}
		return count;
	}

}
