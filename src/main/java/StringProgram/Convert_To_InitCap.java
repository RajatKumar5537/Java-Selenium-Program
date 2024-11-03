package StringProgram;

public class Convert_To_InitCap {
	public static void main(String[] args) {
		String str = "raJAt kumAr praDHan";
		System.out.println("String: " + str);
		String result = initCap(str);
		System.out.println("Converted string: " + result);

	}

	public static String initCap(String str) {
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			// Capitalize the first character or a character after a space
			if (i == 0 && ch[i] != ' ' || (i > 0 && ch[i - 1] == ' ' && ch[i] != ' ')) {
				if (ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] = (char) (ch[i] - 32); // Convert to uppercase by subtracting 32
				}
			} else {
				// Convert the rest to lowercase if they are uppercase
				if (ch[i] >= 'A' && ch[i] <= 'Z') {
					ch[i] = (char) (ch[i] + 32); // Convert to lowercase by adding 32
				}
			}
		}
		return new String(ch);
	}

}
