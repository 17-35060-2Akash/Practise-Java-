import java.lang.*;

public class Rectangle extends Shape
{
	protected double length, height;
	public Rectangle(double length, double height)
	{
		this.length=length;
		this.height=height;
	}
	public double area()
	{
		System.out.print("Area of Rectangle:");
		return length*height;
		
	}
	
}