import java.lang.*;

public class Test
{
	public static void main(String args[])
	{
		Shape[] s=new Shape[3];
		for(int i=0;i<3;i++)
		{
		 s[i]=new Shape();
		 s[i]=new Triangle(10,20);
		 s[i]=new Rectangle(10,20);
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.println(s[i].area());
		}
		/*Rectangle r;
		new Rectangle();
		System.out.println("Height of Rectangle:"+Rectangle(10.00,20.00).height);*/
	}
}