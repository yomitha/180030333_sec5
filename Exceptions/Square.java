package Exceptions;
import java.util.*;
import java.io.*;
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    try
    {
    	int x=Integer.parseInt(s);
    	System.out.println(x*x);
    	System.out.println("Successful!");
    }
    catch(NumberFormatException e)
    {
    	System.out.println("Entered input is not a valid format for an integer");
    }
	}

}
