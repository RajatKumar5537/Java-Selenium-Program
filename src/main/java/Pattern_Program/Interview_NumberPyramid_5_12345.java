package Pattern_Program;

/*
    5
   45
  345
 2345
12345

 */

public class Interview_NumberPyramid_5_12345
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 6;
		
		for (int i = 1; i <= a; i++) // Outer loop for rows (1 to 4)
		{ 
			// Print leading spaces for alignment
			for (int j = 1; j <= a - i; j++) 
			{
				System.out.print(" ");
			}
			// Inner loop for printing the numbers in each row
			for (int j = b - i; j <= a; j++) 
			{
				System.out.print(j); // Print numbers in increasing order
			}
			System.out.println(); // Move to the next line after completing the row
		}
	}
}
