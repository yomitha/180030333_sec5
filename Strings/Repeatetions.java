package Strings;
import java.util.*;
public class Repeatetions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		String s1=s.substring(s.length()-n,s.length());
		String s2="";
		for(int i=0;i<n;i++)
		{
			s2=s2+s1;
		}
		System.out.println(s2);

	}

}
