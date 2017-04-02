import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class STUDENT_ENTRY extends JFrame implements ActionListener
{
	JLabel jl,jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8;
        JComboBox jc1,jc2,jc3;
	JTextField jtf1,jtf2,jtf3,jtf4,jtf5;
	JButton bs,bc, b,st,su,m,r,l;
        Color c1=new Color(51,213,225);
	Container c=null;
        ImageIcon ii=new ImageIcon("xx.jpg");
	STUDENT_ENTRY()
	{
		super("STUDENT_ENTRY");
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
		jlb1.setBounds(300,240,150,30);
		c.add(jlb1);
	        jc1 = new JComboBox();
		jc1.addItem("");
		jc1.addItem("B.TECH");
                jc1.addItem("MBA");
	        jc1.setBounds(410,240,150,30);
		c.add(jc1);
		jlb2=new JLabel("BRANCH");
		jlb2.setBounds(300,290,150,30);
		c.add(jlb2);
		jc2 = new JComboBox();
		jc2.addItem("");
		jc2.addItem("CSE");
		jc2.addItem("IT");
		jc2.addItem("ECE");
		jc2.addItem("EEE");
		jc2.addItem("CIVIL");
		jc2.addItem("MECH");
               	jc2.setBounds(410,290,150,30);
		c.add(jc2);
		jlb3=new JLabel("YEAR");
		jlb3.setBounds(300,340,150,30);
		c.add(jlb3);
		jc3 = new JComboBox();
		jc3.addItem("");
		jc3.addItem("I ");
              	jc3.addItem("II ");
                jc3.addItem("III "); 
                jc3.addItem("IV ");
                jc3.setBounds(410,340,150,30);
		c.add(jc3);
        	jlb4=new JLabel("REGISTER NO");
	        jlb4.setBounds(300,390,150,30);
		c.add(jlb4);		
		jtf1=new JTextField(10); 
		jtf1.setBounds(410,390,150,30);
		c.add(jtf1);
                jlb5=new JLabel("NAME");
	        jlb5.setBounds(300,440,150,30);
		c.add(jlb5);
		jtf2=new JTextField(10); 
		jtf2.setBounds(410,440,150,30);
		c.add(jtf2);
                jlb6=new JLabel("DOB[DD-MM-YYYY]");
	        jlb6.setBounds(300,490,150,30);
		c.add(jlb6);
		jtf3=new JTextField(10); 
		jtf3.setBounds(410,490,150,30);
		c.add(jtf3);
                jlb7=new JLabel("ADDRESS");
	        jlb7.setBounds(300,540,150,30);
		c.add(jlb7);
		jtf4=new JTextField(10); 
		jtf4.setBounds(410,540,150,30);
		c.add(jtf4);
                jlb8=new JLabel("CONTACT NO");
	        jlb8.setBounds(300,590,150,30);
		c.add(jlb8);
		jtf5=new JTextField(10); 
		jtf5.setBounds(410,590,150,30);
		c.add(jtf5);
                bs=new JButton("SAVE");
		bs.setBounds(360,650,70,30);
		c.add(bs);
		bc=new JButton("CANCEL");
		bc.setBounds(450,650,90,30);
		c.add(bc);
		  }
   public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{
		BRANCH_ENTRY be=new BRANCH_ENTRY();
		be.setVisible(true);
		this.setVisible(false);
		be.setSize(1000,800);
		be.setResizable(true);
		}
                if(ae.getSource()==su)
		{
		SUBJECT_ENTRY se=new SUBJECT_ENTRY();
		se.setVisible(true);
		this.setVisible(false);
		se.setSize(1000,800);
		se.setResizable(true);
		}
                if(ae.getSource()==m)
		{
		MARKS_ENTRY me=new MARKS_ENTRY();
		me.setVisible(true);
		this.setVisible(false);
		me.setSize(1000,800);
		me.setResizable(true);
		}
                if(ae.getSource()==r)
		{
		REPORTS re=new REPORTS();
		re.setVisible(true);
		this.setVisible(false);
		re.setSize(1000,800);
		re.setResizable(true);
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
     try 
{
		
        stmt = cn.prepareStatement("INSERT INTO student_entry VALUES (?,?,?,?,?,?,?,?)");
        stmt.setString(1, jc1.getSelectedItem().toString());
	stmt.setString(2, jc2.getSelectedItem().toString());
	stmt.setString(3, jc3.getSelectedItem().toString());
        stmt.setString(4, jtf1.getText());
        stmt.setString(5, jtf2.getText());
        stmt.setString(6, jtf3.getText());
        stmt.setString(7, jtf4.getText());
        stmt.setString(8, jtf5.getText());
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
		STUDENT_ENTRY be=new STUDENT_ENTRY();
		be.setVisible(true);
		be.setSize(1000,800);
	}
} 