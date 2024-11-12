package Java;

public class AvarageNumber {

	public static void main(String[] args) {

		int[] array = { 14, 26, 39, 49, 51 };
		int size = array.length;
		int sum = 0;

		for (int i = 0; i < size; i++) {
			sum = +array[i];
		}

		int avrg = sum / size;
		System.out.println("The avarage of all elements is : " + avrg);
	}

//	----*****---- End ----*****---- 

//	Time Complexity programm -- Use main(String[] args) for this method ..

	public static void avarageNumber() {
		int[] numbers = { 2, 4, 6 };
		double average = calculateAverage(numbers);
		System.out.println("The average is: " + average);
	}

	// Function to calculate average
	public static double calculateAverage(int[] numbers) {
		int sum = 0;

		// Calculate sum of the array elements, O(n)
		for (int num : numbers) {
			sum += num;
		}

		// Calculate and return average, O(1)
		return (double) sum / numbers.length;
	}

}
