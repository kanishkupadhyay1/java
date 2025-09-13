import java.util.*;
public class TextProcessor{
// TODO: Method to clean and validate input
public static String cleanInput(String input) {
// Remove extra spaces, convert to proper case
// Return cleaned string
input=input.trim().replaceAll("//s+", " ");
input=input.toUpperCase();
return input;
}
// TODO: Method to analyze text
public static void analyzeText(String text) {
// Count: words, sentences, characters
// Find: longest word, most common character
// Display statistics
int charcount=text.replaceAll(" ", "").length();
String word[]=text.split(" ");
int wordcount=word.length;
String []sentence=text.split("[.?!]+");
int sentencecount=sentence.length;
System.out.println("word count: "+wordcount);
System.out.println("Character count: "+charcount);
System.out.println("Sentence count: "+sentencecount);



}
// TODO: Method to create word array and sort alphabetically
public static String[] getWordsSorted(String text) {
    String text2=text.replaceAll("[//p{punct}]", " ");
    String words[]=text2.split(" ");
    Arrays.sort(words);
// Split text into words, remove punctuation, sort
// Return sorted array
return words;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("=== TEXT PROCESSOR ===");
// Your implementation here
// TODO: Create a text processor that:
// 1. Asks user for a paragraph of text
System.out.println("enter the text: ");
String str=scanner.nextLine();
// 2. Cleans and validates the input
String formated=cleanInput(str);
// 3. Analyzes the text (word count, character count, etc.)
analyzeText(formated);
// 4. Shows the words in alphabetical order
String alpha[]=getWordsSorted(formated);
System.out.println(alpha);
// 5. Allows user to search for specific words
System.out.println("enter the word: ");
String word=scanner.next();
for(int i=0;i<alpha.length;i++){
    if(alpha[i].equals(word)){
        System.out.println("word found at :"+i);
        break;
    }else{
        System.out.println("word not found");
    }
}
scanner.close();
}
}