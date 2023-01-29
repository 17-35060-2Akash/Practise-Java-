import java.lang.*;

public class Pizza extends FoodItems
{
	protected String size;
	public Pizza(){}
	public Pizza(String size, double price, String name)
	{
		this.size=size;
		this.price=price;
		this.name=name;
	}
	public void setSize(String size)
	{
       this.size=size;		
	}
	public String getSize(){return size;}
	public void show details()
	{
		System.out.println("Item Id:"+getId);
		System.out.println("Item Price:"+getPrice);
		System.out.println("Item Name:"+getName);
		System.out.println("Item Size:"+getSize);
	}
}