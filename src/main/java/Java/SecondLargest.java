package Java;

public class SecondLargest {

	public static void main(String[] args) {

		int[] a = { 1008, 40, 384, 24789 };
		int largest = a[0];
		int secondLargest = a[1];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			} else if (a[i] > secondLargest) {
				secondLargest = a[i];
			}
		}
		System.out.println("The second largest number is : " + secondLargest);
	}

//	----*****---- End ----*****---- 

//	Time Complexity program --- use main(String[] args) for this method 

	public static void secondLarget() {
		int[] numbers = { 3, 5, 7, 2, 8 }; // Example array
		int secondLargest = findSecondLargest(numbers);
		System.out.println("The second largest element is: " + secondLargest);
	}

	public static int findSecondLargest(int[] numbers) {
		if (numbers.length < 2) {
			throw new IllegalArgumentException("Array must contain at least two elements.");
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : numbers) {
			if (num > largest) {
				secondLargest = largest; // Update second largest
				largest = num; // Update largest
			} else if (num > secondLargest && num != largest) {
				secondLargest = num; // Update second largest only
			}
		}

		return secondLargest;
	}

}
