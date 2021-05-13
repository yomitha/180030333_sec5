package Strings;
import java.util.*;
public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String s1="";
		if(a.length()==b.length())
		{
			for(int i=0;i<a.length();i++)
			{
				s1=s1+a.charAt(i)+b.charAt(i);
			}
				System.out.println(s1);
		}
		 if(a.length()<b.length())
		{
			for(int i=0;i<a.length();i++)
			{
				s1=s1+a.charAt(i)+b.charAt(i);
			}
		
		int x=b.length()-a.length();
		s1=s1+b.substring(b.length()-x,b.length());
		System.out.println(s1);
		}
		if(a.length()>b.length())
		{
			for(int i=0;i<b.length();i++)
			{
				s1=s1+a.charAt(i)+b.charAt(i);
			}
		
		int x1=a.length()-b.length();
		s1=s1+a.substring(a.length()-x1,a.length());
		System.out.println(s1);
		
		}

	}

}
