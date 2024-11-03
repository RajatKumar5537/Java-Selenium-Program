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

public class FibonacciSeriesWithoutLoop {

	public static void fibonacci(int firstNum, int secondNum, int sum) {
		if (firstNum == 0 && secondNum == 1) {
			System.out.println("First Fibonacci number is : " + firstNum);
			System.out.println("Second Fibonacci number is : " + secondNum);
		}

		if (sum >= 21) {
			return;
		}
		
		sum = firstNum + secondNum;
		System.out.println("Next Fibonacci number is : " + sum);
		
		firstNum = secondNum;
		secondNum = sum;
		fibonacci(firstNum, secondNum, sum); // Recursive call to generate the next Fibonacci number.
	}

	public static void main(String[] args) {
		fibonacci(0, 1, 0);  // Initial call to the Fibonacci method, starting with 0 and 1.
	}
}
