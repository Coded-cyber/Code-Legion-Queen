public class Day4 {
    public static void main(String[] args) {
        // Boolean variables
        boolean isAdmin = true;
        boolean isModerator = false;

        // Comparisons
        System.out.println("isAdmin == true: " + (isAdmin == true));
        System.out.println("isModerator != true: " + (isModerator != true));
        System.out.println("isAdmin > isModerator: " + (isAdmin ? 1 : 0) + " > " + (isModerator ? 1 : 0) + " = " + (isAdmin && !isModerator));

        
        // If statements with comparisons
        if (isAdmin && !isModerator) {
            System.out.println("User is admin but not moderator");
        }

        // BONUS: Combine comparisons with and/or
        boolean isValidUser = isAdmin || isModerator;
        System.out.println("isValidUser: " + isValidUser);
    }
}