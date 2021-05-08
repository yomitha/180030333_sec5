package Arrays;

import java.util.Scanner;

import java.util.*;
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int search=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int flag=0;
		for(int j=0;j<n;j++)
		{
			if(a[j]==search)
			flag=1;
		}
		if(flag==1)
		{
			System.out.println(search+" is in the list");
		}
		else
		{
			System.out.println(search+" is not in the list");
		}

	}

}
