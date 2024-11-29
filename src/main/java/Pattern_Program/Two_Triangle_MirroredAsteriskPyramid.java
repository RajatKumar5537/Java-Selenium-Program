package Pattern_Program;

/*
		*    *   
		**   **  
		***  *** 
		**** ****
 where the asterisks are arranged in two mirrored pyramid shapes, 
 with the number of asterisks increasing in each row.
 
 */
public class Two_Triangle_MirroredAsteriskPyramid 
{
	public static void main(String[] args) 
	{
		int n = 4;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			for (int j = 0; j < n; j++) 
			{
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
