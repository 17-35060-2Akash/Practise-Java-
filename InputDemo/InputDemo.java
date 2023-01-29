import java.lang.*;
import java.util.Scanner;

public class InputDemo
{
	public static void main(String args[])
	{
		System.out.println("Enter the name:");
		Scanner input=new Scanner(System.in);
	String name=input.nextLine();
		System.out.println("You added:"+name);
		
		
	}
}