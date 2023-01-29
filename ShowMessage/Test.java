import java.lang.*;
import javax.swing.JOptionPane;

public class Test
{
	public static void main(String args[])
	{
		String name = JOptionPane.showInputDialog("Enter Your Name:", "Akash");
		JOptionPane.showMessageDialog(null, name+", Welcome to Swing","Menz Saloon",JOptionPane.PLAIN_MESSAGE);
	}
}