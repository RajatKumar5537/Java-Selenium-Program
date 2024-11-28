package Pattern_Program;

/*
 	1 1 1 1 
	2 2 2 2 
	3 3 3 3 
	4 4 4 4 
*/
public class P_1_1_1_1_To_4_4_4_4 
{
	public static void main(String[] args) 
	{
		int a = 1; // Initialize the starting number

		// Outer loop for controlling the number of rows
		for (int i = 0; i < 4; i++) // Runs 4 times to create 4 rows
		{ 

			// Inner loop for controlling the number of columns in each row
			for (int j = 0; j < 4; j++) // Runs 4 times for each row
			{ 
				// Print the current value of 'a' followed by a space
				System.out.print(a + " ");
			}
			// Increment 'a' after finishing one row
			a++;
			// Move to the next line after printing 4 values in a row
			System.out.println();
		}
	}
}
