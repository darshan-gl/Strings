
public class validpws{
    public static void main(String[] args) {
        String a="Incorrect1234@";
        String b="Incorrect1234@";

        if(!a.equals(b))
            throw new NullPointerException("password not match");

        if(!isvalidpswd(a))
            throw new ArithmeticException("password length should be >=8");

        boolean rs=isvalidpswd(a);
        if(rs)
            System.out.println("password is correct");
        else
            System.out.println("password is incorrect");
    }

    private static boolean isvalidpswd(String a) {
        if(a.length()<8)
            return false;
        boolean upper=false,lower=false,digit=false,charac=false,letter=false;
        char[] ch=a.toCharArray();
        for(char c:ch) {
            if(Character.isUpperCase(c))
                upper=true;
            else if(Character.isLowerCase(c))
                lower=true;
            else if(Character.isDigit(c))
                digit=true;
            else
                charac=true;
            if(Character.isLetter(c))
                letter=true;
        }
        return upper&&lower&&digit&&charac&&letter;
    }
}
