package session4;
class Employee
{
	private int eid;
	private String ename;
	private int salary;
	public void setEid(int id)
	{
		eid=id;
	}
	public int getEid()
	{
		return eid;
	}
	public void setName(String name)
	{
		ename=name;
	}
	public String getName()
	{
		return ename;
	}
	public void setSal(int sal)
	{
		salary=sal;
	}
	public int getSal()
	{
		return salary;
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEid(12);
		e.setName("yomitha");
		e.setSal(15000);
		System.out.println("Employee id:"+e.getEid());
		System.out.println("Employee name:"+e.getName());
		System.out.println("Employee salary:"+e.getSal());
		

	}

}
