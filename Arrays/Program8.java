package Arrays;
import java.util.*;
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0,sum1=0;
		for(int i=0;i<n;i++)
		{
			
			if(a[i]==6)
			{
				while(a[i]!=7)
				{
					sum1=sum1+a[i];
					i++;
				}
				if(a[i]==7) {
					sum1=sum1+7;
					sum=sum-sum1;
				}
				else {
					sum=sum+sum1;
				}
			}
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
