package StringProgram;

public class SwapStrings {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";

//		String temp = str1;
//		str1 = str2;
//		str2 = temp;

		// Swap logic without a temporary variable
		str1 = str1 + str2; // Concatenate str1 and str2 -: HelloWorld
		str2 = str1.substring(0, str1.length() - str2.length()); // Assign the first part to str2
		str1 = str1.substring(str2.length()); // Assign the remaining part to str1

		System.out.println("After Swap:");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
	}
}
