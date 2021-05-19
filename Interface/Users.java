package Interface;
import java.util.*;
import java.io.*;
interface LibraryUser
{
	public void registerAccount();
	public void registerBook();
}
class KidUsers implements LibraryUser
{
	private int age;
	private String bookType;
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setBooktype(String bookType)
	{
		this.bookType=bookType;
	}
	public String getBooktype()
	{
		return bookType;
	}
	public void registerAccount()
	{
		if(age<12)
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
		else
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	public void registerBook()
	{
		if(bookType.equals("Kids"))
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
}
class AdultUser implements LibraryUser
{
	private int age;
	private String bookType;
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setBooktype(String bookType)
	{
		this.bookType=bookType;
	}
	public String getBooktype()
	{
		return bookType;
	}
	public void registerAccount()
	{
		if(age>12)
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
		else
		{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}
	public void registerBook()
	{
		if(bookType.equals("Fiction"))
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
}
public class Users {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    KidUsers ku=new KidUsers();
    AdultUser au=new AdultUser();
    ku.setAge(sc.nextInt());
    ku.setBooktype("Kids");
    au.setAge(sc.nextInt());
    au.setBooktype("Fiction");
    ku.registerAccount();
    ku.registerBook();
    au.registerAccount();
    au.registerBook();
	}

}
