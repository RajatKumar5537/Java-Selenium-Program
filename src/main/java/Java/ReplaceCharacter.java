package Java;

/*
 * Input : "Deloitte"
 * Output: "deloiaae"

 */
public class ReplaceCharacter {
	public static void main(String[] args) {
		String str = "Deloitte";

		// Replace 't' with 'a'
		String modifiedStr = str.replace('t', 'a');

		System.out.println(modifiedStr.toLowerCase());
	}
	
	// ************** END **********

	public void replaceChar() {
		String str = "Deloitte";
		char[] charArray = str.toCharArray(); // Convert the string to a char array
		// StringBuilder to build the modified string
		StringBuilder modifiedStr = new StringBuilder(); 

		for (char ch : charArray) 
		{
			if (ch == 't') {
				modifiedStr.append('a'); // Replace 't' with 'a'
			} else {
				modifiedStr.append(ch); // Keep the other characters unchanged
			}
		}

		System.out.println(modifiedStr.toString());
	}

}
