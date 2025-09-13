public class StringManipulation{ 
    public static void main(String[] args) { 
        // TODO: Create the same string "Java Programming" using 3 
//different methods: 
        // 1. String literal 
        // 2. new String() constructor 
        // 3. Character array 

        String str="Java Programming";
        String str1=new String("Java Programming");
        char str2[]={'j','a','v','a','p','r','o','g','r','a','m','m','i','n','g'};
        String str3=str2.toString();
         
        // TODO: Compare the strings using == and .equals() 
        // Print the results and explain the difference 
        System.out.println("using ==  (compare refrence of the objects)");
        System.out.println("str & str1: "+(str==str1));
        System.out.println("str1 & str2: "+(str1==str3));
        System.out.println("str & str2: "+(str==str3));
System.out.println();

        System.out.println("using .equalls():   (compares values or content)");
        System.out.println("str & str1: "+(str.equals(str1)));
        System.out.println("str1 & str2: "+(str1.equals(str3)));
        System.out.println("str & str2: " +(str.equals(str3)));
System.out.println();
         
        // TODO: Create a string with escape sequences that displays: 
        String unknown="Code\tis\tPoetry";
        System.out.println(unknown);
        // Programming Quote: 
        //     "Code is poetry" - Unknown 
        //     Path: C:\Java\Projects 


    } 
}