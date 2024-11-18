package StringProgram;

public class Convert_To_InitLow {
	 public static void main(String[] args) {
	        String str = "raJAt kumAr praDHan";
	        String result = toInitLow(str);
	        System.out.println(result);  // Output: rAJAT kUMAR pRADHAN
	    }

	    public static String toInitLow(String str) {
	        String[] words = str.split(" ");
	        StringBuilder result = new StringBuilder();
	        
	    	for (String word : words) {
	        result.append(word.substring(0, 1).toLowerCase())   // First letter lowercase
	              .append(word.substring(1).toUpperCase())
	              .append(" ");      
	    	}

	        return result.toString();
	    }
}
