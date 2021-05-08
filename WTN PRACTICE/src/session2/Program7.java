package session2;

import java.util.Scanner;

public class Program7 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char x=sc.next().charAt(0);
		if(x>='A' && x<='Z')
		{
		System.out.println(Character.toLowerCase(x));
		}
		else
		{
			System.out.println(Character.toUpperCase(x));
		}
	}

}
