package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField tf1,tf2;
	JButton b1,b2;
	
	Login(){
		l1=new JLabel("Username");
		l1.setBounds(40,20,100,30);
		add(l1);
		
		l2=new JLabel("Password");
		l2.setBounds(40,70,100,30);
		add(l2);
		
		tf1=new JTextField();
		tf1.setBounds(150,20,150,30);
		add(tf1);
		
		tf2=new JPasswordField();
		tf2.setBounds(150,70,150,30);
		add(tf2);
		
		b1=new JButton("Login");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(40,140,120,30);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Reset");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(180,140,120,30);
		b2.addActionListener(this);
		add(b2);		
		JLabel l3=new JLabel(new ImageIcon("G:\\Java Code Ninja\\Hotel Management System\\src\\hotel\\management\\system\\icons\\second3.jpg"));
		l3.setBounds(350,10,200,200);
		add(l3);
		getContentPane().setBackground(Color.white);
		

		
		
		setLayout(null);
		setBounds(600,300,600,300);
		setVisible(true);
	}
	
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()==b1) {
				String username=tf1.getText();
				String password=tf2.getText();
				 conn c=new conn();
				String str ="SELECT * FROM login WHERE username='"+username+"' and password='"+password+"'";
				try {
				ResultSet rs=c.s.executeQuery(str);
				if(rs.next()) {
					new Dashboard().setVisible(true);
					this.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null, "Invalid username or password");
					this.setVisible(false);
				}
				}catch(Exception e ) {
					
				}
				
				
			}else if(ae.getSource()==b2){
				tf1.setText("");  
	            tf2.setText(""); 
			}
			
		}
	
	public static void main(String args[]) {
		new Login();
	}
}
