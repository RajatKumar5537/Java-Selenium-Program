package Java;

import java.util.Scanner;

public class CountNumberDigit {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a number");
		int num = 12345; // scanner.nextInt();

		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("The total count of number : " + count);
	}
}
