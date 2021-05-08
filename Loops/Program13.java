package session2;
import java.util.*;
public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			int c=2;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					c=c+1;
				}
			}
			if(c==2)
			{
				System.out.println(i);
			}
		}

	}

}
