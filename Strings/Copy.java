package Strings;
import java.util.*;
public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		String s1="";
		String s2=s.substring(0,2);
		for(int i=0;i<n;i++)
		{
			s1=s1+s2;
		}
		System.out.println(s1);

	}

}
