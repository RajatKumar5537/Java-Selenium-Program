package Java;

import java.util.Scanner;

public class ReadNumberOfArray {

	public static void main(String[] args) {
		/*
		 * Scanner scanner= new Scanner(System.in);
		 * System.out.println("Enter the size of the Array"); int size=
		 * scanner.nextInt(); int [] a= new int[size];
		 * 
		 * System.out.println("Enter the value");
		 * 
		 * for (int i = 0; i<size; i++) { a[i] = scanner.nextInt(); }
		 * System.out.println("The element of Array : "); for (int i=0; i<size ; i++) {
		 * System.out.println(a[i]); }
		 */

		int[] a = { 1, 2, 3, 4, 5 }; 

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ ", ");
		}

	}

}
