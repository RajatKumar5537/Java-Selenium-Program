package Java;

public class NeonNumber {
	/*
	 * 9 -> (9) to the power squir --> 9*9=81 --> 8+1=9
	 */
	public static void main(String[] args) {
		int num = 9;
		String result = isNeon(num);
		System.out.println(num + result);
	}

	public static String isNeon(int num) {
		int sum = 0;
		int squir = sum + num;
		while (squir > 0) {
			int rem = squir % 10;
			sum = sum + rem;
			squir = squir / 10;
		}
		if (num == sum) {
			return " is a Neon";
		} else {
			return " is not a Noen";
		}
	}
}
