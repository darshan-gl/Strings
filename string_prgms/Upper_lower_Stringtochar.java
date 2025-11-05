package string_prgms;

import java.util.Scanner;

public class Upper_lower_Stringtochar {
    public static void main(String[] args) {
    	
    	Scanner sc =new Scanner(System.in);
    	System.out.println("enter the string");
    	
        String str = sc.nextLine();
        int  uc=0,lc=0;
        for(int i=0;i<str.length();i++) 
        {
        	char ch=str.charAt(i);
        	if(ch>=64&&ch<=90) 
        	{
        		uc++;
        	}
        		else if(ch>=97&&ch<=122)
        	{
        		lc++;
        	}
        		
        	}
        System.out.println("uppercase lettres are "+uc);
        System.out.println("lowercase lettres are "+lc);
    }
    }

