package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	Reception(){
		b1=new JButton("New Customer Form");
		b1.setForeground(Color.white);
		b1.setBackground(Color.black);
		b1.setBounds(20,30,150,30);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Room");
		b2.setForeground(Color.white);
		b2.setBackground(Color.black);
		b2.setBounds(20,70,150,30);
		b2.addActionListener(this);
		add(b2);
		
		b3=new JButton("Department");
		b3.setForeground(Color.white);
		b3.setBackground(Color.black);
		b3.setBounds(20,110,150,30);
		b3.addActionListener(this);
		add(b3);
		
		b4=new JButton("All Employee Info");
		b4.setForeground(Color.white);
		b4.setBackground(Color.black);
		b4.setBounds(20,150,150,30);
		b4.addActionListener(this);
		add(b4);
		
		b5=new JButton("Customer Info");
		b5.addActionListener(this);
		b5.setForeground(Color.white);
		b5.setBackground(Color.black);
		b5.setBounds(20,190,150,30);
		add(b5);
		
		b6=new JButton("Manager Info");
		b6.setForeground(Color.white);
		b6.setBackground(Color.black);
		b6.setBounds(20,230,150,30);
		b6.addActionListener(this);
		add(b6);
		
		b7=new JButton("Check Out");
		b7.setForeground(Color.white);
		b7.setBackground(Color.black);
		b7.setBounds(20,270,150,30);
		b7.addActionListener(this);
		add(b7);
		
		b8=new JButton("Update Check Status");
		b8.setForeground(Color.white);
		b8.setBackground(Color.black);
		b8.setBounds(20,310,150,30);
		b8.addActionListener(this);
		add(b8);
		
		b9=new JButton("Update Room Status");
		b9.setForeground(Color.white);
		b9.setBackground(Color.black);
		b9.setBounds(20,350,150,30);
		b9.addActionListener(this);
		add(b9);
		
		b10=new JButton("Pick Up");
		b10.setForeground(Color.white);
		b10.setBackground(Color.black);
		b10.setBounds(20,390,150,30);
		b10.addActionListener(this);
		add(b10);
		
		b11=new JButton("Search Room");
		b11.setForeground(Color.white);
		b11.setBackground(Color.black);
		b11.setBounds(20,430,150,30);
		b11.addActionListener(this);
		add(b11);
		
		b12=new JButton("Log Out");
		b12.setForeground(Color.white);
		b12.setBackground(Color.black);
		b12.setBounds(20,470,150,30);
		b12.addActionListener(this);
		add(b12);
		

		JLabel l1=new JLabel(new ImageIcon("G:\\Java Code Ninja\\Hotel Management System\\src\\hotel\\management\\system\\icons\\fourth.jpg"));
		l1.setBounds(250,30,500,470);
		add(l1);
		
		
		getContentPane().setBackground(Color.white);
		
		setLayout(null);
		setBounds(350,150,800,570);
		setVisible(true);;
		
	}
	
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()==b1) {
				new AddCustomer().setVisible(true);
				this.setVisible(false);
			} else if(ae.getSource()==b2) {
				new Room().setVisible(true);
				this.setVisible(false);
				
			} else if(ae.getSource()==b3) {
				new Department().setVisible(true);
				this.setVisible(false);
				
			} else if(ae.getSource()==b4) {
				new EmployeeInfo().setVisible(true);
				this.setVisible(false);
			} else if(ae.getSource()==b5) {
				new CustomerInfo().setVisible(true);
				this.setVisible(false);
				
			}else if(ae.getSource()==b6) {
				new ManagerInfo().setVisible(true);
				this.setVisible(false);
				
			}else if(ae.getSource()==b7) {
				new CheckOut().setVisible(true);
				this.setVisible(false);
				
			}else if(ae.getSource()==b8) {
				new UpdateCheck().setVisible(true);
				this.setVisible(false);
				
			} else if(ae.getSource()==b9) {
				new UpdateRoom().setVisible(true);
				this.setVisible(false);
				
			}else if(ae.getSource()==b10) {
				new PickUp().setVisible(true);
				this.setVisible(false);
				
			}else if(ae.getSource()==b11) {
				new SearchRoom().setVisible(true);
			this.setVisible(false);
				
			}else if(ae.getSource()==b12) {
				setVisible(false);
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Reception().setVisible(true);
	}

}
