package session2;
import java.util.*;
public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=2;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				c=c+1;
			}
		}
		if(c==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not prime");
		}

	}

}
