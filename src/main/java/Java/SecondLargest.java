package Java;

public class SecondLargest {

	public static void main(String[] args) {

		int[] a = { 1008, 40, 384, 24789 };
		int largest1 = a[0];
		int largest2 = a[1];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest1) {
				largest2 = largest1;
				largest1 = a[i];
			} else if (a[i] > largest2) {
				largest2 = a[i];
			}
		}
		System.out.println("The second largest number is : " + largest2);
	}
}
