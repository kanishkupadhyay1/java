package week1lab;

import java.util.*;

public class vovelcount{

    public static boolean check(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static char[] checkvowels(char arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (check(arr[i])) {
                count++;
            }
        }
        char vowel[] = new char[count];
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (check(arr[i])) {
                vowel[x] = arr[i];
                x++;
            }
        }
        return vowel;
    }

    public static char[] checkconsonants(char arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!check(arr[i]) && Character.isLetter(arr[i])) {
                count++;
            }
        }
        char consonant[] = new char[count];
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!check(arr[i]) && Character.isLetter(arr[i])) {
                consonant[x] = arr[i];
                x++;
            }
        }
        return consonant;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        char letters[] = str.toCharArray();
        
        char vowels[] = checkvowels(letters);
        char consonant[] = checkconsonants(letters);

        System.out.println("Vowels in the string are: ");
        for (int i = 0; i < vowels.length; i++) {
            System.out.print(vowels[i] + " ");
        }
        System.out.println();

        System.out.println("Consonants in the string are: ");
        for (int i = 0; i < consonant.length; i++) {
            System.out.print(consonant[i] + " ");
        }
		System.out.println();
		System.out.println("Number of vovels:"+vowels.length);
		System.out.println("Number of consonant:"+consonant.length);
    }
}
