package Pattern_Program;


/*
 	A B C D 
	E F G H 
	I J K L 
	M N O P 
	
The alphabet is printed in a grid format, 
with each row containing four consecutive letters.
*/
public class AlphabetGrid_A_P
{
	public static void main(String[] args) 
	{
		char ch = 'A';
		// Outer loop to control the number of rows
		for (int i = 0; i < 4; i++) // Runs 4 times to create 4 rows
		{ 
			// Inner loop to control the number of columns in each row
			for (int j = 0; j < 4; j++) // Runs 4 times within each row
			{ 
				// Print the current character followed by a space, then increment 'ch' to the
				System.out.print(ch++ + " ");
			}
			// Move to the next line after printing 4 characters in a row
			System.out.println();
		}
	}
}
