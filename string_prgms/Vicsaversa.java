package string_prgms;

import java.util.Scanner;

public class Vicsaversa {
	
	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string");
	        String st = sc.nextLine();  
	        
	        String str = VicaVersa(st);
	        System.out.println("Capitalized String:"+str);
	     
	    }

	    static String VicaVersa(String str) {
	    	
	        char[] ch=str.toCharArray();
	        
	        for(int i=0;i<ch.length;i++) {
	            
	                if (ch[i]>='a'&&ch[i]<='z') {
	                    ch[i]=(char)(ch[i]-32);  
	                }
	             
	            else 
	            {
	                if (ch[i]>='A'&&ch[i]<='Z') {
	                    ch[i]=(char)(ch[i]+32);  
	                }
	            }
	        }

	        String strs = new String(ch);  
	        return strs;  
	    }


}
