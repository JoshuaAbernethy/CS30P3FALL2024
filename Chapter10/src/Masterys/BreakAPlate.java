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
import javax.swing.JProgressBar;
import java.awt.Label;
import javax.swing.SwingConstants;
import java.math.*;
import java.lang.*;

public class BreakAPlate {

	private JFrame frame;
//
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
		frame = new JFrame();
		frame.setBounds(100, 100, 614, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 588, 414);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel plateimgs = new JLabel("");
		plateimgs.setHorizontalAlignment(SwingConstants.CENTER);
		plateimgs.setIcon(new ImageIcon("C:\\Users\\27346001\\Downloads\\plates.gif"));
		plateimgs.setBounds(139, 0, 291, 158);
		panel.add(plateimgs);
		
		JLabel prizeimg = new JLabel("");
		prizeimg.setBounds(217, 302, 139, 105);
		panel.add(prizeimg);
		
		changeImage(plateimgs, "plates");
		
		JButton playButton = new JButton("Play");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int brokenPlates = 0;
				
			// for (int i = 0; i < 3; i++) 
				//{
					//if (i == 3) {
					//	prizeimg.equals(tiger);
					//}
				//}

				
				System.out.println("");
				for (int i = 0; i < 3; i++) 
				{
					int RandomBrokenChance = (int) Math.round(Math.random());
					System.out.println("Random Number: " + RandomBrokenChance);
					
					if (RandomBrokenChance == 1) 
					{
						brokenPlates++;
					}
				}
				
				
				if (brokenPlates == 3) 
				{
					changeImage(plateimgs, "plates_all_broken");
					changeImage(prizeimg, "tiger_plush");
				}
				else 
				{
					changeImage(plateimgs, "plates_two_broken");
					changeImage(prizeimg, "sticker");
				}
			}
		});
		playButton.setForeground(Color.BLUE);
		playButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		playButton.setBounds(183, 152, 196, 143);
		panel.add(playButton);
		
		playButton.setForeground(Color.BLUE);
		playButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		playButton.setBounds(183, 152, 196, 143);
		panel.add(playButton);

	}
	
	public static void changeImage(JLabel lable, String image) // plates, plates_all_broken, plates_two_broken, tiger_plush, sticker
	{
		ImageIcon change = new ImageIcon("C:\\Users\\27346001\\Downloads\\" + image + ".gif");
		lable.setIcon(change);
	}
}