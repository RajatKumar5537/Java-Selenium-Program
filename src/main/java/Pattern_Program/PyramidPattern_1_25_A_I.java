package Pattern_Program;

/*

    *
   ***
  *****
 *******
*********
											     A 
											   B C D 
											  E F G H I 
											 J K L M N O P 
											Q R S T U V W X Y
											
				 	1 
			   	  2 3 4 
			  	5 6 7 8 9 
			 10 11 12 13 14 15 16 
			17 18 19 20 21 22 23 24 25 

The pattern of asterisks 
arranged in a centered, pyramid shape, 
increasing in number with each row.

 */
public class PyramidPattern_1_25_A_I 
{
	public static void main(String[] args) 
	{
		int n = 5;
		
//		int a = 1;
//		char ch = 'A';

		for (int i = 1; i <= n; i++) // Outer loop for each row
		{
			for (int j = 1; j <= n - i; j++) // Inner loop for spaces
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) // Inner loop for stars (*)
			{
				System.out.print("*");
//				System.out.print(a++ + " ");
//				System.out.print(ch++ + " ");
			}
			System.out.println(); // Move to the next line after each row
		}
	}
}
