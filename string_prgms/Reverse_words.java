package string_prgms;
import java.util.Scanner;

public class Reverse_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String sentence = sc.nextLine();

        String ss = iword(sentence);
        System.out.println(ss);
    }

    static String iword(String sentence) {
        String rs = "";
        char ch[] = sentence.toCharArray();

        for(int i=0;i<ch.length;){
            int j=i;

            // find end of the word
            while(i<ch.length && ch[i]!=' '){
                i++;
            }

            // reverse the word
            int k=i-1;
            while(k>=j){
                rs=rs+ch[k];
                k--;
            }

            // add space if not last word
            if(i<ch.length){
                rs=rs+ch[i];
                i++; // move past space
            }
        }

        return rs;
    }
}
