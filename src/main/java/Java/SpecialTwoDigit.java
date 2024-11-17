package Java;

/*
 * WAP to check the given number is special two digit number or not
 * 29
 * 2+9 = 11
 * 2*9 = 18
 * 		 29
 */
public class SpecialTwoDigit {

	public static void main(String[] args) {
		int specialNumber = 28;

		int removeLastDigit = specialNumber / 10;
		int getLastDigit = specialNumber % 10;

		int result = (removeLastDigit + getLastDigit) + (removeLastDigit * getLastDigit);
		if (result == specialNumber) {
			System.out.println(specialNumber + " is a specialNumber");
		} else {
			System.out.println(specialNumber + " is not a specialNumber");
		}

	}
}
