import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Starter extends JFrame implements ActionListener
{
	JLabel jl,jl1,jl2,jl3;
	JButton bs;
	Container c=null;
	ImageIcon ii=new ImageIcon("xx.jpg");
	Font f=new Font("Verdana",Font.BOLD,28);	
	Color c3=new Color(30,135,150);	
	ImageIcon i1=new ImageIcon("xxx.jpg");	
	Starter()
{	        
                super("WELCOME");
		c=getContentPane();
		c.setBackground(c3);
	 	jl=new JLabel(i1);
		jl.setBounds(80,0,910,147);
                c.setLayout(null);
		c.add(jl);		
		jl1=new JLabel("WELCOME");
		c.setLayout(null);
		jl1.setBounds(400,140,653,147);
		jl1.setFont(f);
		c.add(jl1);
		jl2=new JLabel("TO");
		c.setLayout(null);
		jl2.setBounds(462,180,653,147);
		jl2.setFont(f);
		c.add(jl2);
		jl3=new JLabel("MARKS MANAGEMENT SYSTEM");
		c.setLayout(null);
		jl3.setBounds(240,230,653,147);
		jl3.setFont(f);
		c.add(jl3);
		bs=new JButton("CLICK HERE TO LOGIN");
		bs.setBounds(370,347,220,50);
		bs.setBackground(c3);
		c.add(bs);
		bs.addActionListener(this);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae)
{
		if(ae.getSource()==bs)
		{
                Loginpage lp=new Loginpage();
		lp.setVisible(true);
		this.setVisible(false);
		lp.setSize(1000,800);
		lp.setResizable(false);
		}	
}
	public static void main(String[] args) 
{
		Starter st = new Starter();
		st.setVisible(true);
		st.setSize(1000,800);
		st.getWidth();
}
} 
                