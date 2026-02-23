import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        //UC1
        displayWelcomeMessage();

        //UC2
        checkHardcodedPallindrome();
        //UC3
        checkPallindromeUsingloop();
        System.out.println("Application is ready for Pallindrome Processing");
    }


    //UC1 Logic
    public static void displayWelcomeMessage() {
        System.out.println("============================================");
        System.out.println("           PALLINDROME CHECKER APP          ");
        System.out.println("============================================");
        System.out.println("Application Version : 1.0.0");
        System.out.println("Developed for: Learning Git & Java");
        System.out.println("=============================================");
    }

    //UC2 Logic
    public static void checkHardcodedPallindrome() {
        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("WORD" + word + "Is Pallindrome");
        } else {
            System.out.println("WORD" + word + "Is not Pallindrome");
        }
    }

    //UC3 Logic
    public static void checkPallindromeUsingloop() {
        String word = "tanishq";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println("Result: " + word + " is a palindrome ✅");
        } else {
            System.out.println("Result: " + word + " is NOT a palindrome ❌");
        }

    }
}