package Pattern_Program;

/*
 	0 
	1 2 
	3 4 5 
	6 7 8 9
 */
public class Interview_NumberTriangle 
{
	public static void main(String[] args) 
	{
		int num = 0; // Initialize the starting number

		for (int i = 1; i <= 4; i++) // Outer loop for rows (1 to 4)
		{ 
			for (int j = 1; j <= i; j++) // Inner loop for columns (1 to i)
			{ 
				System.out.print(num++ + " "); // Print the current number and increment it
			}
			System.out.println(); // Move to the next line after printing all numbers in a row
		}
	}
}
