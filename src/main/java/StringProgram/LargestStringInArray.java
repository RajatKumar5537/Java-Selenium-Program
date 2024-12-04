package StringProgram;

public class LargestStringInArray {

	public static void main(String[] args) {
		String[] arrays = { "Rajat", "RajatKumar", "Rajat Kumar Pradhan" };
		String largest = "";

		for (String str : arrays) {
			if (str.length() > largest.length()) {
				largest = str;
			}
		}
		System.out.println("The largest string is : " + largest);
	}
}
