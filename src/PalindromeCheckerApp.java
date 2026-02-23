import java.util.Stack;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        Stack<Character> stack = new Stack<>();


        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }


        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String word = "racecar";
        System.out.println(word + " is palindrome? " + isPalindrome(word));
    }
}