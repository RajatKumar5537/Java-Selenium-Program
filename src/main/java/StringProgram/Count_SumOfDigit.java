package StringProgram;

public class Count_SumOfDigit {
	public static void main(String[] args) {
		String str = "Rajat@5537";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				sum = sum + (ch - '0'); // Convert the character to its integer value and add to sum
			}
		}
		System.out.println("The sum of digits in the string is : " + sum);
	}
}


//ch - '0' converts the character digit to its corresponding integer value. 
//For example, '5' - '0' results in 5.