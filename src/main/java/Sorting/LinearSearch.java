package Sorting;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arrya");
		int size = sc.nextInt();
		System.out.println("Enter the element of array");
		
		
		int[] a = new int[size];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Before sorting ");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Enter the element to be searched ");

		int key = sc.nextInt();
		int c = 0;
		
		for (int i = 0; i < size; i++) 
		{
			if (a[i] == key) 
			{
				c++;
				break;
			} 
		}
		
		
		if (c == 1) {
			System.out.println(key + " is found inside array");
		} else {
			System.out.println(key + " is not found inside array");
		}
	}

}
