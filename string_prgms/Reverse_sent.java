package string_prgms;
import java.util.Scanner;

public class Reverse_sent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String ss = isentence(sentence);
        System.out.println(ss);
    }

    static String isentence(String sentence) {
        String rs = "";
        char ch[] = sentence.toCharArray();

        for (int i=ch.length-1;i>=0; ) {
            int j=i;

            // Find the start of the word
            while(i>=0 && ch[i]!=' '){
                i--;
            }

            // Append the word
            int k=i+1;
            while (k<=j) {
                rs = rs+ch[k];
                k++;
            }
  
            // Append space if not at the start
            if (i>0){
                rs = rs+ch[i]; // add the space
            }

            i--; // move to next word
        }
 
        return rs;
    }
}
