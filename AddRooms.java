package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddRooms extends JFrame implements ActionListener{
	TextField t1,t2;
	JComboBox c1,c2,c3;
	JButton b1,b2;
	
	AddRooms(){
		
		JLabel l1=new JLabel("Add Rooms");
		l1.setFont(new Font("Tahoma",Font.PLAIN,18));
		l1.setBounds(200,20,100,20);
		add(l1);
		
		JLabel l2=new JLabel("Room Number");
		l2.setFont(new Font("Tahoma",Font.PLAIN,16));
		l2.setBounds(60,80,120,30);
		add(l2);
		
		t1=new TextField();
		t1.setBounds(200,80,150,30);
		add(t1);
		
		JLabel l3=new JLabel("Available Room");
		l3.setFont(new Font("Tahoma",Font.PLAIN,16));
		l3.setBounds(60,130,120,30);
		add(l3);
		
		c1=new JComboBox(new String[] {"Available","Occupied"});
		c1.setBounds(200,130,120,30);
		c1.setBackground(Color.white);
		add(c1);
		
		JLabel l4=new JLabel("Cleaning Status");
		l4.setFont(new Font("Tahoma",Font.PLAIN,16));
		l4.setBounds(60,180,120,30);
		add(l4);
		
		c2=new JComboBox(new String[] {"Clean","Dirty"});
		c2.setBounds(200,180,120,30);
		c2.setBackground(Color.white);
		add(c2);
		
		JLabel l5=new JLabel("Price");
		l5.setFont(new Font("Tahoma",Font.PLAIN,16));
		l5.setBounds(60,230,120,30);
		add(l5);
		
		t2=new TextField();
		t2.setBounds(200,230,150,30);
		add(t2);
		
		JLabel l6=new JLabel("Bed Type");
		l6.setFont(new Font("Tahoma",Font.PLAIN,16));
		l6.setBounds(60,280,120,30);
		add(l6);
		
		String BedType[] ={"Single","Double","Triple(2+1)","Double Square(2+2)"};
		c3=new JComboBox(BedType);
		c3.setBounds(200,280,120,30);
		c3.setBackground(Color.white);
		add(c3);
		
		b1=new JButton("Add Room");
		b1.addActionListener(this);
		b1.setBounds(60,330,120,30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		add(b1);
		
		b2=new JButton("Reset");
		b2.addActionListener(this);
		b2.setBounds(200,330,120,30);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		add(b2);
		
		JLabel l7=new JLabel(new ImageIcon("G:\\Java Code Ninja\\Hotel Management System\\src\\hotel\\management\\system\\icons\\twelve.jpg"));
		l7.setBounds(500,50,350,250);
		add(l7);
		
		getContentPane().setBackground(Color.white);
		
		setTitle("Add Rooms");
		setBounds(300,200,1000,500);
		setLayout(null);
		setVisible(true);
	}
	
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()==b1) {
				String room=t1.getText();
				String available_room=(String)c1.getSelectedItem();
				String cleaning_status=(String)c2.getSelectedItem();
				String price=t2.getText();
				String bed_type=(String)c3.getSelectedItem();
				
				
				conn con =new conn();
				try {
					String str="INSERT INTO add_room values('"+room+"','"+available_room +"','"+ cleaning_status+"','"+price +"','"+ bed_type+"')";
					con.s.executeUpdate(str);
					JOptionPane.showMessageDialog(null, "New Room Added");
					this.setVisible(false);
				}catch(Exception e) {
					
				}
				
				
			}else if(ae.getSource()==b2) {
				t1.setText("");
				c1.setSelectedItem("");
				c2.setSelectedItem("");
				c3.setSelectedItem("");
				t2.setText("");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new AddRooms();
	}

}
