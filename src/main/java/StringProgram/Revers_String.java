package StringProgram;

public class Revers_String {

	public static void main(String[] args) {
		String str = "java";
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse string is : " + reverse);
	}
}
