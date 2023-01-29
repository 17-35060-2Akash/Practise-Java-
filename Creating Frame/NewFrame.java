import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class NewFrame extends JFrame
{
	private JPanel p;
	private JLabel userLabel;
	
	public NewFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(400,600);
		init();
	}
	public void init()
	{
		p=new JPanel();
		p.setLayout(null);
		p.setBackground(Color.yellow);
		
		userLabel=new JLabel("Salary:");
		userLabel.setBounds(100,50,100,30);
		p.add(userLabel);
		
		
		
		this.add(p);
	}
}