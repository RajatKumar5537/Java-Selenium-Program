package Java;

public class LargestElement {

	public static void main(String[] args) {

		int[] array = { 23, 55, 89, 34, 654 };
		int largest = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}

		System.out.println(largest);
	}
}
