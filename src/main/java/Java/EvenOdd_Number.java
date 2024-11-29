package Java;

public class EvenOdd_Number {
	public static void main(String[] args) 
	{
		int[] arrays = { 3, 4, 5, 6, 7, 8, 9 };
		String even = "";
		String odd = "";

		for (int i = 0; i < arrays.length; i++) 
		{
			int array = arrays[i];
			if (array % 2 == 0) 
			{
				even += array + " ";
			} else {
				odd += array + " ";
			}
		}
		
		System.out.println("Even numbers are : " + even.trim());
		System.out.println("Odd numbers are  : " + odd.trim());
	}
}
