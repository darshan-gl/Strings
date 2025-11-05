package string_prgms;

import java.util.Scanner;

public class Last_char_to_small {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();  
        
        String str = Laststring(st);
        System.out.println("lastCapitalized String:"+str);
     
    }

    static String Laststring(String str) {
    	
        char[] ch=str.toCharArray();
        
        for(int i=0;i<ch.length;i++) {
            if (i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') 
            {
                if (ch[i]>='a'&&ch[i]<='z') {
                    ch[i]=(char)(ch[i]-32);  
                }
            } 
            else 
            {
                if (ch[i]>='A'&&ch[i]<='Z') {
                    ch[i]=(char)(ch[i]+32);  
                }
            }
        }

        String strs = new String(ch);  
        return strs;  
    }
	
	
}
