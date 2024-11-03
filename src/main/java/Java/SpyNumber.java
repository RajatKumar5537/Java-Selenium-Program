package Java;

/*
 * A Spy Number is a number where the sum of its digits equals the product of
 * its digits. Example: 1124 Sum of digits: 1 + 1 + 2 + 4 = 8 Multiplication of
 * digits: 1 * 1 * 2 * 4 = 8 Since the sum and product/Multiplication are the
 * same, 1124 is a Spy Number.
 */
public class SpyNumber {
	
	public static void main(String[] args) {

		int spyNumber = 1124;
		String result = isSpy(spyNumber);
		System.out.println(spyNumber + result);
	}

	public static String isSpy(int spyNumber) {

		int sum = 0;
		int product = 1;
		while (spyNumber > 0) {
			int rem = spyNumber % 10; // Get last digit
			sum += rem;      // Add to sum
			product *= rem;  // Multiply to product
			spyNumber /= 10; // Remove last digit
		}
		if (sum == product) {
			return " is a Spy number";
		} else {
			return " is not a Spy number";
		}
	}

}
