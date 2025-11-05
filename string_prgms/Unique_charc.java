package string_prgms;

import java.util.Scanner;

public class Unique_charc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();  

        System.out.println("Unique characters are");
        uniquecharcatres(st);  

       
    }

    static void uniquecharcatres(String st) {
        for (int i=0;i<st.length();i++) {
            char ch=st.charAt(i);
            
            if (st.indexOf(ch) == st.lastIndexOf(ch)) {
                System.out.print(ch);
            }
        }
    }
}
