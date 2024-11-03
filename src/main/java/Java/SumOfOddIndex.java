package Java;

public class SumOfOddIndex {

	public static void main(String[] args) {
		int[] a = { 12, 34, 65, 65, 67 };
		int size = a.length;
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				evenSum = evenSum + a[i];
			} else {
				oddSum = oddSum + a[i];
			}
		}

		System.out.println("The sum of Even number : " + evenSum);
		System.out.println("the sum of odd number : " + oddSum);
	}
}
