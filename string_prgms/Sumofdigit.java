package string_prgms;

import java.util.Scanner;

public class Sumofdigit {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String");

	        String st = sc.next();
	        st = sumofdigits(st);

	        System.out.println("sumofdigits: " + st);
	        
	         
	    } 

	    static String sumofdigits(String str) {
	        char[] ch = str.toCharArray();
	        int sum =0;

	        for (int i=0;i<ch.length;i++) {

	            if (ch[i]>='0'&&ch[i]<='9') {
	                sum=sum+ch[i]-48;
	                
	            }
	        }
	        return Integer.toString(sum);
	    }
}