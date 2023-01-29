import java.lang.*;
public abstract class FoodItem
{
	protected int id;
	protected double price;
	protected String name;
	public FoodItem(){}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId(){return id;}
	public double getPrice(){return price;}
	public String getName(){return name;}
	public abstract void showDetails();
}