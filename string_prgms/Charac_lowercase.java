package string_prgms;

import java.util.Scanner;

public class Charac_lowercase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String st = sc.next();
        st = toSmallestLetters(st);

        System.out.println("Converted to lowercase " + st);


    }

    static String toSmallestLetters(String str) 
    {
        char[]ch=str.toCharArray();

        for (int i=0;i<ch.length;i++) {
            if(ch[i]>='A'&& ch[i]<='Z') 
            {
                ch[i]=(char)(ch[i]+32); 
            }
        }

        return new String(ch);
    }
}
