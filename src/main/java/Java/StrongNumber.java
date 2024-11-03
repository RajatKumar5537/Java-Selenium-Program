package Java;

/*
 * A strong number is a number where the sum of the factorial of its digits
 * is equal to the original number.
 * Example: 145 <--> 1! = 1, 4! = 4*3*2*1 = 24, 5! = 5*4*3*2*1 = 120
 *          1 + 24 + 120 = 145
 */
public class StrongNumber {
	
	public static void main(String[] args) {
		int num = 145;
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			int factorial = 1;
			while (rem >= 1) {
				factorial = factorial * rem;
				rem--;
			}
			sum = sum + factorial;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println(temp + " is a Strong number");
		} else
			System.out.println(temp + " is not a Strong number");
	}

}
