public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {
        // Convert string to character array
        char[] chars = input.toCharArray();

        // Initialize two pointers
        int left = 0;
        int right = chars.length - 1;

        // Compare characters from both ends
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It is a palindrome
    }

    public static void main(String[] args) {
        String word = "madam";
        System.out.println(word + " is palindrome? " + isPalindrome(word));
    }
}