import java.lang.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.Cursor;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;



public class FrameDemo extends JFrame
{
	private ImageIcon icon,img;
	private JPanel panel;
	private JLabel userLabel, passLabel,imageLabel,studentLabel;
	private JButton add,insert,delete;
	private JTextField userTF;
	private JPasswordField userPF;
	private JButton logbtn, exitbtn, clearbtn;
	private JRadioButton r1,r2,r3;
	private ButtonGroup BG1;
	private JCheckBox c1,c2,c3;
	private JComboBox combo;
	private Font f;
	private Cursor cursor;
	private JTable Table;
	private JScrollPane scroll;
	private DefaultTableModel table;
	private String cols[]={"ID","Name","CGPA"};
	private String rows[][]={
		{"101","Akash","3.20"},
		{"102","Ehsan","4.00"},
		{"103","Mahin","4.00"},
		{"104","Nazim","4.00"},
		
		
		
	};
	
	public FrameDemo()
	{
		super("Menz Saloon");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(800,800);
		this.setResizable(false);
		init();
		
	}
	
	public void init()
	{
		icon=new ImageIcon(getClass().getResource("img2.png"));
		this.setIconImage(icon.getImage());
		
		panel= new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.yellow);
		
		f=new Font("Arial",Font.BOLD,12);
		cursor=new Cursor(Cursor.HAND_CURSOR);
		
		userLabel=new JLabel("User Name: ");
		userLabel.setBounds(100, 150,100,30);
		userLabel.setForeground(Color.red);
		userLabel.setOpaque(true);
		userLabel.setBackground(Color.YELLOW);
		panel.add(userLabel);
		
		passLabel=new JLabel("Enter Password: ");
		passLabel.setBounds(100,200,100,30);
		panel.add(passLabel);
		
		
		
		userTF=new JTextField();
		userTF.setBounds(200,150,100,30);
		userTF.setBackground(Color.green);
		userTF.setFont(f);
		panel.add(userTF);
		
	    userTF.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				String s=userTF.getText();
				if(s.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"please, Enter a user Name");
				}
				else
				{
				JOptionPane.showMessageDialog(null,"User Name: "+s);
				}
			}
			
		});
		
		userPF=new JPasswordField();
		userPF.setBounds(200,200,100,30);
		userPF.setEchoChar('*');
		userPF.setFont(f);
		panel.add(userPF);
		
		userPF.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				String s=userPF.getText();
				if(s.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please, Enter a Password ");
				}
				else
				{
				JOptionPane.showMessageDialog(null,"Password: "+s);
				}
			}
			
		});
		
		logbtn=new JButton("LOGIN");
		logbtn.setBounds(100,300,100,30);
		logbtn.setCursor(cursor);
		panel.add(logbtn);
		
		
		exitbtn=new JButton("Exit");
		exitbtn.setBounds(230,300,100,30);
		exitbtn.setCursor(cursor);
		panel.add(exitbtn);
		
		logbtn.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				String userName=userTF.getText();
				String userPass=userPF.getText();
				
				if(userName.equals("Akash") && userPass.equals("1234"))
				{
					JOptionPane.showMessageDialog(null,"You are Successfully Loggedin");
					NewFrame nn=new NewFrame();
					nn.setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(null,"Try again");
			}
			
		});
		
		clearbtn=new JButton("Clear");
		clearbtn.setBounds(330,175,70,30);
		panel.add(clearbtn);
		
		clearbtn.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				userTF.setText("");
				userPF.setText("");
			}
			
			
		});
		
		r1 = new JRadioButton("OOP1 G");
		r1.setBounds(450, 50, 80, 20);
		panel.add(r1);
		
		r2 = new JRadioButton("OOP1 C");
		r2.setBounds(450, 80, 80, 20);
		panel.add(r2);
		
		r3 = new JRadioButton("OOP2 I");
		r3.setBounds(450, 110, 80, 20);
		panel.add(r3);
		
		BG1=new ButtonGroup();
		BG1.add(r1);
		BG1.add(r2);
		BG1.add(r3); 
    
        c1 = new JCheckBox("BBA");
		c1.setForeground(Color.BLUE);
		c1.setBackground(Color.green);
		c1.setBounds(550, 50, 80, 20);
		panel.add(c1);
		
		c2 = new JCheckBox("MBA");
		c2.setBounds(550, 80, 80, 20);
		c2.setForeground(Color.BLUE);
		c2.setBackground(Color.green);
		panel.add(c2);
		
		c3 = new JCheckBox("BSC");
		c3.setBounds(550, 110, 80, 20);
		c3.setForeground(Color.BLUE);
		c3.setBackground(Color.green);
		panel.add(c3);
		
		String item[]={"Spring-17","Fall-16","Spring-18","Spring-9","Summer-17","Fall-17"};
		combo=new JComboBox(item);
		combo.setBounds(650,110,80,20);
		panel.add(combo);
		
		img=new ImageIcon("img3.jpg");
		imageLabel=new JLabel(img);
		imageLabel.setBounds(400,200,300,300);
		panel.add(imageLabel);
		
		studentLabel=new JLabel("Student Info:");
		studentLabel.setBounds(200,450,100,50);
		studentLabel.setFont(f);
		panel.add(studentLabel);
		
		Table=new JTable(rows,cols);
		
		scroll=new JScrollPane(Table);
		scroll.setBounds(200,500,350,200);
		panel.add(scroll);
		
		add=new JButton("Add");
		add.setBounds(70,500,70,30);
		panel.add(add);
		
		insert=new JButton("Insert");
		insert.setBounds(70,550,70,30);
		panel.add(insert);
		
		delete=new JButton("Delete");
		delete.setBounds(70,600,70,30);
		panel.add(delete);
		
		
		
		this.add(panel);
		
	}
}





