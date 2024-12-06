package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class HashMapExample {
	

    public static void main(String[] args) {
        // Step 1: Initialize an array
        int[] numbers = new int[10];
        Random rand = new Random();
        
        // Step 2: Put random numbers in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10); // Random number between 0 and 10
        }
        
        // Step 3: Shuffle the array
        List<Integer> numberList = new ArrayList<>();
        for (int num : numbers) {
            numberList.add(num);
        }
        Collections.shuffle(numberList);
        
        // Step 4: Concatenate the numbers into a string
        StringBuilder sb = new StringBuilder();
        for (int num : numberList) {
            sb.append(num).append(" ");
        }
        
        String concatenatedString = sb.toString().trim();
        
        // Step 5: Find the maximum number
        int max = Collections.max(numberList);
        
        HashMap<String, Object> hashMap = new HashMap<>(); 
       
        hashMap.put("Concatenated String", concatenatedString);  // Storing String
        hashMap.put("Maximum Value", Integer.valueOf(max));     // Storing Integer value
        
        // Print the results
        System.out.println("Concatenated String: " + concatenatedString);
        System.out.println("Maximum Value: " + max);
        System.out.println("HashMap Contents: " + hashMap);
    }

}
