import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class SUBJECT_ENTRY extends JFrame implements ActionListener,ItemListener 
{
	JLabel  jl,jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8,jlb9,jlb10,jlb11,jlb12,jlb13,jlb14,s;
        JComboBox jc1,jc2;
	JTextField jtf1,jtf2,jtf3,jtf4,jtf5,jtf6,jtf7,jtf8,jtf9,jtf10;
	JButton bs,bc,b,st,su,m,r,l;
	String l1,l2;
	Container c=null;
        Color c1=new Color(51,213,225);
	ImageIcon i1=new ImageIcon("xx.jpg");
	SUBJECT_ENTRY()
	{
		super("Subject entry");
		c=getContentPane();
		c.setLayout(null);
                c.setBackground(c1);
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
		jlb1.setBounds(320,190,150,30);
		c.add(jlb1);
		jc1 = new JComboBox();
                jc1.addItem(" "); 
		jc1.addItem("BTECH");
                jc1.addItem("MBA");
                jc1.setBounds(410,200,150,25);
		c.add(jc1);
		jc1.addItemListener(this);
		jlb2=new JLabel("BRANCH");
		jlb2.setBounds(320,220,150,30);
		c.add(jlb2);
		jc2 = new JComboBox();
		jc2.addItem(" ");
		jc2.addItem("CSE");
                jc2.addItem("IT");
                jc2.addItem("ECE"); 
                jc2.addItem("EEE");
                jc2.setBounds(410,230,150,25);
		c.add(jc2);
		jc2.addItemListener(this);
		jlb3=new JLabel("Enter subject name");
	        jlb3.setBounds(320,250,150,25);
		c.add(jlb3);
		jlb4=new JLabel("1");
	        jlb4.setBounds(320,290,150,25);
		c.add(jlb4);
		jtf1=new JTextField(10); 
		jtf1.setBounds(350,290,150,25);
		c.add(jtf1);
                jlb5=new JLabel("2");
	        jlb5.setBounds(320,320,150,25);
		c.add(jlb5);
		jtf2=new JTextField(10); 
		jtf2.setBounds(350,320,150,25);
		c.add(jtf2);
                jlb6=new JLabel("3");
	        jlb6.setBounds(320,350,70,25);
		c.add(jlb6);
		jtf3=new JTextField(10); 
		jtf3.setBounds(350,350,150,25);
		c.add(jtf3);
                jlb7=new JLabel("4");
	        jlb7.setBounds(320,380,150,25);
		c.add(jlb7);
		jtf4=new JTextField(10); 
		jtf4.setBounds(350,380,150,25);
		c.add(jtf4);
                jlb8=new JLabel("5");
	        jlb8.setBounds(320,410,150,25);
		c.add(jlb8);		
                jtf5=new JTextField(10); 
		jtf5.setBounds(350,410,150,25);
		c.add(jtf5);
                jlb9=new JLabel("6");
	        jlb9.setBounds(320,440,70,25);
		c.add(jlb9);
		jtf6=new JTextField(10); 
		jtf6.setBounds(350,440,150,25);
		c.add(jtf6); 
                jlb10=new JLabel("Enter Labs");
	        jlb10.setBounds(320,460,150,25);
		c.add(jlb10);
                jlb11=new JLabel("1");
	        jlb11.setBounds(320,500,150,25);
		c.add(jlb11);
		jtf7=new JTextField(10); 
		jtf7.setBounds(350,500,150,25);
		c.add(jtf7);
                jlb12=new JLabel("2");
	        jlb12.setBounds(320,530,150,25);
		c.add(jlb12);
		jtf8=new JTextField(10); 
		jtf8.setBounds(350,530,150,25);
		c.add(jtf8);
                jlb13=new JLabel("3");
	        jlb13.setBounds(320,560,150,25);
		c.add(jlb13);
		jtf9=new JTextField(10); 
		jtf9.setBounds(350,560,150,25);
		c.add(jtf9); 
                jlb14=new JLabel("4");
	        jlb14.setBounds(320,590,150,25);
		c.add(jlb14);
		jtf10=new JTextField(10); 
		jtf10.setBounds(350,590,150,25);
		c.add(jtf10);
                bs=new JButton("Save");
		bs.setBounds(350,650,70,30);
		c.add(bs);
		s=new JLabel("SUCESSFULLY UPDATED IN DATABASE");
		bc=new JButton("CANCEL");
		bc.setBounds(450,650,90,30);
		c.add(bc);		
		}
  public void itemStateChanged(ItemEvent ie) {
   if(ie.getSource()==jc1){
	l1 = (String)jc1.getSelectedItem();
	}
		if(ie.getSource()==jc2){
	l2 = (String)jc2.getSelectedItem();
	}
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
		System.out.println(l1);
        stmt = cn.prepareStatement("INSERT INTO SUBJECT_ENTRY VALUES (?,?)");
        stmt.setString(1,l1);
        stmt.setString(2,l2);
	stmt.setString(3, jtf1.getText());
        stmt.setString(4, jtf2.getText());
	stmt.setString(5, jtf2.getText());
        stmt.setString(6, jtf3.getText());
        stmt.setString(7, jtf4.getText());
        stmt.setString(8, jtf5.getText());
	stmt.setString(9, jtf2.getText());
	stmt.setString(10, jtf2.getText());
	stmt.setString(11, jtf2.getText());
	stmt.setString(12, jtf2.getText());
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
		}}			
  }
	public static void main(String[] args) 
	{
                                   
		SUBJECT_ENTRY se=new SUBJECT_ENTRY();
		se.setVisible(true);
		se.setSize(5000,5000);
	}
} 