package Java;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateNumberArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 4, 4, 5 };

		// Convert array to HashSet to remove duplicates
		HashSet<Integer> uniqueSet = new HashSet<>();
		for (int num : nums) {
			uniqueSet.add(num); // O(1) on average
		}

		// Convert the set back to an array (O(n) complexity)
		Integer[] result = uniqueSet.toArray(new Integer[0]);
		System.out.println("Nums without duplicates: " + Arrays.toString(result));

	}
}
