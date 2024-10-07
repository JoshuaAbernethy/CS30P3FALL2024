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

public class BreakAPlate {

	private JFrame frame;

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
		String ImageID = "plates";
		ImageIcon plates = new ImageIcon("C:\\Users\\27346001\\Downloads\\" + ImageID + ".gif");
		ImageIcon allplatesbroken = new ImageIcon("C:\\Users\\27346001\\Downloads\\plates_all_broken.gif");
		ImageIcon twobrokenplates = new ImageIcon("C:\\Users\\27346001\\Downloads\\plates_two_broken.gif");
		ImageIcon tiger = new ImageIcon("C:\\Users\\27346001\\Downloads\\tiger_plush.gif");
		ImageIcon sticker = new ImageIcon("C:\\Users\\27346001\\Downloads\\sticker.gif");
		
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
		
		JLabel prizeimg = new JLabel("Placeholder");
		prizeimg.setBounds(221, 364, 139, 14);
		panel.add(prizeimg);
		
		
		JButton playButton = new JButton("Play");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Test");
				int brokenPlates = 0;
				
				for (int i = 0; i < 3; i++) 
				{
					int RandomBrokenChance = (int) ((int) 1 * Math.random());
					
					if (RandomBrokenChance == 1) 
					{
						brokenPlates++;
					}
				}
				
				
				if (brokenPlates == 3) 
				{
					prizeimg.equals(tiger);
				}
				else 
				{
					playButton.equals("play again");
					prizeimg.equals(sticker);
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
}