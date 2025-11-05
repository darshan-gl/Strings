package string_prgms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        
        String str = sc.next();  
        boolean rs = isPalindrome(str);  

        if (rs) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

     }

    static boolean isPalindrome(String str) {
        int low=0;
        int high=str.length()-1;

        while (low<high) {
            if (str.charAt(low)!= str.charAt(high)) {
                
            	return false;
            }
            
            low++;
            high--;
        }

        return true;
    }
}
