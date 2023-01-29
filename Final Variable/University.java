import java.lang.*;

public class University
{
	public final String name;
	public static final double fees;
	private final String area;
	public University()
	{
		name="Aiub";
		this.area="Kuratoli";
	}
	public University(String area)
	{
		this.area=area;
	}
	public String getArea()
	{return area;}
	
	
	
	static{
		fees=1200000;
	}
	
	
	public void show()
	{
		System.out.println("Name:"+name);
		System.out.println("Fees:"+fees);
		System.out.println("University area:"+getArea());
	}
}