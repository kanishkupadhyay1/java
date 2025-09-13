
import java.util.Scanner;

public class palindrome {
    
    // logic 1
    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length()-1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // logic 2
    public static boolean isPalindromeRec(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindromeRec(s, start+1, end-1);
    }

    // logic 3
    public static boolean isPalindromeReverse(String s) {
        char[] orig = s.toCharArray();
        char[] rev = new char[orig.length];
        for (int i = 0; i < orig.length; i++) {
            rev[i] = s.charAt(orig.length-1-i);
        }
        for (int i = 0; i < orig.length; i++) {
            if (orig[i] != rev[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Logic1: " + isPalindrome(text));
        System.out.println("Logic2: " + isPalindromeRec(text,0,text.length()-1));
        System.out.println("Logic3: " + isPalindromeReverse(text));
    }
}

