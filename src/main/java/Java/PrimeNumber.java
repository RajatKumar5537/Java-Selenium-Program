package Java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		boolean result = isPrime(num);
		if (result) {
			System.out.println(num + " is a Prime number");
		} else {
			System.out.println(num + " is now a Prime number");
		}
	}

	public static boolean isPrime(int num) {

		int i = 2;
		while (i <= num / 2) {
			if (num % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
}
