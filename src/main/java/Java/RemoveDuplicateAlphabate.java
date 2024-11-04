package Java;

public class RemoveDuplicateAlphabate {

	public static void main(String[] args) {
		String str = "aabbbbssssdfgggg";
		String result = "";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			boolean isRepeat = false;
			// Check if character has already been added to result
			for (int j = 0; j < result.length(); j++) {
				if (ch[i] == result.charAt(j)) {
					isRepeat = true;
					break;
				}
			}

			// If character is not repeated, add it to result
			if (!isRepeat) {
				result = result + ch[i];
			}
		}

		// Print the final result after processing all characters
		System.out.print("After remove duplicates from the string : " + result);
	}

}
