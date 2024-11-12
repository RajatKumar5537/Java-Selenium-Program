package Java;

/*
 * It is a number that is equal to the sum of
 * its own digits raised to the power of the number of digits.
 * Example: 153
 * Digits: 1, 5, 3
 * Calculation: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 * Since the sum equals the original number, 153 is an Armstrong number.
 */

public class ArmstrongNumber {

//	Time Complexity program ----------------
	public static void main(String[] args) {
		int num = 153;
		if (isArmstrong(num)) {
			System.out.println(num + " is an Armstrong number.");
		} else {
			System.out.println(num + " is not an Armstrong number.");
		}
	}

	// Function to check if a number is an Armstrong number
	public static boolean isArmstrong(int num) {
		int originalNum = num;
		int sum = 0;
		int numDigits = String.valueOf(num).length(); // O(n), finding the number of digits

		while (num > 0) {
			int rem = num % 10; // Extract the last digit
			sum += Math.pow(rem, numDigits); // Raise the digit to the power of numDigits
			num /= 10; // Remove the last digit
		}
		return sum == originalNum; // If sum equals the original number, it's an Armstrong number
	}

//	Math.pow() is a method in the Java Math class that takes two arguments. 
//	The first argument is the base (rem), and the second is the exponent (numDigits).
//	It returns the result of raising rem to the power of numDigits (rem^numDigits).
	
//	----*****---- End ----*****---- 

//	Without using Built in function ----- 
//	use @Test Annotation for this method 

	public static void armStrong() {
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
