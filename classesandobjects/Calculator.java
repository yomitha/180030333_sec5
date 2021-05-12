package classesandobjects;
import java.io.*;
import java.util.*;
public class Calculator {
	static double powerInt(int num1,int num2)
	{
		return Math.pow(num1,num2);
	}
	static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1,num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		double x=powerInt(3,5);
		double y=powerDouble(3,5);
		System.out.println("pow value from powerInt method is:"+x);
		System.out.println("pow value from powerDouble method is:"+y);
	}

}
