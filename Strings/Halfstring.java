package Strings;
import java.util.*;
public class Halfstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int x=s.length();
		if(x%2==0)
		{
		    String s1=s.substring(0,x/2);	
			System.out.println(s1);
		}
		else
		{
			System.out.println("null");
		}

	}

}
