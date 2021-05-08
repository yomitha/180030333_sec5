package session2;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char x=sc.next().charAt(0);
		if(x=='R')
		{
			System.out.println("Red");
		}
		else if(x=='B')
		{
			System.out.println("Blue");
		}
		else if(x=='G')
		{
			System.out.println("Green");
		}
		else if(x=='O')
		{
			System.out.println("Orange");
		}
		else if(x=='Y')
		{
			System.out.println("Yellow");
		}
		else if(x=='W')
		{
			System.out.println("White");
		}
		else 
		{
			System.out.println("Invalid");
		}

	}

}
