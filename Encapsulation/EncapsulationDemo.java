package Encapsulation;
import java.io.*;
import java.util.*;
class Author
{
	protected String auth_name,auth_email;
	protected char gen;
	Author()
	{
		
	}
	Author(String name,String email,char g)
	{
		auth_name=name;
		auth_email=email;
		gen=g;
	}
	void dis()
	{
		System.out.println("Authors name:"+auth_name);
		System.out.println("Authors email:"+auth_email);
		System.out.println("Authors gender:"+gen);
	}
}
class Book extends Author
{
	protected String name;
	protected double price,qtyInstock;
	Book(String n,double p,double q)
	{
		name=n;
		price=p;
		qtyInstock=q;
	}
	void display()
	{
		System.out.println("Book name:"+name);
		System.out.println("Book price:"+price);
		System.out.println("quantityinstock:"+qtyInstock);
		
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    Author a =new Author("William","william@gmail.com",'M');
    Book b=new Book("Into the heaven",1200,100);
    a.dis();
    b.display();
	}

}
