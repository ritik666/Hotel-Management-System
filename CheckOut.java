package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CheckOut extends JFrame implements ActionListener{
	Choice c1;
	JTextField t1;
	JButton b1,b2,b3;
	CheckOut(){
		JLabel l1=new JLabel("Check Out");
		l1.setFont(new Font("Tahoma",Font.PLAIN,20));
		l1.setForeground(Color.blue);
		l1.setBounds(30,20,100,30);
		add(l1);
		
		JLabel l2=new JLabel("Customer ID");
		l2.setBounds(30,80,100,30);
		add(l2);
		
		c1=new Choice();
		try {
			conn c=new conn();
			ResultSet rs=c.s.executeQuery("SELECT * FROM customer");
			while(rs.next()) {
				c1.add(rs.getString("number"));
			}
			
		}catch(Exception e) {
			
		}
		c1.setBounds(150,80,120,30);
		add(c1);
		
		JLabel l3=new JLabel("Room Number");
		l3.setBounds(30,130,100,30);
		add(l3);
		
		t1=new JTextField();
		t1.setBounds(150,130,150,25);
		add(t1);
		
		b1=new JButton("Check Out");
		b1.addActionListener(this);
		b1.setForeground(Color.white);
		b1.setBackground(Color.black);
		b1.setBounds(30,200,120,30);
		add(b1);
		
		b2=new JButton("Back");
		b2.addActionListener(this);
		b2.setForeground(Color.white);
		b2.setBackground(Color.black);
		b2.setBounds(170,200,120,30);
		add(b2);
		
		
		b3=new JButton(new ImageIcon("G:\\Java Code Ninja\\Hotel Management System\\src\\hotel\\management\\system\\icons\\tick1.png"));
		b3.setBounds(310,80,20,20);
		b3.addActionListener(this);
		add(b3);
		
		JLabel l4=new JLabel(new ImageIcon("G:\\Java Code Ninja\\Hotel Management System\\src\\hotel\\management\\system\\icons\\sixth1.jpg"));
		l4.setBounds(350,0,450,250);
		add(l4);
		
		
		
		
		
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setBounds(300,200,800,300);
		setVisible(true);
	}
	
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()==b1) {
				String id = c1.getSelectedItem();
                String s1 = t1.getText();
                String deleteSQL = "Delete from customer where number = "+id;
                String q2 = "update add_room set available_room = 'Available' where room = "+s1;
                
                
                	conn c = new conn();

                	try{
	
	
                		c.s.executeUpdate(deleteSQL);
                		c.s.executeUpdate(q2);
                		JOptionPane.showMessageDialog(null, "Check Out Successful");
                		new Reception().setVisible(true);
                       setVisible(false);
                	}catch(SQLException e1){
                		System.out.println(e1.getMessage());
}
				
				
			}else if(ae.getSource()==b2) {
				new Reception().setVisible(true);
				setVisible(false);
				
			}else if(ae.getSource()==b3) {
				try {
				conn c=new conn();
				String id=c1.getSelectedItem();
				ResultSet rs=c.s.executeQuery("SELECT * FROM customer where number='"+id+"'");
				while(rs.next()) {
					t1.setText(rs.getString("room"));
				}
				}catch (Exception e) {
					
				}
				
				
			}
			
			
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new CheckOut().setVisible(true);
	}

}
