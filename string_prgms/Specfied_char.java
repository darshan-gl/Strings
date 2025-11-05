
package string_prgms;

import java.util.Scanner;

public class Specfied_char {
	public static void main(String[] args) {
    	
    	Scanner sc =new Scanner(System.in);
    	System.out.println("Enter the string ");
    	String str = sc.nextLine();
        
    	System.out.println("Enter the specfic character ");
        char m =sc.next().charAt(0);
        
        int count =0;
        
        for(int i=0;i<str.length();i++) 
        {
        	char ch=str.charAt(i);
        	if(ch==m) 
        	{
        		count++;
        	}
        }
        
        System.out.println("The char '" +m+ "' count is "+count);
 }
}