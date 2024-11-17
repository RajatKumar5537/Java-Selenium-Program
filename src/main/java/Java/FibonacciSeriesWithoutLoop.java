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

	public static void fibonacci(int a, int b, int sum) {
		if (a == 0 && b == 1) {
			System.out.println("1st  number is : " + a);
		}

		if (sum >= 21) {
			return;
		}

		sum = a + b;
		System.out.println("Next number is : " + sum);

		a = b;
		b = sum;
		fibonacci(a, b, sum); // Recursive call to generate the next Fibonacci number.
	}

	public static void main(String[] args) {
		fibonacci(0, 1, 0); // Initial call to the Fibonacci method, starting with 0 and 1.
	}
}
