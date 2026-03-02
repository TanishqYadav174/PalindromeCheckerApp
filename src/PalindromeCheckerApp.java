public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        // Step 1: Normalize the string
        // Convert to lowercase
        input = input.toLowerCase();

        // Remove spaces using regex
        input = input.replaceAll("\\s+", "");

        // Step 2: Apply two-pointer logic
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String test = "Madam In Eden Im Adam";

        if (isPalindrome(test)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}