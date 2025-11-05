package string_prgms;

import java.util.Scanner;

public class Frequency_of_charc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();  

        frequencyCount(st);
    }

    static void frequencyCount(String str) {

        int[] ct = new int[256]; 

        for (int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
            ct[ch]++;
        }
 
        for (int i=0;i<ct.length;i++) {
            if (ct[i]!=0)
            {
                System.out.println((char) i+ " --> "+ct[i]);
            }
        }
    }
}
