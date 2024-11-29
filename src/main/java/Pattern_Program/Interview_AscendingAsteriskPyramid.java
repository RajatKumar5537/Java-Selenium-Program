package Pattern_Program;

/*
		    *
		   **
		  ***
		 ****
 
 The "*" start with one in the first row 
 and increase by one in each subsequent row, 
 forming an ascending pyramid shape.
 
 */

public class Interview_AscendingAsteriskPyramid
{
	public static void main(String[] args) 
	{
		int rows = 4; // Number of rows

		for (int i = 1; i <= rows; i++) 
		{
			// Print spaces
			for (int j = i; j < rows; j++) 
			{
				System.out.print(" ");
			}
			// Print stars
			for (int k = 1; k <= i; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
// Time Complexity
//"The time complexity is O(n²) 
//because we use nested loops: one for rows and two for spaces and asterisks."