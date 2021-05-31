package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddCustomer extends JFrame implements ActionListener {
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	JComboBox c1;
	JRadioButton r1,r2;
	Choice c2;
	
	AddCustomer(){
		JLabel l1=new JLabel("New Customer Form");
		l1.setForeground(Color.blue);
		l1.setFont(new Font("Tahoma",Font.PLAIN,20));
		l1.setBounds(100,20,200,30);
		add(l1);
		
		JLabel l2=new JLabel("ID");
		l2.setBounds(35,80,100,20);
		add(l2);
		
		String[] str= {"Passport","Voter-id Card","PAN Card","Aadhar Card","Driving License"};
		c1=new JComboBox(str);
		c1.setBounds(200,80,150,20);
		add(c1);
		
		JLabel l3=new JLabel("Number");
		l3.setBounds(35,120,100,20);
		add(l3);
		
		t1=new JTextField();
		t1.setBounds(200,120,150,25);
		add(t1);
		
		JLabel l4=new JLabel("Name");
		l4.setBounds(35,160,100,20);
		add(l4);
		
		t2=new JTextField();
		t2.setBounds(200,160,150,25);
		add(t2);
		
		
		JLabel l5=new JLabel("Gender");
		l5.setBounds(35,200,100,20);
		add(l5);
		
		r1=new JRadioButton("Male");
		r1.setBounds(200,200,60,20);
		r1.setBackground(Color.white);
		add(r1);
		
		r2=new JRadioButton("Female");
		r2.setBounds(350,200,80,20);
		r2.setBackground(Color.white);
		add(r2);
		
		JLabel l6=new JLabel("Country");
		l6.setBounds(35,240,100,20);
		add(l6);
		
		t3=new JTextField();
		t3.setBounds(200,240,150,25);
		add(t3);
		
		JLabel l7=new JLabel("Allocated Room No");
		l7.setBounds(35,280,150,20);
		add(l7);
		
		c2=new Choice();
		try {
			conn c=new conn();
			String stri="SELECT * FROM add_room";
			ResultSet rs=c.s.executeQuery(stri);
			while(rs.next()) {
				c2.add(rs.getString("room"));
				
			}
			
		}catch (Exception e) {
			
		}
		c2.setBounds(200,280,150,25);
		add(c2);
		
		JLabel l8=new JLabel("Checked In");
		l8.setBounds(35,320,100,20);
		add(l8);
		
		t4=new JTextField();
		t4.setBounds(200,320,150,25);
		add(t4);
		
		JLabel l9=new JLabel("Deposit");
		l9.setBounds(35,360,100,20);
		add(l9);
		
		t5=new JTextField();
		t5.setBounds(200,360,150,25);
		add(t5);
		
		b1=new JButton("Add Customer");
		b1.setBounds(30,410,120,25);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Back");
		b2.setBounds(200,410,120,25);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		add(b2);
		
		JLabel l10=new JLabel(new ImageIcon("G:\\Java Code Ninja\\Hotel Management System\\src\\hotel\\management\\system\\icons\\88.png"));
		l10.setBounds(500,30,350,352);
		add(l10);
		
		
		
		
		setLayout(null);
		setVisible(true);
		setBounds(300,150,900,500);
		
		getContentPane().setBackground(Color.white);
		
	}
	
		public void actionPerformed(ActionEvent ae) {
		
			if(ae.getSource()==b1) {
				String id=(String) c1.getSelectedItem();
				String number=t1.getText();
				String name=t2.getText();
				String gender=null;
				if(r1.isSelected()) {
					gender="Male";
				}else if(r2.isSelected()) {
					gender="Female";
				}
				String country=t3.getText();
				String room=c2.getSelectedItem();
				String status=t4.getText();
				String deposit=t5.getText();
				
				String str="INSERT INTO customer VALUES('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+room+"','"+status+"','"+deposit+"')";
				String str2="UPDATE add_room set available_room= 'Occupied' where room='"+room+"'";
				try {
					conn c=new conn();
					c.s.executeUpdate(str);
					c.s.executeUpdate(str2);
					JOptionPane.showMessageDialog(null, "New Customer Added");
					new Reception().setVisible(true);
					setVisible(false);
				}catch(Exception e) {
					
				}
				
			}else if(ae.getSource()==b2) {
				new Reception().setVisible(true);
				this.setVisible(false);
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AddCustomer().setVisible(true);

	}

}
