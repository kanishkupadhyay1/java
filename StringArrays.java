public class StringArrays { 
     
    // Method to find the longest name
    public static String findLongestName(String[] names) { 
        String longest = "";
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > longest.length()) {
                longest = names[i];
            }
        }
        return longest;
    } 
     
    // Method to count names starting with a given letter (case-insensitive)
    public static int countNamesStartingWith(String[] names, char letter) { 
        int count = 0;
        letter = Character.toLowerCase(letter); // make letter lowercase
        for (int i = 0; i < names.length; i++) {
            if (!names[i].isEmpty() && Character.toLowerCase(names[i].charAt(0)) == letter) {
                count++;
            }
        }
        return count;
    } 

    // Method to format names into "Last, First"
    public static String[] formatNames(String[] names) { 
        String[] formatted = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String[] parts = names[i].split(" ");
            if (parts.length == 2) {
                formatted[i] = parts[1] + ", " + parts[0]; // "Last, First"
            } else {
                formatted[i] = names[i]; // if not in "First Last" format, leave unchanged
            }
        }
        return formatted;
    } 
     
    public static void main(String[] args) { 
        String[] students = {"kanishk upadhyay", "namish jindal", "jatin gupta", 
                             "suman pal", "David Wilson"}; 
         
        // Test findLongestName
        System.out.println("Longest Name: " + findLongestName(students));

        // Test countNamesStartingWith
        System.out.println("Names starting with 'A': " + countNamesStartingWith(students, 'A'));
        System.out.println("Names starting with 'D': " + countNamesStartingWith(students, 'd'));

        // Test formatNames
        String[] formatted = formatNames(students);
        System.out.println("Formatted Names:");
        for (String name : formatted) {
            System.out.println(name);
        }
    } 
}
