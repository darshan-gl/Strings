
public class Panagram {
    public static void main(String[] args) {
        String str="the quick brown fox jumps over the lazy dog";
        boolean rs=isPanagram(str);
        if(rs) {
            System.out.println("String is Panagram");
        } else {
            System.out.println("String is not Panagram");
        }
    }

    static boolean isPanagram(String str) {
        if(str.length()<26)
            return false;
        str=str.toLowerCase();
        for(char ch='a';ch<='z';ch++) {
            if(str.indexOf(ch)==-1)
                return false;
        }
        return true;
    }
}
