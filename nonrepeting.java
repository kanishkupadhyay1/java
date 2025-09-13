
import java.util.Scanner;

public class nonrepeting {
    public static char firstNonRepeatingChar(String s) {
        int[] freq = new int[256]; 
        int n = s.length();

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < n; i++) {
            if (freq[s.charAt(i)] == 1) return s.charAt(i);

        }
        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char res = firstNonRepeatingChar(text);
        if (res == '\0') System.out.println("No non-repeating character found.");
        else System.out.println("First non-repeating character: " + res);
    }
}

