import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class MARKS_ENTRY extends JFrame implements ActionListener
{
	JLabel jlb1,jlb2,jlb3,jlb4,jl,s;
        JComboBox jc1,jc2,jc3,jc4;
	JButton bs,bc,b,st,su,m,r,l;
	Container c=null;
        Color c3=new Color(51,213,225);
	ImageIcon i1=new ImageIcon("xx.jpg","xx");
	MARKS_ENTRY()
	{
		super("Marks Entry");
		c=getContentPane();
		c.setLayout(null);
                c.setBackground(c3);
		jl=new JLabel(i1);
                jl.setBounds(80,0,900,167);
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
		jlb1=new JLabel("COURSE");
	        jlb1.setBounds(300,330,150,50);
		c.add(jlb1);
                jc1 = new JComboBox();
                                        
		jc1.addItem(""); 
		jc1.addItem("BTECH");
                jc1.addItem("MBA");
                jc1.setBounds(400,330,150,30);
		c.add(jc1);
		jlb2=new JLabel("BRANCH");
		jlb2.setBounds(300,390,150,30);
		c.add(jlb2);
		jc2 = new JComboBox();
                 jc2.addItem(""); 
		jc2.addItem("CSE");
                jc2.addItem("IT");
                jc2.addItem("ECE");
                jc2.addItem("EEE");
                jc2.setBounds(400,390,150,30);
		c.add(jc2);
		jlb3=new JLabel("YEAR");
		jlb3.setBounds(300,450,150,30);
		c.add(jlb3);
		jc3 = new JComboBox();
		jc3.addItem(""); 
		jc3.addItem("I");
                                     jc3.addItem("II");
                                     jc3.addItem("III"); 
                                     jc3.addItem("IV");
                                     jc3.setBounds(400,450,150,30);
		c.add(jc3);
                                     jlb4=new JLabel("SEM");
		jlb4.setBounds(300,520,150,30);
		c.add(jlb4);
		jc4= new JComboBox();
 		jc4.addItem(""); 
		jc4.addItem("I");
                                      jc4.addItem("II");
                                     jc4.setBounds(400,520,150,30);
		c.add(jc4); 
                                     bs=new JButton("SAVE");
		bs.setBounds(360,600,70,30);
		c.add(bs);
		s=new JLabel("SUCESSFULLY UPDATED IN DATABASE");
		bc=new JButton("CANCEL");
		bc.setBounds(450,600,90,30);
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
		MARKS_ENTRY me=new MARKS_ENTRY();
		me.setVisible(true);
		me.setSize(2000,1000);
	}
} 