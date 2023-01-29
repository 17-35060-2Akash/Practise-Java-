import java.lang.*;

public class Burger extends FoodItems
{
	protected int numberOfPatties;
	public Burger(){}
	public Burger(int numberOfPatties, double price, String name)
	{
		this.numberOfPatties=numberOfPatties;
		this.price=price;
		this.name=name;
	}
	public void setNumberofPatties(int numberOfPatties)
	{
       this.numberOfPatties=numberOfPatties;		
	}
	public int getNumberofPatties(){return numberOfPatties;}
	public void show details()
	{
		System.out.println("Item Id:"+getId);
		System.out.println("Item Price:"+getPrice);
		System.out.println("Item Name:"+getName);
		System.out.println("Item Number Of Patties:"+getNumberofPatties);
	}
}