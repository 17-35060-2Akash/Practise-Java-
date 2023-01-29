import java.lang.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class FrameDemo extends JFrame
{
	ImageIcon icon;
	
	public FrameDemo()
	{
		super("My Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(400,700);
		init();
		
	}
	 void init()
	{
		icon=new ImageIcon(getClass().getResource(calculator.png));
		this.setIconImage(icon.getImage());
	}
}