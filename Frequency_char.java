
public class Frequency_char{
    public static void main(String[] args) {
        String st="java";
        frequencyCount(st);
    }

    static void frequencyCount(String str) {
        int[] ct=new int[128];
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++) {
            ct[ch[i]]++;
        }
        for(int i=0;i<128;i++) {
            if(ct[i]!=0) {
                System.out.println((char)i+" --> "+ct[i]);
            }
        }
    }
}
