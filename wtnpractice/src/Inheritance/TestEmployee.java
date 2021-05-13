package Inheritance;
class Person
{
	String name;
	Person(String n)
	{
		name=n;
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
}
class Employee extends Person
{
	double annualsal;
	int year;
	String natinsuno;
	public Employee(String x,double a,int b,String c )
	{
		super(x);
		annualsal=a;
		year=b;
		natinsuno=c;
	}
	public void setSal(Double s)
	{
		annualsal=s;
	}
	public double getSal()
	{
		return annualsal;
	}
	public void setYr(int yr)
	{
		year=yr;
	}
	public int getYr()
	{
		return year;
	}
	public void setIns(String ins)
	{
		natinsuno=ins;
	}
	public String getIns()
	{
		return natinsuno;
	}
	
}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("Yomitha");
		Employee e=new Employee("yomi",12000.45,2021,"123456");
		System.out.println(p.getName());
		System.out.println(e.getSal());
		System.out.println(e.getYr());
		System.out.println(e.getIns());

	}

}
