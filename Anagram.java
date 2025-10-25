
public class Anagram {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        boolean rs=isAnagram(str1,str2);
        System.out.println("Anagram status: "+rs);
    }

    static int[] countFreq(String str) {
        int[] ct=new int[26];
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z') {
                ct[ch-65]++;
            } else if(ch>='a'&&ch<='z') {
                ct[ch-97]++;
            }
        }
        return ct;
    }

    static boolean isAnagram(String st1,String st2) {
        if(st1.length()!=st2.length()) {
            return false;
        }
        int[] ct1=countFreq(st1);
        int[] ct2=countFreq(st2);
        for(int i=0;i<26;i++) {
            if(ct1[i]!=ct2[i]) {
                return false;
            }
        }
        return true;
    }
}
