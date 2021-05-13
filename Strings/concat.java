package Strings;
import java.util.*;
public class concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String p=s1.substring(s1.length()-1,s1.length());
		String q=s2.substring(0,1);
		System.out.println(p);
		System.out.println(q);
		if(p.equals(q))
		{
			String s4=s1+s2.substring(1,s2.length());
			System.out.println(s4.toLowerCase());
		}
		
		else
		{
			String s4=s1+" "+s2;
			System.out.println(s4.toLowerCase());
		}

	}

}
