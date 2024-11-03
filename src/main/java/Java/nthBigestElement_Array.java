package Java;

public class nthBigestElement_Array {

	public static void main(String[] args) {
		int[] array = { 23, 45, 28, 56, 89 };
		int n = 1; // To find the nth biggest element you want
		int result = nthBiggest(array, n);
		if (result != -1) {
			System.out.println("The " + n + "th biggest element is : " + result);
		} else {
			System.out.println("The array does not have " + n + " distinct elements.");
		}
	}

	public static int nthBiggest(int[] array, int n) {
		for (int i = 0; i < array.length; i++) {
			int count = 0;

			for (int j = 0; j < array.length; j++) { // Count how many elements are greater than array[i]
				if (array[j] > array[i]) { // for smallest element -: (array[j] < array[i])
					count++;
				}
			}
			// Check if count equals n - 1
			if (count == n - 1) {
				return array[i]; // Found the nth biggest element
			}
		}
		// If we don't find the nth biggest element
		return -1; // Indicate that there are not enough distinct elements
	}
}