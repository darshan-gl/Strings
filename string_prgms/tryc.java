package string_prgms;

import java.util.Scanner;

public class tryc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value of a");
		int a = sc.nextInt();
		System.out.println("Enter a value of b");
		int b = sc.nextInt();
		
		int rs=isadd(a,b);
		System.out.println("ans" +rs);
		
	}

	private static int isadd(int a, int b) {
		try {
			return a-b;
		}
		
		finally
		{
		return a+b;	
		}
	
	}
}
