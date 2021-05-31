package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu m1,m2;
	JMenuItem i1,i2,i3,i4;
	
	
	Dashboard(){
		mb=new JMenuBar();
		add(mb);
		
		m1=new JMenu("HOTEL MANAGEMENT");
		m1.setForeground(Color.RED);
		mb.add(m1);
		
		m2=new JMenu("ADMIN");
		m2.setForeground(Color.BLUE);
		m2.addActionListener(this);
		mb.add(m2);
		
		i1=new JMenuItem("RECEPTION");
		i1.addActionListener(this);
		m1.add(i1);
		
		i2=new JMenuItem("ADD EMPLOYEE");
		i2.addActionListener(this);
		m2.add(i2);
		
		i3=new JMenuItem("ADD ROOMS");
		i3.addActionListener(this);
		m2.add(i3);
		
		i4=new JMenuItem("ADD DRIVERS");
		i4.addActionListener(this);
		m2.add(i4);
		
		mb.setBounds(0,0,1950,30);
		
		JLabel l1=new JLabel(new ImageIcon("G:\\Java Code Ninja\\Hotel Management System\\src\\hotel\\management\\system\\icons\\third.jpg"));
		l1.setBounds(0,0,1600,850);
		add(l1);
		
		JLabel l2=new JLabel("THE RG GROUP WELCOMES YOU");
		l2.setBounds(500,40,600,50);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("sarif",Font.PLAIN,30));
		l1.add(l2);
		
		
		
		
		setLayout(null);
		setBounds(0,0,1950,1020);
		setVisible(true);
		
	}
	
		public void actionPerformed(ActionEvent ae) {
			if(ae.getActionCommand().equals("RECEPTION")) {
				new Reception().setVisible(true);
				
			}else if(ae.getActionCommand().equals("ADD EMPLOYEE")) {
				new AddEmployee().setVisible(true);
			}else if(ae.getActionCommand().equals("ADD ROOMS")) {
				new AddRooms().setVisible(true);
			}else if(ae.getActionCommand().equals("ADD DRIVERS")) {
				new AddDriver().setVisible(true);
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dashboard().setVisible(true);

	}

}
