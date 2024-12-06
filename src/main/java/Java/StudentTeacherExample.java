package Java;

import java.util.ArrayList;
import java.util.List;

/*

1. Initialize two empty lists:
   - `teacher1List` for "Teacher-1"
   - `teacher2List` for "Teacher-2"

2. Loop through the array of strings:
   - For each `item` in the array:
     a. If `item` starts with "Student":
        i. Extract the student number by splitting the string on `"-"`
        ii. Convert the second part of the split into an integer (`studentNumber`)
        iii. Check the value of `studentNumber`:
            - If `studentNumber < 3`:
              Add `item` to `teacher1List`
            - Else:
              Add `item` to `teacher2List`
     b. If `item` starts with "Teacher":
        Ignore or store teacher names 

3. Output the lists:
   - Print students assigned to "Teacher-1" and "Teacher-2"
   
*/

public class StudentTeacherExample {
	public static void main(String[] args) {
		 String[] array = {"Student-1", "Student-2", 
				 		   "Student-0", "Student-4", 
				 		   "Student-5", "Student-8", 
				 		   "Teacher-1", "Teacher-2"};
	        
	        List<String> teacher1List = new ArrayList<>();
	        List<String> teacher2List = new ArrayList<>();

	        for (String item : array) {
	            if (item.startsWith("Student")) 
	            {
	                // Extract and parse student number
	                int studentNumber = Integer.parseInt(item.split("-")[1]);
	                if (studentNumber < 3) 
	                {
	                    teacher1List.add(item);
	                } else {
	                    teacher2List.add(item);
	                }
	            }
	        }
	        System.out.println("Students assigned to Teacher-1: " + teacher1List);
	        System.out.println("Students assigned to Teacher-2: " + teacher2List);
	    }
}
