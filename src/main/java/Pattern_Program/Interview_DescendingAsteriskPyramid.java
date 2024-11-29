package Pattern_Program;

/*
			 	****
			 	***
			 	**
			 	*
 
 The pattern of asterisks 
 The "*" start with four in the first row 
 and decrease by one in each subsequent row, 
 forming a pyramid shape.
 
 */
public class Interview_DescendingAsteriskPyramid 
{
	public static void main(String[] args) 
	{	
		for (int i = 4; i >= 1; i--) // Outer loop for rows (4 to 1)
		{ 
			for (int j = 1; j <= i; j++) // Inner loop for columns (1 to i)
			{ 
				System.out.print("*"); // Print a star without moving to the next line
			}
			System.out.println(); // Move to the next line after printing all stars in a row
		}
	}
}
