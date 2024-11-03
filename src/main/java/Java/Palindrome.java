package Java;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

	public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // Example array
        List<List<Integer>> subsets = generateSubsets(arr);
        
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

    public static List<List<Integer>> generateSubsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        
        for (int num : arr) {
            int n = result.size();
            for (int i = 0; i < n; i++) {
                List<Integer> newSubset = new ArrayList<>(result.get(i));
                newSubset.add(num);  // Add the current number to this subset
                result.add(newSubset);  // Add the new subset to the result
            }
        }
        
        return result;
    }
}	