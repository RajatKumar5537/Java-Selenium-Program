package StringProgram;

/*
 * I/P = Today is Monday
 * O/P = yadnom si yadot 
 */
public class Revers_String {
	public static void main(String[] args) {
		String str = "Today is Monday";
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse string is : " + reverse.toLowerCase());
	}
}
