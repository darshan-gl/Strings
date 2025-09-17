public class Reverse_sentence {
    public static void main(String[] args) {
        String sentence="Hii Myself Darshan";
        String reversed=reverseSentence(sentence);
        System.out.println("Reversed sentence");
        System.out.println(reversed);
    }

    static String reverseSentence(String sentence) {
        String rs="";
        char[] ch=sentence.toCharArray();
        for(int i=ch.length-1;i>=0;) {
            int j=i;
            while(i>=0&&ch[i]!=' ') {
                i--;
            }
            int k=i+1;
            while(k<=j) {
                rs=rs+ch[k];
                k++;
            }
            if(i>0) {
                rs=rs+' ';
            }
            i--;
        }
        return rs;
    }
}
