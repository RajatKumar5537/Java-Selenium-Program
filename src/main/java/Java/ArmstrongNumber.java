package Java;

/*
 * An Armstrong number is a number that is equal 
 * to the sum of its own digits raised to the power of the number of digits.
 * Example: 153
 * Digits: 1, 5, 3
 * Calculation: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 * Since the sum equals the original number, 153 is an Armstrong number.
 */

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153; // Number to check
		int temp = num; // Backup of the original number
		int backUp = temp; // Another backup for final comparison

		int sum = 0; // To hold the sum of the digits raised to the power of count
		int count = 0; // To count the number of digits

		// Count the number of digits in the original number
		while (num > 0) {
			num = num / 10; // Remove the last digit
			count++; // Increment digit count
		}

		// Reset temp to the original number to calculate the Armstrong condition
		while (temp > 0) {
			int rem = temp % 10; // Get the last digit
			int power = count; // Set power to the number of digits
			int product = 1; // Initialize product to calculate the power

			// Calculate the power of the digit (rem) raised to the count
			while (power > 0) {
				product = product * rem; // Multiply to find rem raised to count
				power--; // Decrement power
			}

			sum = sum + product; // Add the calculated power to the sum
			temp = temp / 10; // Remove the last digit
		}

		if (backUp == sum) {
			System.out.println(backUp + " Armstrong number");
		} else
			System.out.println(backUp + " not a Armstrong number");

	}
}
