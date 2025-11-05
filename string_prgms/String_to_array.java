package string_prgms;
import java.util.Scanner;
public class String_to_array {
	
    public static void main(String[] args) {
    	
    	Scanner sc =new Scanner(System.in);
    	System.out.println("enter the string");
    	
        String str = sc.next();
        char[] ch = str.toCharArray(); 

        for (int i=0;i<ch.length;i++) 
        {
            System.out.println(i+" " + ch[i]);
        }
    }
}
