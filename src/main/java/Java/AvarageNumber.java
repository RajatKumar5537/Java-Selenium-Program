package Java;

public class AvarageNumber {

	public static void main(String[] args) {

		int[] array = { 14, 26, 39, 49, 51 };
		int size= array.length;
		int sum = 0;

		for (int i = 0; i < size; i++) {
			sum =+ array[i];
		}
		
		int avrg = sum/size;
		System.out.println("The avarage of all elements is : "+ avrg);
	}
}
