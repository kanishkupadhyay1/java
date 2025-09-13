
import java.util.Scanner;

public class frequency {
    public static String[][] charFrequency(String s) {
        int[] freq = new int[256];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i)]++;
        }
        String[][] result = new String[n][2];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (freq[c] > 0) {
                result[idx][0] = String.valueOf(c);
                result[idx][1] = String.valueOf(freq[c]);
                freq[c] = 0;
                idx++;
            }
        }
        String[][] finalRes = new String[idx][2];
        for (int i = 0; i < idx; i++) finalRes[i] = result[i];
        return finalRes;
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
