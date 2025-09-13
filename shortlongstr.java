package week1lab;

import java.util.*;
public class shortlongstr
{
    public static String count(String x){
        int c=0;
        char arr[]=x.toCharArray();
        for(char v: arr){
            c++;
        }
        return String.valueOf(c);
        
    }
    public static String[][] words(String text){
        int x=0,y=1;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
               
                y++;
            }
        }
        String word[][]=new String[y][2];
        for (int i = 0; i < y; i++) {
        word[i][0] = ""; 
    }
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)!=' '){
                word[x][0]+=text.charAt(i);
            }else{
                x++;
            }
        }
        for(int i=0;i<word.length;i++){
            word[i][1]=count(word[i][0]);
        }
        
        return word;
    }
    
    public static String[] maxmin(String[][] words){
        String mm[]=new String[2];
        int max=0,maxln=Integer.parseInt(words[0][1]);
        for(int i=1;i<words.length;i++){
            if(Integer.parseInt(words[i][1])>maxln){
                maxln=Integer.parseInt(words[i][1]);
                max=i;
            }
        }
        
        int min=0,minln=Integer.parseInt(words[0][1]);
        for(int i=1;i<words.length;i++){
            if(Integer.parseInt(words[i][1])<minln){
                minln=Integer.parseInt(words[i][1]);
                min=i;
            }
        }
        mm[0]=words[min][0];
        mm[1]=words[max][0];
        return mm;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String text=sc.nextLine();
		String manualsort[][]=words(text);
		String matrix[]=maxmin(manualsort);
		
		System.out.println("the words with maximum and minimum length are as follows:");
		System.out.println(matrix[0]+" (Min) "+matrix[1]+" (max)");
		

	}
}

