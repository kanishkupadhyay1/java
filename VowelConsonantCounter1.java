package week1lab;

import java.util.Scanner;

public class VowelConsonantCounter1 {

    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); 
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] getCharTypes(String input) {
        String[][] result = new String[input.length()][2];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }

        return result;
    }

    public static void displayCharTypes(String[][] charTypes) {
        System.out.printf("%-10s%-15s%n", "Character", "Type");
        System.out.println("---------------------------");

        for (String[] row : charTypes) {
            System.out.printf("%-10s%-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        int[] result = countVowelsAndConsonants(userInput);
        System.out.println("Number of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);

        String[][] charTypes = getCharTypes(userInput);
        displayCharTypes(charTypes);

        scanner.close();
    }

    public static int[] countVowelsAndConsonants(String input) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            String type = checkCharType(input.charAt(i));
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }
}