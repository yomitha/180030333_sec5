package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    try
	    {
	    	int search=sc.nextInt();
	    	System.out.println("Value at "+search+" is "+a[search]);
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.out.println("java.lang.ArrayIndexOutOfBoundsException");
	    }
	    catch(NumberFormatException num)
	    {
	      System.out.println("java.lang.NumberFormatException");
	    }
	}

}
