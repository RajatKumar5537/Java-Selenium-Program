package Java;

import java.util.HashSet;

public class UniqueCombinations  {
	public static void main(String[] args) {
        String constant = "XYZ";
        String[] arrays = {"ABC", "DEF", "GHI"};

        HashSet<String> hashSet = new HashSet<>();

        for (String str : arrays) {
        	hashSet.add(str + " " + constant);
        }

        System.out.println("Unique Combinations:");
        for (String combination : hashSet) {
            System.out.println(combination);
        }
    }
}
