import java.lang.*;

public class Triangle extends Shape
{
	protected double base, height;
	public Triangle(double b,double h)
	{
		this.base=b;
		this.height=h;
	}
	public double area()
	{
		System.out.print("Area of Triangle:");
		return 0.5*base*height;
	}
	
}