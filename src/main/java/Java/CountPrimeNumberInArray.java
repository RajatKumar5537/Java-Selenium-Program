package Java;

public class CountPrimeNumberInArray {

	public static void main(String[] args) {
		int[] array = { 3, 5, 6, 7, 33, 34,37,39,41,47 };
		int primeCount = countNumber(array);
		System.out.println("Number of prime numbers in the array : " + primeCount);
	}

	public static int countNumber(int[] array) {

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			boolean result = isPrime(array[i]);
			if (result) {
				count++;
			}
		}
		return count;
	}

	public static boolean isPrime(int i) {
		for (int j = 2; j <= 1 / 2; j++) {

			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
