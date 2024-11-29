package Pattern_Program;

/*
		 	*
		 	**
		 	***
		 	**** 
 
 The "*" are arranged in a right-aligned triangular shape,
 with each row increasing by one asterisk.
 
 */

public class Interview_RightAlignedAsteriskTriangle
{
	public static void main(String[] args) 
	{
		int n = 4;
		for (int i = 0; i < n; i++) // Outer loop for rows (1 to 4)
		{ 
			for (int j = 0; j < n; j++) // Inner loop for columns (1 to i)
			{ 
				if(i >= j) 
				{
				System.out.print("*" + " ");// Print a star without moving to the next line
				}
			}
			System.out.println(); // Move to the next line after printing all stars in a row
		}
	}
}
