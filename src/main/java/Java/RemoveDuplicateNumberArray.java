package Java;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateNumberArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 3, 4, 4, 5 };

		// Convert array to HashSet to remove duplicates
		HashSet<Integer> uniqueSet = new HashSet<>();
		for (int value : array) {
			uniqueSet.add(value);
		}

		// Convert HashSet back to array
		int[] uniqueArray = new int[uniqueSet.size()];
		int index = 0;
		for (int value : uniqueSet) {
			uniqueArray[index++] = value;
		}

		System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));

	}
}
