package Java;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 15; // 15/2=7 , 1
		int count = 0;

		for (int i = 2; i <= 2; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}
}
