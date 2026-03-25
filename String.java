public class Day3 {
    public static void main(String[] args) {
        String name = "Meta";

        // Conversions
        System.out.println(name.toUpperCase()); 
        System.out.println(name.toLowerCase()); 

        // Length
        System.out.println(name.length()); 

        // Characters at index
        System.out.println(name.charAt(0)); 
        System.out.println(name.charAt(2)); 

        // BONUS: Substring
        System.out.println(name.substring(0, 3)); 
        System.out.println(name.substring(name.length() - 3)); 
    }
}