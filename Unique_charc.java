
public class Unique_charc {
    public static void main(String[] args) {
        String st="Darshan";
        System.out.println("Unique characters are");
        uniquecharcatres(st);
    }

    static void uniquecharcatres(String st) {
        for(int i=0;i<st.length();i++) {
            char ch=st.charAt(i);
            if(st.indexOf(ch)==st.lastIndexOf(ch)) {
                System.out.println(ch);
            }
        }
    }
}
