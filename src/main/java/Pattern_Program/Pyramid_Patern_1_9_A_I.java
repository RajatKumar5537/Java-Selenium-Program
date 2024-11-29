package Pattern_Program;

/*
     1 
   1 2 3 
  1 2 3 4 5 
 1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 9 

					     A 
					   A B C 
					  A B C D E 
					 A B C D E F G 
					A B C D E F G H I 


 */

public class Pyramid_Patern_1_9_A_I
{
	public static void main(String[] args) 
	{
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the number of lines");
//		int line = scanner.nextInt();
		int line = 5;

		for (int i = 1; i <= line; i++) // Outer loop for rows
		{ 
			int a = 1; 
			char ch = 'A'; 

			// Print leading spaces to align the pyramid
			for (int j = 1; j <= line - i; j++) 
			{
				System.out.print(" ");
			}

			// Print numbers for the current row
			for (int k = 1; k <= 2 * i - 1; k++) 
			{
//				System.out.print(a++ + " "); // Prints numbers (1, 2, 3...)
				System.out.print(ch++ + " "); //print letters (A, B, C...)
			}

			System.out.println(); // Move to the next line after each row
		}
	}
}
