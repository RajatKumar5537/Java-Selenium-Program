package Pattern_Program;

/*
 	1 
	2 2 
	3 3 3 
	4 4 4 4 

It describes a triangle-like structure 
where each row consists of repeating numbers.
*/

public class Interview_RepeatingNumberTriangle_1_4444 
{
	public static void main(String[] args) 
	{
		int num = 4;
		for (int i = 1; i <= num; i++) // Outer loop for rows (1 to 4)
		{
			for (int j = 1; j <= i; j++) // Inner loop for columns (1 to i)
			{
				System.out.print(i + " "); // Print the current row number 'i' in each column
			}
			System.out.println(); // Move to the next line after printing numbers in a row
		}
	}
}
