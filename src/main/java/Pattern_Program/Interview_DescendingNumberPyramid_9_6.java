package Pattern_Program;

/*
 	9 8 7 6 
	9 8 7 
	9 8 
	9 
	
Where numbers start from 9 and descend in each row, 
forming a pyramid-like shape.
 */

public class Interview_DescendingNumberPyramid_9_6
{
	 public static void main(String[] args) 
	 {
	        for (int i = 4; i >= 1; i--) // Outer loop for rows (4 to 1)
	        { 
	            int num = 9; // Start the number from 9 for each row
	            for (int j = 1; j <= i; j++) // Inner loop for columns (1 to i)
	            { 
	                System.out.print(num-- + " "); // Print the current number and decrement it
	            }
	            System.out.println(); // Move to the next line after printing all numbers in a row
	        }
	    }
}
