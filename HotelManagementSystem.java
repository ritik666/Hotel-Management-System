package hotel.management.system;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class HotelManagementSystem extends JFrame implements ActionListener{
	
		HotelManagementSystem(){
			setTitle("Hotel Management System");
			setSize(1500,844);
			JLabel l1=new JLabel(new ImageIcon("G:\\Java Code Ninja\\Hotel Management System\\src\\hotel\\management\\system\\icons\\first.jpeg"));
			l1.setBounds(0,0,1500,844);
			add(l1);
			JLabel l2=new JLabel("Hotel Management System");
			l2.setBounds(20,450,1000,82);
			l2.setForeground(Color.white);
			l2.setFont(new Font("serif",Font.PLAIN,70));
			l1.add(l2);
			JButton b1=new JButton("Next");
			b1.setBackground(Color.white);
			b1.setForeground(Color.black);
			b1.setBounds(1125,95,150,50);
			b1.addActionListener(this);
			l1.add(b1);
			
			setLayout(null);
			setVisible(true);
			
			while(true) {
				l2.setVisible(false);
				try {
					Thread.sleep(400);
				}catch (Exception e) {
					
				}
				l2.setVisible(true);
				try {
					Thread.sleep(400);
				}catch(Exception e) {
					
				}
			}
		
		}
		
		public void actionPerformed(ActionEvent ae) {
			new Login().setVisible(true);
			this.setVisible(false);
			
		}

	public static void main(String[] args) {
		new HotelManagementSystem();

	}

}
