
public class Reverse_words {
    public static void main(String[] args) {
        String sentence="hello world java programming";
        String[] words=sentence.split(" ");
        String result="";
        for(int i=0;i<words.length;i++) {
            String reversedWord="";
            for(int j=words[i].length()-1;j>=0;j--) {
                reversedWord=reversedWord+words[i].charAt(j);
            }
            result=result+reversedWord;
            if(i!=words.length-1) {
                result=result+" ";
            }
        }
        System.out.println(result);
    }
}
