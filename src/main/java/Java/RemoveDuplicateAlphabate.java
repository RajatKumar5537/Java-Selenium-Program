package Java;

import java.util.HashSet;

public class RemoveDuplicateAlphabate {

	public static void main(String[] args) {
		// Using Time Complexity -------------------------

		String str = "aabbbbssssdfgggg";
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
	}
//		----*****---- End ----*****---- 

//		Without using Built in function -----------------------------

	public void removeDuplicateAlph() { // us main(String[] args)
		String str = "aabbbbssssdfgggg";
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
		System.out.print("After remove duplicates  : " + result1);
	}
}
