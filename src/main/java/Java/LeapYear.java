package Java;

import java.util.Scanner;

/*
 * WAP to check the given year is Leap year or not 
 */
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
//		int year = 2020;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a leap year ");
		}
	}
}
