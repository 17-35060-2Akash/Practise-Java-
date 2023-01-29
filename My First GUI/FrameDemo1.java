import java.lang.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
 

public class FrameDemo1 extends JFrame
{
	ImageIcon icon,img;
	JPanel panel;
	JLabel userLabel,passLabel;
	JTextField userTF;
	JPasswordField userPF;
	JButton log, exit;
	JRadioButton r1,r2,r3;
	ButtonGroup bg1;
	JCheckBox cb1,cb2;
	JComboBox com;
	
	FrameDemo1()
	{
		super("My First Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(800,450);
		setResizable(true);
		init();
		
	}
	public void init()
	{
		icon=new ImageIcon(getClass().getResource("calculator.png"));
		this.setIconImage(icon.getImage());
		
		panel=new JPanel();
		panel.setLayout(null);//By default the panel is set at the corner of the frame, 
		                       //so have to setLayout(null) to resize.
		
		userLabel=new JLabel("User Name: ");
		userLabel.setBounds(100,113,100,30);
		panel.add(userLabel);
		
	    userTF=new JTextField();
		userTF.setBounds(200,113,100,30);
		panel.add(userTF);
		
		passLabel=new JLabel("Password: ");
		passLabel.setBounds(100,153,100,30);
		panel.add(passLabel);
		
		userPF=new JPasswordField();
		userPF.setBounds(200,153,100,30);
		panel.add(userPF);
		
		log=new JButton("Login");
		log.setBounds(200,300,70,30);
		panel.add(log);
		
		exit=new JButton("Exit");
		exit.setBounds(300,300,70,30);
		panel.add(exit);
		
		r1=new JRadioButton("OOP1");
		r1.setBounds(350,100,70,70);
		panel.add(r1);
		
		r2=new JRadioButton("OOAD");
		r2.setBounds(350,130,70,70);
		panel.add(r2);
		
		r3=new JRadioButton("Device");
		r3.setBounds(350,160,70,70);
		panel.add(r3);
		
		bg1=new ButtonGroup();
	    bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);
		
		cb1= new JCheckBox("BSc");
		cb1.setBounds(450,100,70,70);
		panel.add(cb1);
		
		cb2= new JCheckBox("MSc");
		cb2.setBounds(450,150,70,70);
		panel.add(cb2);
		
		String dept[]={"CSE","CSSE","SE","EEE","BBA","COE","ARC"};
		com=new JComboBox(dept);
		com.setBounds(550,100,70,40);
		panel.add(com);
		
		img=new ImageIcon("calculator1.jpeg");
		imgLabel=new JLabel(img);
		imgLabel.setBounds(500,250,225,225);
		panel.add(imgLabel);
		
		
		
		
		
		
		
	
		
		this.add(panel);
		
		
		
	}
	
	
	
	
	
	
}