package string_prgms;

import java.util.Scanner;

public class validpws {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password");
		String a=sc.next();

		if(isvalidpswd(a));
		System.out.print("Enter confirm password");
		String b = sc.next();
		if(!a.equals(b))
			throw new NullPointerException("paswword not match");

		if(!isvalidpswd(a)) {
			throw new ArithmeticException("password length should be >=8");	
		}

		boolean rs= isvalidpswd(a);
		if(rs) {
			System.out.println("password is correct");
		}
		else {
			System.out.println("password is incorrect");
		}
	}

	private static boolean isvalidpswd(String a) {


		boolean upper=false,lower=false,digit=false,charac=false,letter=false;

		char[] ch=a.toCharArray();

		for (char c : ch) 

		{
			if(Character.isAlphabetic(c)) {
				return true;
			}
			if(Character.isDigit(c)) {
				return true;
			}
			if(Character.isUpperCase(c)){
				return true;
			}
			if(Character.isLowerCase(c)) {
				return true;
			}

			if(Character.isLetterOrDigit(c)) {
				return true;
			}

		}


		return upper&&lower&&digit&&charac&&letter;

	}

}
