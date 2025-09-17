

public class Specfied_char {
    public static void main(String[] args) {
        String str="Deep Learning";
        char m='e';
        int count=0;
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch==m) {
                count++;
            }
        }
        System.out.println("The char '"+m+"' count is "+count);
    }
}
