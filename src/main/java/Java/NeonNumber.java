package Java;

/*
 * A Neon Number is a number where the sum of the digits of the square of the number
 * is equal to the original number.
 * Example: 9
 * Square of 9: 9 * 9 = 81
 * Sum of the digits of 81: 8 + 1 = 9
 * Since the sum of the digits equals the original number, 9 is a Neon Number.
 */
public class NeonNumber {
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
