package searchArray;

public class PalindromeChecker {

    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker();
        pc.isPalindrome("Racecar");

    }

    public void isPalindrome(String s) {
        String reverseString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverseString = reverseString + s.charAt(i);
        }

//        System.out.println(s);
//        System.out.println(reverseString);
        
        if (s.equalsIgnoreCase(reverseString)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
