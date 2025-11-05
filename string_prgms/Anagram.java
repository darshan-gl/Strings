package string_prgms;

import java.util.Scanner;

public class Anagram {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string");
        String str2 = sc.nextLine();

        boolean rs = isAnagram(str1, str2);
        System.out.println("Anagram status: " + rs);
    }
    
       static int[] countFreq(String str) {
        int[] ct = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ct[ch - 65]++;
            } else if (ch >= 'a' && ch <= 'z') {
                ct[ch - 97]++;
            }
        }
        return ct;
    }
    
   
    static boolean isAnagram(String st1, String st2) {
        if (st1.length() != st2.length()) {
            return false;         }

        int[] ct1 = countFreq(st1);
        int[] ct2 = countFreq(st2);

        for (int i = 0; i < 26; i++) {
            if (ct1[i] != ct2[i]) {
                return false;
            }
        }
        return true;
    }
}
