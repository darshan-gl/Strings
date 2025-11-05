	package string_prgms;

import java.util.Scanner;

public class Swap_fst_to_last {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();  

        String str = SwapfasttoLast(st);
        System.out.println(" String: " + str);
    }

    static String SwapfasttoLast(String str) {
    	if(str.length()<=1)
    		return str;
    	char [] ch=str.toCharArray();
    	
    	char temp=ch[0];
    	ch[0]=ch[ch.length-1];
    	ch[ch.length-1]=temp;
    	return new String(ch);
    }
}
