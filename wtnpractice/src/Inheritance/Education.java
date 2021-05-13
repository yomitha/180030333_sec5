package Inheritance;
class Person1
{
	String name;
	int dob;
	
	public void setName(String s)
	{
		name=s;
	}
	public String getName()
	{
		return name;
	}
	public void setDob(int x)
	{
		dob=x;
	}
	public int getDob()
	{
		return dob;
	}
}
class Teacher extends Person1
{
	double salary;
	String subject;
	public void setSal(double sal)
	{
		salary=sal;
	}
	public double getSal()
	{
		return salary;
	}
	public void setSub(String sub)
	{
		subject=sub;
	}
	public String getSub()
	{
		return subject;
	}
}
class Student extends Person1
{
	int studid;
	public void setId(int sid)
	{
		studid=sid;
	}
	public int getId()
	{
		return studid;
	}
}
class CollegeStudent extends Student
{
	String clgname;
	int year;
	public void setClgname(String cname)
	{
		clgname=cname;
	}
	public String getClgname()
	{
		return clgname;
	}
	public void setYr(int yr)
	{
		year=yr;
	}
	public int getYr()
	{
		return year;
	}
}
public class Education {
	public static void main(String args[])
	{
		Person1 p=new Person1();
		p.setName("yomitha");
		p.setDob(2001);
		System.out.println("Person's name:"+p.getName());
		System.out.println("Person's DOB:"+p.getDob());
		Teacher t=new Teacher();
		t.setSal(12000);
		t.setSub("English");
		System.out.println("Teacher's Sal:"+t.getSal());
		System.out.println("Teacher's Sub:"+t.getSub());
		Student s=new Student();
		s.setId(1000);
		System.out.println("Student Id:"+s.getId());
		CollegeStudent cs=new CollegeStudent();
		cs.setClgname("KLU");
		cs.setYr(2021);
		System.out.println("CollegeStudent name:"+cs.getClgname());
		System.out.println("Collegestudent year:"+cs.getYr());
		
		
	}

}
