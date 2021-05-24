package Threads;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num n=new Num();
		Thread th=new Thread(n);
		th.start();
	}

}
class Num implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++) 
	        {     
				if(i==6)
				Thread.sleep(5000);
	          System.out.println(i); 
	        } 
		}
		catch(InterruptedException e) 
        { 
          System.out.println("Exception"+e); 
        } 
	}
}
