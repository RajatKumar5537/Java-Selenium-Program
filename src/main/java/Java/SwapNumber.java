package Java;

public class SwapNumber {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;

//		a = a + b;
//		b = a - b;
//		a = a - b;

//		System.out.println("a = " + a);
//		System.out.println("b = " + b);

		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
}
