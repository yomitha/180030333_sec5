package classesandobjects;

public class Box {
	double width,height,depth;
	Box(double d,double e,double f)
	{
		width=d;
		height=e;
		depth=f;
	}
	double volume()
	{
		double d=width*height*depth;
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(3.5,6.2,7.8);
		double x=b.volume();
		System.out.println("volume of box is:"+x);

	}

}
