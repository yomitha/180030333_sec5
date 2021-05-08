package session2;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		
		Boolean y=Character.isDigit(c);
		if(y)
		{
			System.out.println("Digit");
		}
		
		else if(c>='a' && c<='z')
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Special character");
		}

	}

}
