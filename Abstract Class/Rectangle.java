import java.lang.*;
public class Rectangle extends Shape
{
	Rectangle(double dim1, double dim2)
	{
		super(dim1, dim2);
	}
	public void area()
	{
		int result= 0.5*dim1*dim2;
		System.out.println("area of Triangle:"+result);
		
	}
}