package string_prgms;

import java.util.Scanner;

public class Char_to_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a string:");
        
        String str = sc.next(); 

        char ch[] = str.toCharArray(); // Convert to character array

        String s = new String(ch); // Convert char[] to String (same as input)
        System.out.println(s); // Print the string

        String st = new String(ch); // Optional second String from char[]
    }
}
