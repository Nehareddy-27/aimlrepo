package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movie {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movie window = new movie();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public movie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 13));
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Booking");
		lblNewLabel_1.setForeground(new Color(64, 128, 128));
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(133, 21, 102, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lb2 = new JLabel("Name");
		lb2.setForeground(new Color(128, 0, 255));
		lb2.setBackground(new Color(240, 240, 240));
		lb2.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 11));
		lb2.setBounds(53, 60, 46, 14);
		frame.getContentPane().add(lb2);
		
		t1 = new JTextField();
		t1.setBounds(143, 46, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel cb1 = new JLabel("Movie");
		 cb1.setForeground(new Color(128, 0, 255));
		 cb1.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 11));
		 cb1.setBounds(53, 94, 56, 14);
		frame.getContentPane().add(cb1);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "Devara", "Pushpa", "Kalki"}));
		c1.setBounds(133, 88, 86, 22);
		frame.getContentPane().add(c1);
		
		JLabel lb4 = new JLabel("Num Tickects");
		lb4.setForeground(new Color(128, 0, 255));
		lb4.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 11));
		lb4.setBounds(53, 136, 78, 20);
		frame.getContentPane().add(lb4);
		
		JComboBox cb2 = new JComboBox();
		cb2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5"}));
		cb2.setBounds(133, 135, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					int bill=0;
					String name=t1.getText();
					String movie=(String) c1.getSelectedItem();
					String numtickets=(String) cb2.getSelectedItem();
					int nt=Integer.parseInt(numtickets);
					if(movie.equals("Devara"))
					{
						bill=bill+150*nt;
						
					}
					if(movie.equals("Pushpa"))
					{
						bill=bill+200*nt;
						
					}
					if(movie.equals("Kalki")) {
						bill=bill+100*nt;
				    }
				    int res=0;
				    res=JOptionPane.showConfirmDialog(btnNewButton, "NAME"+name+"\n MOVIE"+movie+"\n NUMBER OF TICKETS"+numtickets+"\n AMOUNT"+bill);
				    int YES_OPTION=0;
				    if(res==YES_OPTION)
				    {
				    	JOptionPane.showMessageDialog(btnNewButton, "booking confirmed");
				    }
				    else
				    {
				    	JOptionPane.showMessageDialog(btnNewButton, "booking cancelled");
				    }
			}
		});
		btnNewButton.setBounds(130, 187, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		JLabel lb1 = new JLabel("New label");
		lb1.setForeground(new Color(0, 0, 0));
		lb1.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Downloads\\nature.jpg"));
		lb1.setBounds(0, 0, 455, 275);
		frame.getContentPane().add(lb1);
	}
}
