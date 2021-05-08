package Arrays;
import java.util.*;
public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[n-1];
		for(int k=0;k<j;k++)
		{
			System.out.println(temp[k]);
		}

	}

}
