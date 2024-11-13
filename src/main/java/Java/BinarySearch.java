package Java;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] a = { 20, 30, 70, 40, 45, 67 };

		Arrays.sort(a);
		int key = 40;
		int low = 0;
		int high = a.length - 1;
		int mid = (low + high) / 2;

		while (low <= high) {
			System.out.println("Binary searching");
			if (a[mid] == key) 
			{
				System.out.println(key + " is found");
				break;
			} else if (a[mid] > key) 
			{
				high = mid - 1;
			} else 
			{
				low = mid + 1;
				mid = (low + high) / 2;
			}

			if (low > high) {
				System.out.println(key + " is not found");
			}
		}
	}
}
