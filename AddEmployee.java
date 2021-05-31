package hotel.management.system;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener{
	JTextField tf1,tf2,tf5,tf6,tf7,tf8;
	JRadioButton r1,r2;
	JComboBox c1;
	JButton b1;
	
	AddEmployee(){
		setTitle("Add Employee");
		JLabel l1=new JLabel("Name");
		l1.setFont(new Font("Tohama",Font.PLAIN,15));
		l1.setBounds(60,30,120,30);
		add(l1);
		
		tf1=new JTextField();
		add(tf1);
		tf1.setBounds(200,30,150,30);
		
		JLabel l2=new JLabel("Age");
		l2.setFont(new Font("Tohama",Font.PLAIN,15));
		l2.setBounds(60,80,120,30);
		add(l2);
		
		tf2=new JTextField();
		add(tf2);
		tf2.setBounds(200,80,150,30);
		
		JLabel l3=new JLabel("Gender");
		l3.setFont(new Font("Tohama",Font.PLAIN,15));
		l3.setBounds(60,130,120,30);
		add(l3);
		
		r1=new JRadioButton("Male");
		r1.setFont(new Font("Tahoma",Font.PLAIN,15));
		r1.setBounds(200,130,70,30);
		r1.setBackground(Color.white);
		add(r1);
		
		r2=new JRadioButton("Female");
		r2.setFont(new Font("Tahoma",Font.PLAIN,14));
		r2.setBounds(270,130,70,30);
		r2.setBackground(Color.white);
		add(r2);
		
		JLabel l4=new JLabel("Job");
		l4.setFont(new Font("Tohama",Font.PLAIN,15));
		l4.setBounds(60,180,120,30);
		add(l4);
		
		String course[] = {"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
        c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(200,170,150,30);
        add(c1);
		
		JLabel l5=new JLabel("Salary");
		l5.setFont(new Font("Tohama",Font.PLAIN,15));
		l5.setBounds(60,230,120,30);
		add(l5);
		
		tf5=new JTextField();
		add(tf5);
		tf5.setBounds(200,230,150,30);
		
		JLabel l6=new JLabel("Phone");
		l6.setFont(new Font("Tohama",Font.PLAIN,15));
		l6.setBounds(60,280,120,30);
		add(l6);
		
		tf6=new JTextField();
		add(tf6);
		tf6.setBounds(200,280,150,30);
		
		JLabel l7=new JLabel("Aadhar");
		l7.setFont(new Font("Tohama",Font.PLAIN,15));
		l7.setBounds(60,330,120,30);
		add(l7);
		
		tf7=new JTextField();
		add(tf7);
		tf7.setBounds(200,330,150,30);
		
		JLabel l8=new JLabel("Email");
		l8.setFont(new Font("Tohama",Font.PLAIN,15));
		l8.setBounds(60,380,120,30);
		add(l8);
		
		tf8=new JTextField();
		add(tf8);
		tf8.setBounds(200,380,150,30);
		
		b1=new JButton("Submit");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(200,430,150,30);
		b1.addActionListener(this);
		add(b1);
		
		JLabel l9=new JLabel(new ImageIcon("G:\\Java Code Ninja\\Hotel Management System\\src\\hotel\\management\\system\\icons\\tenth4.jpg"));
		l9.setBounds(380,60,450,450);
		add(l9);
		getContentPane().setBackground(Color.white);
		
		JLabel l10=new JLabel("ADD EMPLOYEE DETAILS");
		l10.setForeground(Color.blue);
		l10.setFont(new Font("Tahoma",Font.PLAIN,30));
		l10.setBounds(420,30,400,30);
		add(l10);
		
		setLayout(null);
		setSize(900,600);
		setLocation(300,125);
		setVisible(true);
		
		
		
	}

		public void actionPerformed(ActionEvent ae) {
			String name=tf1.getText();
			String age=tf2.getText();
			String gender=null;
			if(r1.isSelected()) {
				gender="male";
			}else {
				gender="female";
			}
			
			String job=(String)c1.getSelectedItem();
			String salary=tf5.getText();
			String phone=tf6.getText();
			String aadhar=tf7.getText();
			String email=tf8.getText();
			
			
			
			conn c=new conn();
			String str="INSERT INTO employee values('"+ name+"','"+age +"','"+gender +"','"+job +"','"+salary +"','"+phone +"','"+aadhar +"','"+email +"')";
			try {
				
				c.s.executeUpdate(str);
				JOptionPane.showMessageDialog(null, "New Employee Add!");
				this.setVisible(false);
			}catch(Exception e) {
				
			}
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new AddEmployee();
	}

}
