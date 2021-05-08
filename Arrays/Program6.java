package Arrays;
import java.util.*;
public class Program6 {

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
		for(int j=0;j<n;j++)
		{
			System.out.println(a[j]);
		}

	}

}
