import java.util.Scanner;

public class uniquechar {
    
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            //  end
        }
        return count;
    }

    //  get unique characters
    public static char[] uniqueCharacters(String s) {
        int n = findLength(s);
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
            if (unique) {
                result[idx++] = c;
            }
        }
        // Trim  array
        char[] uniqueArr = new char[idx];
        for (int i = 0; i < idx; i++) {
            uniqueArr[i] = result[i];
        }
        return uniqueArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] unique = uniqueCharacters(text);
        System.out.println("Unique characters:");
        for (char c : unique) System.out.print(c + " ");
    }
}
