package Pattern_Program;

/*
	a b c d e 
	a b c d e 
	a b c d e 
	a b c d e 
	a b c d e 
	
where the alphabet is printed in rows, 
with each row containing the same sequence of letters 
from 'a' to 'e'.
*/
public class AlphabetGrid_a_e 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 5; i++) 
		{
			// Initialize the character 'ch' to 'a' at the start of each row
			char ch = 'a';  
			for (int j = 0; j < 5; j++) 
			{
				// Print the current character and increment 'ch' to the next one
				System.out.print(ch++ + " ");
			}
			// Move to the next line after printing 5 characters
			System.out.println();
		}
	}
}
