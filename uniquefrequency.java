
import java.util.Scanner;

public class uniquefrequency {
    
    //  get unique characters
    public static char[] uniqueCharacters(String s) {
        int n = s.length();
        char[] result = new char[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) result[idx++] = c;
        }
        char[] uniqueArr = new char[idx];
        for (int i = 0; i < idx; i++) uniqueArr[i] = result[i];
        return uniqueArr;
    }

    //  frequency
    public static String[][] charFrequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        char[] unique = uniqueCharacters(s);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] res = charFrequency(text);
        System.out.println("Character Frequencies:");
        for (String[] pair : res) {
            System.out.println(pair[0] + " -> " + pair[1]);
        }
    }
}
