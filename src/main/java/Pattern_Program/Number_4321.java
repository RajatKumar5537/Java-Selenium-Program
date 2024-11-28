package Pattern_Program;

/*
	4 3 2 1 
	4 3 2 1 
	4 3 2 1 
	4 3 2 1 
*/
public class Number_4321 {
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 4; i++) 
		{ // Loop for 4 rows
			for (int j = 4; j >= 1; j--) 
			{ // Loop to print 4321
				System.out.print(j + " ");
			}
			System.out.println(); // Move to the next line
		}
	}
}
