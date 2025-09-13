
import java.util.Scanner;

public class nestedfreq {
    public static String[] frequency(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[chars.length];
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        String[] result = new String[chars.length];
        int idx = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[idx++] = chars[i] + " -> " + freq[i];
            }
        }
        String[] finalRes = new String[idx];
        for (int i = 0; i < idx; i++) finalRes[i] = result[i];
        return finalRes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] res = frequency(text);
        System.out.println("Character Frequencies:");
        for (String r : res) System.out.println(r);
    }
}

