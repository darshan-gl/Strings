
public class Remove_dupicate {
    public static void main(String[] args) {
        String st="programming";
        String result=stringRemoveDuplicate(st);
        System.out.println("String after removing duplicates :"+result);
    }

    static String stringRemoveDuplicate(String st) {
        String rmv="";
        for(int i=0;i<st.length();i++) {
            char ch=st.charAt(i);
            if(rmv.indexOf(ch)==-1) {
                rmv=rmv+ch;
            }
        }
        return rmv;
    }
}
