package Threads;
import java.lang.*;
public class EOThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even n=new Even();
		Thread t1=new Thread(n);
		t1.start();
		Odd o=new Odd();
		Thread t2=new Thread(o);
		t2.start();
	}
}
class Even implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=20;i++) 
	        {     
	          if(i%2==0)
	          System.out.println(i); 
	        } 
		}
		catch(Exception e) 
        { 
          System.out.println("Exception"+e); 
        } 
	}
}

class Odd implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=20;i++) 
	        {     
	          if(i%2==1)
	          System.out.println(i); 
	        } 
		}
		catch(Exception e) 
        { 
          System.out.println("Exception"+e); 
        } 
	}
}