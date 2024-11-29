package Pattern_Program;

/*
		1 2 3 4 
		a b c d 
		1 2 3 4 
		a b c d 

The pattern involves alternating rows of numbers and letters.
*/

public class Number_Letter_Pattern_1234_abcd 
{
	public static void main(String[] args) 
	{
		 for (int i = 0; i < 4; i++) // Outer loop to control the rows (4 rows in total)
		 { 
	            int a = 1;  // 1 at the start of each row
	            char ch = 'a'; // 'a' at the start of each row

	            for (int j = 0; j < 4; j++) // Inner loop to control the columns (4 columns in each row)
	            { 
	                // Check if the row index 'i' is even or odd
	                if (i % 2 == 0) 
	                { 
	                    // For even rows (0, 2), print numbers incrementally
	                    System.out.print(a++ + " ");
	                } else { 
	                    // For odd rows (1, 3), print characters incrementally
	                    System.out.print(ch++ + " ");
	                }
	            }
	            // Move to the next line after completing a row
	            System.out.println();
		}
	}
}
