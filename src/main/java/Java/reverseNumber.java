package Java;

public class reverseNumber {
	public static void main(String[] args) {
		int num = 123456;
		int rev = 0;
		System.out.println("Actual number  : " + num);
		while (num > 0) {
			int reminder = num % 10;
			rev = rev * 10 + reminder;
			num = num / 10;
		}

		System.out.println("Reverse number : " + rev);
	}
}
