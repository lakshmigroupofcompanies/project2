import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Loginpage extends JFrame implements ActionListener
{
	JLabel jlab,jb,jbc,jl;
	JTextField jtf1;
	JPasswordField jpf1;
	JButton bs,br,bm,bb;
	Container c=null;
	
Font f=new Font("Verdana",Font.BOLD,10);
	Color c1=new Color(51,213,225);
	Loginpage()
	{
		super("Loginpage");
		c=getContentPane();
		c.setBackground(c1);		
		c.setLayout(null);
               	jlab=new JLabel("USERNAME");
	        jlab.setBounds(300,200,160,30);
		c.add(jlab);		
		jtf1=new JTextField(10); 
		jtf1.setBounds(400,200,160,30);
		c.add(jtf1);
		jtf1.setFont(f);		
		jb=new JLabel("PASSWORD");
		jb.setBounds(300,250,160,30);
		c.add(jb);		
		jpf1=new JPasswordField(10); 
		jpf1.setEchoChar('*');
		jpf1.setBounds(400,250,160,30);
		c.add(jpf1);
                
		bs=new JButton("Login");
		bs.setBackground(Color.WHITE);
		bs.setBounds(360,350,70,30);
		c.add(bs);
		bs.addActionListener(this);		
		br=new JButton("Reset");
		br.setBounds(460,350,70,30);
		c.add(br);
                                       br.addActionListener(this);  
		bb=new JButton("Back");
		bb.setBounds(560,350,70,30);
		c.add(bb);
                                       bb.addActionListener(this);		       	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
/*		try
		{
		     Class.forName("oracle.jdbc.driver.OracleDriver");
		     cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");			
		}
		catch(Exception de)
		{
		de.printStackTrace();
		}*/
	}
		

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bs)
		{
		BRANCH_ENTRY be=new BRANCH_ENTRY();
		be.setVisible(true);
		this.setVisible(false);
		be.setSize(1000,800);
		be.setResizable(false);
		}
		if(ae.getSource()==bb)
		{
		Starter st=new Starter();
		st.setVisible(true);
		this.setVisible(false);
		st.setSize(1000,800);
		st.setResizable(false);
		}
		
		
			
	}
	
               
	public static void main(String[] args) 
	{
		Loginpage lp=new Loginpage();
		lp.setVisible(true);
		lp.setSize(800,600);
		 lp.setResizable(false);

		
	}
} 
                