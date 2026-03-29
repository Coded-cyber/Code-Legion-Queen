public class ProfileCreator {
    public static void main(String[] args) {
        // Creating variables
        String name = "Laura";
        int age = 20;
        double height = 1.65;

        // math operations
        int nextYearAge = age + 1;
        double heightInCm = height * 100;

        //  strings
        String nameUppercase = name.toUpperCase();
        String nameLowercase = name.toLowerCase();
        int nameLength = name.length();

        //  boolean comparisons
        boolean isAdult = age >= 18;
        boolean isTall = height > 1.70;

        // Creation and modification of a list
        String[] hobbies = {"Reading", "Coding", "drawing"};
        System.out.println("Initial Hobbies:");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
        String newHobby = "Swimming";
        String[] updatedHobbies = new String[hobbies.length + 1];
        System.arraycopy(hobbies, 0, updatedHobbies, 0, hobbies.length);
        updatedHobbies[hobbies.length] = newHobby;
        hobbies = updatedHobbies;

        // Print profile info
        System.out.println("\nProfile Info:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " (Next year: " + nextYearAge + ")");
        System.out.println("Height: " + height + "m (" + heightInCm + "cm)");
        System.out.println("Name (uppercase): " + nameUppercase);
        System.out.println("Name (lowercase): " + nameLowercase);
        System.out.println("Name length: " + nameLength);
        System.out.println("Is adult: " + isAdult);
        System.out.println("Is tall: " + isTall);
        System.out.println("\nUpdated Hobbies:");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
    }
}