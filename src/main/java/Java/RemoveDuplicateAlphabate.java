package Java;

import java.util.HashSet;

public class RemoveDuplicateAlphabate {

	public static void main(String[] args) {
		String str = "aabbbbssssdfgggg";

		// Using Time Complexity -------------------------

		StringBuilder result = new StringBuilder();
		HashSet<Character> hs = new HashSet<>();

		// Iterate through each character of the string
		for (char c : str.toCharArray()) {
			// If character hasn't been seen, append it to result
			if (hs.add(c)) {
				result.append(c);
			}
		}

		System.out.println("After removing duplicates from the string: " + result.toString());

//		----*****---- End ----*****---- 

//		Without using Built in function -----------------------------

		String result1 = "";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			boolean isRepeat = false;
			// Check if character has already been added to result
			for (int j = 0; j < result1.length(); j++) {
				if (ch[i] == result1.charAt(j)) {
					isRepeat = true;
					break;
				}
			}

			// If character is not repeated, add it to result
			if (!isRepeat) {
				result1 = result1 + ch[i];
			}
		}

		// Print the final result after processing all characters
		System.out.print("After remove duplicates  : " + result1);

	}

}
