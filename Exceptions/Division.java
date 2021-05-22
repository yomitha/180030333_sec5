package Exceptions;
import java.io.*;
import java.util.*;
public class Division {

	static double division(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    try
    {
    	double x=division(a,b);
    	System.out.println(x);
    	System.out.println("Successful!");
    }
    catch(ArithmeticException e)
    {
    	System.out.println("Arithmetic exception");
    }
	}

}
