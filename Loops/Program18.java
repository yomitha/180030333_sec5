package programs;
import java.util.*;
public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
