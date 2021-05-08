package Arrays;
import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("min value is:"+a[0]);
		System.out.println("max value is:"+a[n-1]);
		int max=a[0];
		for(int j=1;j<n;j++)
		{
			if(a[j]>max)
			{
				max=a[j];
			}
		}
		System.out.println(max);
		int min=a[0];
		for(int j=1;j<n;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
			}
		}
		System.out.println(min);

	}

}
