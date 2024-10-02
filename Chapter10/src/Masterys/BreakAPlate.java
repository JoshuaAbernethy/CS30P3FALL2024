package Masterys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class BreakAPlate {

	private JFrame frame;
	private JTextField Fn;
	private JTextField Ln;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon cres = new ImageIcon("../Chapter10/src/ClassDemos/chhs.png");
		ImageIcon pears = new ImageIcon("../Chapter10/src/ClassDemos/pearson.png");
		ImageIcon west = new ImageIcon("../Chapter10/src/ClassDemos/western.png");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 614, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 588, 414);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Fn = new JTextField();
		Fn.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				Fn.setText("");
				
				
			}
		});
		Fn.setForeground(Color.DARK_GRAY);
		Fn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Fn.setText("First Name");
		Fn.setBounds(29, 48, 159, 34);
		panel.add(Fn);
		Fn.setColumns(10);
		
		Ln = new JTextField();
		Ln.setForeground(Color.DARK_GRAY);
		Ln.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Ln.setText("Last Name");
		Ln.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Ln.setText("");
				
			}
		});
		Ln.setColumns(10);
		Ln.setBounds(240, 48, 159, 34);
		panel.add(Ln);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.RED);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Grade:", "10", "11", "12"}));
		comboBox.setBounds(32, 120, 156, 39);
		panel.add(comboBox);
		
		
		JLabel disp = new JLabel("");
		disp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		disp.setBounds(25, 196, 374, 68);
		panel.add(disp);
		
		JComboBox school = new JComboBox();
		school.setForeground(Color.RED);
		school.setFont(new Font("Tahoma", Font.PLAIN, 15));
		school.setModel(new DefaultComboBoxModel(new String[] {"Select School:", "Crescent", "Pearson", "Western"}));
		school.setBounds(198, 120, 169, 39);
		panel.add(school);
		
		JLabel imgd = new JLabel("");
		imgd.setBounds(389, 245, 189, 158);
		panel.add(imgd);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String grade = " ";
				String sch = " ";
				
				String firstN = Fn.getText();
				String lastN = Ln.getText();
				
				if(comboBox.getSelectedItem().equals("10"))
				{
					grade = "10";
				}
				else if(comboBox.getSelectedItem().equals("11"))
				{
					grade = "11";
				}
				else
				{
					grade = "12";
				}
				
				if(school.getSelectedItem().equals("Crescent"))
				{
					sch = "Crescent";
					imgd.setIcon(cres);
					
				}
				else if(school.getSelectedItem().equals("Pearson"))
				{
					sch = "Pearson";
					imgd.setIcon(pears);
				}
				else
				{
					sch = "Western";
					imgd.setIcon(west);
				}
				
				
				
				
				
				
				disp.setText(firstN + " " +
							   	lastN + " is in grade: "+
								 grade + " "+
								 "and goes to "+ sch
								);
				
				
				
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(409, 34, 123, 200);
		panel.add(btnNewButton);
		
		
		
		
		
		
	}
}