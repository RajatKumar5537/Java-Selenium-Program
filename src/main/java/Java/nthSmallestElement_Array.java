package Java;

public class nthSmallestElement_Array {
	
	public static void main(String[] args) {
		int[] array = { 23, 45, 28, 56, 89, 45 };
		int n = 1; // Change this to find the nth smallest element you want
		int result = nthSmallest(array, n);
		if (result != -1) {
			System.out.println("The " + n + "th smallest element is : " + result);
		} else {
			System.out.println("The array does not have " + n + " distinct elements.");
		}
	}

	public static int nthSmallest(int[] array, int n) {
		for (int i = 0; i < array.length; i++) {
			int count = 0;

			for (int j = 0; j < array.length; j++) { // Count how many elements are smaller than array[i]
				if (array[j] < array[i]) {
					count++;
				}
			}
			// Check if count equals n - 1
			if (count == n - 1) {
				return array[i]; // Found the nth smallest element
			}
		}
		// If we don't find the nth smallest element
		return -1; // Indicate that there are not enough elements
	}
}
