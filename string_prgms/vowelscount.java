package string_prgms;

import java.util.Scanner;

public class vowelscount {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the values");
		
		String str=sc.nextLine();
		
		int uc=0 ,lc=0,dc=0,sp=0, vc=0,cc=0;;
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if(ch=='A'||ch=='a'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='O'||ch=='o'||ch=='U'||ch=='u'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vc++;
			
		}
		
		System.out.println("No of vowels are "+vc);
		
	}
	}
