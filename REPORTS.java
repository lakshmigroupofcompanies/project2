import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class REPORTS extends JFrame implements ActionListener
{
	JLabel jl,jlb1,s;
        JButton bs,bc,bm,b,st,su,m,r,l;
	JTextField jtf1;
        Color c1=new Color(51,213,225);
	Container c=null;
        ImageIcon i1=new ImageIcon("xx.jpg");
	REPORTS()
	{
		super("Reports");
		c=getContentPane();
		c.setLayout(null);
                c.setBackground(c1);
                jl=new JLabel(i1);
                jl.setBounds(80,0,910,147);
		c.add(jl);
                b=new JButton("BRANCH_ENTRY");
		b.setBounds(80,148,150,30);
		c.add(b);
		b.addActionListener(this);
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
	        jlb1=new JLabel("ENTER HALLTICKET NO");
	        jlb1.setBounds(300,290,150,30);
		c.add(jlb1);
		jtf1=new JTextField(10); 
		jtf1.setBounds(450,290,160,30);
		c.add(jtf1);                
                bs=new JButton("Save");
		bs.setBounds(420,350,70,30);
		c.add(bs);
		s=new JLabel("SUCESSFULLY UPDATED IN DATABASE");
		bc=new JButton("CANCEL");
		bc.setBounds(520,350,90,30);
		c.add(bc);
		
  }
 public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{BRANCH_ENTRY be=new BRANCH_ENTRY();
		be.setVisible(true);
		this.setVisible(false);
		be.setSize(1000,800);
		be.setResizable(false);
		}
                 if(ae.getSource()==st)
		{STUDENT_ENTRY be=new STUDENT_ENTRY();
		be.setVisible(true);
		this.setVisible(false);
		be.setSize(1000,800);
		be.setResizable(false);
		}
		if(ae.getSource()==su)
		{SUBJECT_ENTRY se=new SUBJECT_ENTRY();
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
		if(ae.getSource()==l)
		{
		Loginpage lp=new Loginpage();
		lp.setVisible(true);
		lp.setSize(1000,800);
		lp.setResizable(false);
		}
                   
	if(ae.getSource()==bs)
		{
			s.setBounds(300,500,250,30);
		        c.add(s);
			s.setVisible(true);
			this.setSize(1000,800);
			Connection cn = null;
		    PreparedStatement stmt = null;
		try
		{
		    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		    cn=DriverManager.getConnection("jdbc:odbc:marks","marks","marks");			
			System.out.println("Connection Successfull");		
     try {
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
		}}		
}
	
						
	public static void main(String[] args) 
	{
		REPORTS re=new REPORTS();
		re.setVisible(true);
		re.setSize(2000,1000);
	}
} 