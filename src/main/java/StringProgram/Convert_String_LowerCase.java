package StringProgram;

public class Convert_String_LowerCase {
	public static void main(String[] args) {
		String str = "JAVA";

		System.out.println("Lowercase :  " + str.toLowerCase());
		System.out.println("Uppercase : " + str.toUpperCase());

//		----*****---- End ----*****----

		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] + 32); // for uppercase use -32
			}
		}
		String result = new String(ch);
		System.out.println("Lowercase :  " + result);

	}
}
