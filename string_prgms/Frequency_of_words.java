package string_prgms;


import java.util.Scanner;

public class Frequency_of_words {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();

        frequencyCount(st);
    }

    static void frequencyCount(String str) {

        String[] words = str.split(" ");
        int[] count = new int[words.length];

        for(int i=0;i<words.length;i++)
        {
            count[i]=1;
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].equalsIgnoreCase(words[j])){
                    count[i]++;
                    words[j]="0"; // mark visited
                }
            }
        } 

        System.out.println("Word frequencies:");
        for(int i=0;i<words.length;i++){
            if(!words[i].equals("0")){
                System.out.println(words[i]+" --> "+count[i]);
            }
        }
    }
}
