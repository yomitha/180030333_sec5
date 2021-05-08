package Arrays;
import java.util.*;
public class Program5 {

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
		System.out.println("Min values are:");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println("Max values are:");
		System.out.println(a[n-1]);
		System.out.println(a[n-2]);

	}

}
