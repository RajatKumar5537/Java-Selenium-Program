package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListProgram {

	public static void main(String[] args) {

//		ArrayList< String> arrayList = new ArrayList<String>();
		ArrayList al = new ArrayList();

		al.add("Rajat");
		al.add("Swarna");
		al.add(1);
		al.add(2);

		/*System.out.println(al);
		System.err.println(al.contains(1));
		al.remove(0);
		System.out.println("Aftere remove index 0 : " + al);
		al.add(0, "Rajat Kumar");
		System.out.println(al);
		
		for(int i = 0; i< al.size(); i++) {
			Object list = al.get(i);
			System.err.println("using Loop : "+list);
		}
		
		System.out.println(al.get(3));
		al.set(0, "Rajat from Odisha");
		System.out.println(al);
		System.out.println(al.isEmpty());*/
		
		
//		Iterator it = al.iterator();
//		while(it.hasNext()) {
//			System.out.println("Print element through Iterator : "+it.next());
//		}
		
		ArrayList <String >arrayList = new ArrayList();
//		arrayList.addAll(al);
		System.out.println(arrayList);
		arrayList.add("Rajat");
		arrayList.add("Swarna");
		arrayList.add("Raja");
		arrayList.add("Fiza");
		arrayList.add("Umakant");
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		Collections.sort(arrayList, Collections.reverseOrder());
		System.out.println("Reverse the string : "+arrayList);
		
		String[] str = {"Dog", "Cat", "Rat"};
		for (  String animal: str) {
			System.out.println(animal);
		}
		
		ArrayList alStr= new ArrayList(Arrays.asList(str));
		
		System.out.println("Convert string to ArrayList : "+alStr);
	}
}
