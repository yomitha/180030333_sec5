package snippet;



class EmployeeDemo
{
	int eid;
	String name;
	int salary;
	EmployeeDemo()
	{
		System.out.println("Default constructor ");
	}
	EmployeeDemo(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}
	EmployeeDemo(int eid,String name,int salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("Employee id :"+eid);
		System.out.println("Employee name :"+name);
		System.out.println("Employee salary :"+salary);
	}
}
public class Constructoroverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDemo e1=new EmployeeDemo();
		e1.display();
		EmployeeDemo e2=new EmployeeDemo(1234,"yomitha");
		e2.display();
		EmployeeDemo e3=new EmployeeDemo(1234,"yomitha",12000);
		e3.display();

	}

}
