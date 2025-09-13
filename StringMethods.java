import java.util.Scanner; 
 
public class StringMethods{ 

 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        // TODO: Ask user for their full name (first and last name) 
        System.out.println("Enter full name:");
        String name=scanner.nextLine();

        // TODO: Ask user for their favorite programming language
        System.out.println("Your favourate programming language:"); 
        String pl=scanner.nextLine();

        // TODO: Ask user for a sentence about their programming experience
        System.out.println("Your programming experience:");
        String ex=scanner.nextLine();
         
        // TODO: Process the input: 
        // 1. Extract first and last name separately 
         String names[]=name.split(" ");
         String first=names[0];
         String last=names[1];
         
        // 2. Count total characters in the sentence (excluding spaces) 
        int c=0;
        for(int i=0;i<ex.length();i++){
            if(ex.charAt(i)!=' '){
                c++;
            }
        }
        
        // 3. Convert programming language to uppercase 
       String upl= pl.toUpperCase();
        // 4. Display a formatted summary 
System.out.println("First name: "+first);
System.out.println(":Last name: "+last);   


System.out.println("Favourate programming language: "+upl);
System.out.println("Experience: "+ex);
System.out.println("No. of characters in sentence: "+c);
        scanner.close(); 
    } 
}