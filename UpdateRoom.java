package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateRoom extends JFrame implements ActionListener{
	Choice c1;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3;
	
	
	UpdateRoom(){
		JLabel l1=new JLabel("Update Room Status");
		l1.setFont(new Font("Tahoma",Font.PLAIN,20 ));
		l1.setForeground(Color.blue);
		l1.setBounds(20,30,200,30);
		add(l1);
		
		JLabel l2=new JLabel("Guest ID");
		l2.setBounds(20,80,120,20);
		add(l2);
		
		c1=new Choice();
		try {
			conn c=new conn();
			ResultSet rs=c.s.executeQuery("SELECT * FROM customer");
			while(rs.next()) {
				c1.add(rs.getString("number"));
				
			}
			
		}catch (Exception e) {
			
		}
		c1.setBounds(200,80,150,25);
		add(c1);

		
		JLabel l3=new JLabel("Room Number");
		l3.setBounds(20,130,200,20);
		add(l3);
		
		t1=new JTextField();
		t1.setBounds(200,130,150,25);
		add(t1);
		
		JLabel l4=new JLabel("Availability");
		l4.setBounds(20,180,200,20);
		add(l4);
		
		t2=new JTextField();
		t2.setBounds(200,180,150,25);
		add(t2);
		
		
		JLabel l5=new JLabel("Clean Status");
		l5.setBounds(20,230,200,20);
		add(l5);
		
		t3=new JTextField();
		t3.setBounds(200,230,150,25);
		add(t3);
		
		b1=new JButton("Check");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(130,300,120,30);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Update");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(40,350,120,30);
		b2.addActionListener(this);
		add(b2);
		
		b3=new JButton("Back");
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setBounds(220,350,120,30);
		b3.addActionListener(this);
		add(b3);
		
		JLabel l6=new JLabel(new ImageIcon("G:\\Java Code Ninja\\Hotel Management System\\src\\hotel\\management\\system\\icons\\seventh1.jpg"));
		l6.setBounds(400,40,500,400);
		add(l6);
		
		
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setBounds(250,200,1000,500);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			String room=null;
			String s1=c1.getSelectedItem();
			conn c=new conn();
			
			try {
				ResultSet rs=c.s.executeQuery("SELECT * FROM customer where number='"+s1+"'");
				while(rs.next()) {
					t1.setText(rs.getString("room"));
					room=rs.getString("room");	
				}
				ResultSet rs2=c.s.executeQuery("SELECT * FROM add_room where room='"+room+"'");
				while(rs2.next()) {
					t2.setText(rs2.getString("available_room"));
					t3.setText(rs2.getString("cleaning_status"));
					
				}
			}catch(Exception e) {
				
			}
			
		}else if(ae.getSource()==b2) {
			try {
				conn c=new conn();
				String room=t1.getText();
				String available_room=t2.getText();
				String cleaning_status=t3.getText();
				String str="UPDATE add_room set available_room='"+available_room+"', cleaning_status='"+cleaning_status+"'where room='"+room+"' ";
				c.s.executeUpdate(str); 
				JOptionPane.showMessageDialog(null,"Room Updated Succesfully");
				new Reception().setVisible(true);
				this.setVisible(false);
			}catch(Exception e) {
				
			}
			
		}else if(ae.getSource()==b3) {
			new Reception().setVisible(true);
			setVisible(false);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UpdateRoom().setVisible(true);
	}

}
