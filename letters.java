
public class letters {
    public static void main(String[] args) {
        String str="HelloWorld123@#";
        int uc=0,lc=0,dc=0,sp=0;
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z')
                uc++;
            else if(ch>='a'&&ch<='z')
                lc++;
            else if(ch>='0'&&ch<='9')
                dc++;
            else
                sp++;
        }
        System.out.println("No of Capital letters are "+uc);
        System.out.println("No of Small letters are "+lc);
        System.out.println("No of Digits are "+dc);
        System.out.println("No of Specaial characters are "+sp);
    }
}
