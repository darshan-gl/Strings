package string_prgms;

import java.util.Scanner;

public class Stringtosysmbol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String st = sc.next();
        String symbol = "";

        for (int i=0;i<st.length();i++) 
        {
            char ch = st.charAt(i);

            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                symbol = symbol + '@';
            } 
            else 
            {
                symbol = symbol + ch;
            }
        }

        System.out.println("Modified string is: " + symbol);

    }
}
