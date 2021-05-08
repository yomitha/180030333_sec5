package Arrays;
import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<n;j++)
		{
			sum=sum+a[j];
		}int avg=sum/n;
		System.out.println(sum);
		System.out.println(avg);

	}

}
