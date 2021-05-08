package snippet;

import java.io.*;
import java.util.*;
class Emp
{

private int empId;
	   private String name;
	   private int age;
	   private String dept;

	   public int getEmpId()
	   {
	      return empId;
	   }
	   public String getName()
	   {
	      return name;
	   }
	   public int getAge()
	   {
	      return age;
	   }
	   public String getDept()
	   {
	       return dept;
	   }
	   public void setEmpId( int empId)
	   {
	      this.empId = empId;
	   }
	   public void setName(String name)
	   {
	      this.name = name;
	   }
	   public void setAge( int age)
	   {
	      this.age = age;
	   }
	   public void setDept(String dept)
	   {
	       this.dept = dept;
	   }
	}
public class Employee {
	  public static void main(String args[])
	    {
	      Emp e = new Emp();
	      Scanner sc=new Scanner(System.in);
	      int id=sc.nextInt();
	      String name=sc.next();
	      int age=sc.nextInt();
	      String dep=sc.next();
	      e.setEmpId(id);
	      e.setName(name);
	      e.setAge(age);
	      e.setDept(dep);
	      System.out.println("Employee Id : "+e.getEmpId() + "\nName : " + e.getName() + "\nAge : " + e.getAge() + "\nDepartment : "+e.getDept());
	   }
	
}