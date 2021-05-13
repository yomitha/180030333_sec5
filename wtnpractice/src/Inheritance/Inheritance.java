package Inheritance;
class Animal
{
	void eat()
	{
		System.out.println("Eats only vegetables");
	}
	void sleep()
	{
		System.out.println("Animals sleep most of the times");
	}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("Eats insects and small worms");
	}
	void sleep()
	{
		System.out.println("Birds sleep in nests");
	}
	void fly()
	{
		System.out.println("Birds fly using their wings");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}
