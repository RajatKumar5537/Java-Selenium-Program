package Pattern_Program;

/*
	1 2 3 4 
	5 6 7 8 
	9 10 11 12 
	13 14 15 16 

 */
public class P_1234_16 
{
	public static void main(String[] args) 
	{
		int a = 1;
		// Outer loop for controlling the number of rows
		for (int i = 0; i < 4; i++) // Runs 4 times to create 4 rows
		{ 
			// Inner loop for controlling the number of columns in each row
			for (int j = 0; j < 4; j++) // Runs 4 times for each row
			{ 
				// Print the current value of 'a' followed by a space, then increment 'a'
				System.out.print(a++ + " ");
			}
			// Move to the next line after printing 4 numbers in a row
			System.out.println();
		}
	}
}
