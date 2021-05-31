package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class Room extends JFrame implements ActionListener{
	JTable t1;
	JButton b1,b2;
	Room(){
		t1=new JTable();
		t1.setBounds(5,40,500,400);
		getContentPane().setBackground(Color.white);
		add(t1);
		
		b1=new JButton("Load Data");
		b1.setBounds(100,460,120,30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Back");
		b2.setBounds(250,460,120,30);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		add(b2);
		
		JLabel l1=new JLabel("Room No");
		l1.setBounds(30,10,70,20);
		add(l1);
		
		JLabel l2=new JLabel("Availability");
		l2.setBounds(120,10,70,20);
		add(l2);
		
		JLabel l3=new JLabel("Status");
		l3.setBounds(235,10,70,20);
		add(l3);
		
		JLabel l4=new JLabel("Price");
		l4.setBounds(340,10,70,20);
		add(l4);
		
		JLabel l5=new JLabel("Bed Type");
		l5.setBounds(440,10,70,20);
		add(l5);

		
		JLabel l8=new JLabel(new ImageIcon("G:\\Java Code Ninja\\Hotel Management System\\src\\hotel\\management\\system\\icons\\eigth2.jpg"));
		l8.setBounds(450,25,450,450);
		add(l8);
		
		setLayout(null);
		setBounds(300,75,1000,600);
		setVisible(true);
	}
	
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()==b1) {
				try {
					conn c=new conn();
					String str="SELECT * FROM add_room";
					ResultSet rs=c.s.executeQuery(str);
					t1.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}catch(Exception e) {
					
				}
				
			}else if(ae.getSource()==b2) {
				new Reception().setVisible(true);
				this.setVisible(false);
			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Room().setVisible(true);

	}

}
