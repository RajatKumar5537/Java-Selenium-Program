package StringProgram;

public class Convert_To_InitCap2 {
	 public static void main(String[] args) {
	        String str = "raJAt kumAr praDHan";
	        String result = convertToDesiredFormat(str);
	        System.out.println(result);  // Output: rAJAT kUMAR pRADHAN
	    }

	    public static String convertToDesiredFormat(String str) {
	        String[] words = str.split(" ");
	        StringBuilder result = new StringBuilder();

	        // Process the first word: make it lowercase first letter, uppercase rest
	        result.append(words[0].substring(0, 1).toLowerCase())   // First letter lowercase
	              .append(words[0].substring(1).toUpperCase());      // Rest of the word uppercase

	        // Process the remaining words: first letter uppercase, rest lowercase
	        for (int i = 1; i < words.length; i++) {
	            result.append(" ")
	            	  .append(words[i].toUpperCase());   // Make remaining words fully uppercase
	        }

	        return result.toString();
	    }
}
