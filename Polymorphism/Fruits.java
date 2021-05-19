package Polymorphism;
class Fruit
{
	String name,taste,size;
	Fruit(String n,String t,String s)
	{
		name=n;
		taste=t;
		size=s;
	}
	void eat()
	{
		System.out.println(name+" "+taste);
	}
}
class Apple extends Fruit
{
	Apple(String n,String t ,String s)
	{
		super(n,t,s);
	}
	@Override
	void eat() {
		System.out.println(name+" "+taste);
	}
}
class Orange extends Fruit
{
	Orange(String n,String t ,String s)
	{
		super(n,t,s);
	}
	@Override
	void eat() {
		System.out.println(name+" "+taste);
	}
}
public class Fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f=new Fruit("cherries","tasty","large");
		Apple a=new Apple("mangoes","sweet","medium");
	    Orange o=new Orange("kiwi","tasty","small");  
	    f.eat();
	    a.eat();
	    o.eat();
	}
}
