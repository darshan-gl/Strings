package string_prgms;

import java.util.Scanner;

public class Frequency_alphabets {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string");
	        String st = sc.nextLine();  

	        frequencyCount(st);
	    }

	    static void frequencyCount(String str) {

	        int[] ct = new int[26]; 

	        for (int i=0; i<str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch >= 'A' && ch <= 'Z')
	                ct[ch - 65]++;
	            else if (ch >= 'a' && ch <= 'z')
	                ct[ch - 97]++;
	        }

	       
	        for (int i=0;i<26;i++) {
	            if (ct[i] != 0) {
	                System.out.println((char)(65+i) + " --> " + ct[i]);
	            }
	        }
	    }
}
