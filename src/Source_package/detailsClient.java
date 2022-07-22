package Source_package;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.security.PublicKey;

public class detailsClient implements ActionListener {
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6;
	JButton b1,b2,b3,b4,b5;
	String ClName;
	

	
	public detailsClient() {
		f = new JFrame("Employee Details");
		f.setBackground(Color.white);
		f.setLayout(null);
		
		
		
		l1 = new JLabel();
		l1.setBounds(0, 0, 700, 500);
		l1.setLayout(null);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/details.jpg"));
		l1.setIcon(i1);
		f.add(l1);
		
		l2 = new JLabel("Employee Details");
		l2.setBounds(430, 20, 200, 40);
		l2.setFont(new Font("serif",Font.BOLD,25));
		l2.setForeground(Color.black);
		f.add(l2);
		
		l3 = new JLabel("Employee Details");
		l3.setBounds(200,20,500,50);
		l3.setFont(new Font("serif", Font.BOLD,35));
		l3.setForeground(Color.blue);
		l1.add(l3);
		
	
		
		l4 = new JLabel("To View Employee             =====>");
		l4.setBounds(190,95,500,50);
		l4.setFont(new Font("serif", Font.BOLD,20));
		l4.setForeground(Color.black);
		l1.add(l4);
		
		l5 = new JLabel("To Update Employee          =====>");
		l5.setBounds(190,145,500,50);
		l5.setFont(new Font("serif", Font.BOLD,20));
		l5.setForeground(Color.black);
		l1.add(l5);
		
		b2 = new JButton("Update");
		b2.setBounds(530,150,100,40);
		b2.setFont(new Font("serif",Font.BOLD,15));
		b2.addActionListener(this);
		l1.add(b2);
		
		
		b1 = new JButton("View");
		b1.setBounds(530, 100, 100, 40);
		b1.setFont(new Font("serif",Font.BOLD,15));
		b1.addActionListener(this);
		l1.add(b1);
		
		b5 = new JButton("Logout");
		b5.setBounds(530, 380, 100, 40);
		b5.setFont(new Font("serif",Font.BOLD,20));
		b5.addActionListener(this);
		l1.add(b5);
		
		
		
		f.setVisible(true);
		f.setSize(700,500);
		f.setLocation(450, 200);
	}
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource() == b1)
			{
				f.setVisible(false);
				new View_EmployeeClient();
			}
			if(ae.getSource()==b2)
			{
				f.setVisible(false);
				new Search_EmployeeClient();
			}
			if(ae.getSource()==b5)
			{
				f.setVisible(false);
				new login();
			}
			
		}
	

	public static void main(String[] args) {
		detailsClient d = new detailsClient();

	}

}
