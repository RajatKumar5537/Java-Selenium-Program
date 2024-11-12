package Java;

/*
 * The Fibonacci series is a sequence of numbers where each number is the sum 
 * of the two preceding ones, usually starting with 0 and 1. 
 * The beginning of the series is: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 * 0 + 1 = 1, 
 * 1 + 1 = 2, 
 * 1 + 2 = 3, 
 * 2 + 3 = 5, 
 * 3 + 5 = 8, 
 * 5 + 8 = 13, 
 * 8 + 13 = 21.
 */

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 1;
		int sum = 0; // Variable to hold the sum of the two preceding numbers

		System.out.println("First Fibonacci  : " + firstNum);
		System.out.println("Second Fibonacci : " + secondNum);

		for (int i = 2; i < 10; i++) { // Start from index 2 since 0 and 1 are already printed
			sum = firstNum + secondNum; // Calculate the next number in the Fibonacci series
			System.out.println("Next Fibonacci   : " + sum);
			firstNum = secondNum; // 1
			secondNum = sum; // 1
		}

	}
}
