package string_prgms;

import java.util.Scanner;

public class Pangram {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String");
	        
	        String str = sc.next();  
	        boolean rs = isPangram(str);  

	        if (rs) {
	            System.out.println("String is Pangram");
	        } else {
	            System.out.println("String is not Pangram");
	        }

	     }
	 
	 static boolean isPangram(String str) {
		 if(str.length()<26)
			 return false;
		 
		str= str.toLowerCase();
		 for(char ch='a';ch<='z';ch++)
		 {
			 if(str.indexOf(ch)==-1)
				 return false;
		 }
		 return true;
	 }
}
