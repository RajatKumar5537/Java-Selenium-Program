package Java;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 18;
		int count = 0;
		int i = 2;
		while (i <= num / 2) {
			if (num % i == 0) {
				count++;
				break;
			}
			i++;
		}
		if (count == 0) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}
}
