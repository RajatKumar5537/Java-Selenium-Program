package Pattern_Program;

/*
 	*
 	**
 	***
 	**** 
 */
public class Interview_Increment_Star 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 4; i++) // Outer loop for rows (1 to 4)
		{ 
			for (int j = 1; j <= i; j++) // Inner loop for columns (1 to i)
			{ 
				System.out.print("*"); // Print a star without moving to the next line
			}
			System.out.println(); // Move to the next line after printing all stars in a row
		}
	}
}
