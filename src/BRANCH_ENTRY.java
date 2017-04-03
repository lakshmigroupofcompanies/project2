import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class BRANCH_ENTRY extends JFrame implements ActionListener
{
hi hello:	JLabel jl,jlab,jb,jbc;
	JTextField jtf1,jtf2,jtf3;
	JButton bs,bc,b,st,su,m,r,l;
	Container c=null;
	Color c1=new Color(51,213,225);
	ImageIcon ii=new ImageIcon("xx.jpg");	
BRANCH_ENTRY()
{
		super("BRANCH_ENTRY");
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(c1);
                jl=new JLabel(ii);
		c.setLayout(null);
		jl.setBounds(80,0,910,147);
		c.add(jl); 		       
   	        b=new JButton("BRANCH_ENTRY");
		b.setBounds(80,148,150,30);
		c.add(b);
              	st=new JButton("STUDENT_ENTRY");
		st.setBounds(232,148,150,30);
		c.add(st);
                st.addActionListener(this);
                su=new JButton("SUBJECT_ENTRY");
		su.setBounds(384,148,150,30);
		c.add(su);
		su.addActionListener(this);
	        m=new JButton("MARKS_ENTRY");
		m.setBounds(536,148,150,30);
		c.add(m);
		m.addActionListener(this);
                r=new JButton("REPORTS");
                r.setBounds(688,148,150,30);
                c.add(r);
		r.addActionListener(this);
		l=new JButton("LOGOUT");
                l.setBounds(840,148,150,30);
                c.add(l);
		l.addActionListener(this);	
	       	jlab=new JLabel("COURSE");
	 	jlab.setBounds(300,300,160,30);
		c.add(jlab);
		jtf1=new JTextField(10); 
		jtf1.setBounds(400,300,160,30);
		c.add(jtf1);
		 jb=new JLabel("BRANCH");
		jb.setBounds(300,350,160,30);
		c.add(jb);
		jtf2=new JTextField(10); 
		jtf2.setBounds(400,350,160,30);
		c.add(jtf2);
		jbc=new JLabel("BRANCH CODE");
		jbc.setBounds(300,400,160,30);
		c.add(jbc);
		jtf3=new JTextField(10); 
		jtf3.setBounds(400,400,160,30);
		c.add(jtf3);
		bs=new JButton("SAVE");
		bs.setBounds(360,460,70,30);
		bs.addActionListener(this);
		c.add(bs);
		bc=new JButton("CANCEL");
		bc.setBounds(470,460,90,30);
		bc.addActionListener(this);
		c.add(bc);
		
  }
       public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==st)
		{STUDENT_ENTRY be=new STUDENT_ENTRY();
		be.setVisible(true);
		this.setVisible(false);
		be.setSize(1000,800);
		be.setResizable(false);
		}
		if(ae.getSource()==su)
		{SUBJECT_ENTRY  se=new SUBJECT_ENTRY ();
		se.setVisible(true);
		this.setVisible(false);
		se.setSize(1000,800);
		se.setResizable(false);
		}
		if(ae.getSource()==m)
		{MARKS_ENTRY me=new MARKS_ENTRY();
		me.setVisible(true);
		this.setVisible(false);
		me.setSize(1000,800);
		me.setResizable(false);
		}
		if(ae.getSource()==r)
		{REPORTS re=new REPORTS();
		re.setVisible(true);
		this.setVisible(false);
		re.setSize(1000,800);
		re.setResizable(false);
		}
		if(ae.getSource()==l)
		{
		Loginpage lp=new Loginpage();
		lp.setVisible(true);
		lp.setSize(1000,800);
		lp.setResizable(false);
		}
		if(ae.getSource()==bs)
		{	
			Connection cn = null;
		    PreparedStatement stmt = null;
		try
		{
		    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		    cn=DriverManager.getConnection("jdbc:odbc:marks","marks","marks");			
			System.out.println("Connection Successfull");		
     try {
        stmt = cn.prepareStatement("INSERT INTO BRANCH_ENTRY  VALUES (?,?,?)");
        stmt.setString(1, jtf1.getText());
        stmt.setString(2, jtf2.getText());
        stmt.setString(3, jtf3.getText());
        stmt.executeUpdate();
        stmt.close();
        cn.close();
JOptionPane.showMessageDialog(null,"Record successfully added to database");
     }
     catch (SQLException e) {
         JOptionPane.showMessageDialog(null,"Error connection not established or record already exists","Error",JOptionPane.ERROR_MESSAGE);    
      }
		}
		catch(Exception de)
		{
		de.printStackTrace();
		}
}
else if(ae.getSource()==bc)
{            
 this.dispose();    
} 
}
	public static void main(String[] args) 
	{
		BRANCH_ENTRY be=new BRANCH_ENTRY();
		be.setVisible(true);
		be.setSize(1000,800);
	}
} 
