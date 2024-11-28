package Pattern_Program;

/*
     * * * *
     * * * *
     * * * *
     * * * *
 */
public class FourStar 
{
	public static void main(String[] args) 
	{
		// Outer loop to control the number of rows
		for (int i = 0; i < 4; i++) // Runs 4 times (i = 0, 1, 2, 3)
		{ 
			// Inner loop to control the number of columns in each row
			for (int j = 0; j < 4; j++) 
			{ // Runs 4 times for each value of i (j = 0, 1, 2, 3)

				// Prints a star (*) without moving to the next line
				System.out.print("*");
			}
			// Moves to the next line after printing all stars in a row
			System.out.println();
		}
	}
}
