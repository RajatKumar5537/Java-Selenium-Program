package Java;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 4554;
		int temp = num;
		int rev = 0;

		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		if (temp == rev) {
			System.out.println(temp + " is a Palindrome");
		} else {
			System.out.println(temp + " is not a palindrom");
		}
	}

}