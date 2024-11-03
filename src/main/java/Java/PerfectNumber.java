package Java;

/*
 * A perfect number is a positive integer that is equal to the sum of its proper divisors,
 * excluding itself. For example:
 * 28 -> The divisors are 1, 2, 4, 7, and 14.
 * Sum of divisors: 1 + 2 + 4 + 7 + 14 = 28.
 * Since the sum of the proper divisors equals the number itself, 
 * 28 is a perfect number.
 */

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 28;
		String result = isPerfect(num);
		System.out.println(num + result);
	}

	public static String isPerfect(int num) {
		int sum = 0;

		// Loop to find all divisors and add them
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		if (sum == num) {
			return " is a perfect number";
		} else
			return " is not a perfect number";
	}
}
