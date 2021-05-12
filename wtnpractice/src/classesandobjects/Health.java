package classesandobjects;

public class Health {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p=new Patient(80,175);
		double x=p.computeBMI();
		System.out.println("The BMI of a person is:"+x);

	}

}
class Patient
{
	String name;
	double height,width;
	Patient(double h, double w)
	{
		height=h;
		width=w;
	}
	double computeBMI()
	{
		return ((width/(height*height))*703);
	}
}
