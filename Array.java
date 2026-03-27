import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        //  String array with 5 items
        String[] fruits = {"Apple", "Banana", "Cherry", "Durian", "Elderberry"};

        // Print entire array using a loop
        System.out.println("Fruits array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //  first and last item
        System.out.println("First fruit: " + fruits[0]);
        System.out.println("Last fruit: " + fruits[fruits.length - 1]);

        // Modify an item in the array
        fruits[2] = "Coconut";
        System.out.println("Modified array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // BONUS:  ArrayList (dynamic array)
        ArrayList<String> dynamicFruits = new ArrayList<>();
        dynamicFruits.add("Apple");
        dynamicFruits.add("Banana");
        dynamicFruits.add("Cherry");
        System.out.println("ArrayList fruits:");
        for (String fruit : dynamicFruits) {
            System.out.println(fruit);
        }
        dynamicFruits.add("Durian");
        System.out.println("Updated ArrayList:");
        for (String fruit : dynamicFruits) {
            System.out.println(fruit);
        }
    }
}