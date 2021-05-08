package programs;
import java.util.*;
public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);

	}

}
