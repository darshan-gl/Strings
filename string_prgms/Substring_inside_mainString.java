package string_prgms;

import java.util.Scanner;

public class Substring_inside_mainString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String ss = sc.nextLine();

        System.out.println("Enter the second string");
        String ms = sc.nextLine();

        boolean rs = issubstring(ms, ss);
        if(rs) {
        	System.out.println("both string same");
        }
        else {
        	System.out.println("strings are not same");
        }
    }
    static boolean issubstring(String ms,String ss) {
    	return ms.equals(ss);
    }
}