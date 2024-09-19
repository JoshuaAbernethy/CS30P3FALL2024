package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SemesterAvg {

	private JFrame frame;
	private JTextField SemesterInput_2_1;
	private JTextField SemesterInput_2;
	private JTextField SemesterInput_3;
	private JTextField SemesterInput_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
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
	public SemesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 471, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		// Semester labels
	
		JLabel Grade_1 = new JLabel("Grade # 1");
		Grade_1.setFont(new Font("Verdana", Font.BOLD, 12));
		Grade_1.setBounds(10, 39, 73, 14);
		panel.add(Grade_1);
		
		JLabel Grade_2 = new JLabel("Grade # 2");
		Grade_2.setFont(new Font("Verdana", Font.BOLD, 12));
		Grade_2.setBounds(10, 78, 73, 14);
		panel.add(Grade_2);
		
		JLabel Grade_3 = new JLabel("Grade # 3");
		Grade_3.setFont(new Font("Verdana", Font.BOLD, 12));
		Grade_3.setBounds(10, 116, 73, 14);
		panel.add(Grade_3);
		
		// First Semester Text input
		SemesterInput_1 = new JTextField();
		SemesterInput_1.setForeground(SystemColor.text);
		SemesterInput_1.setBackground(SystemColor.controlText);
		SemesterInput_1.setFont(new Font("Verdana", Font.BOLD, 13));
		SemesterInput_1.setColumns(10);
		SemesterInput_1.setBounds(93, 37, 86, 20);
		panel.add(SemesterInput_1);
		
		// Second Semester Text input
		SemesterInput_2 = new JTextField();
		SemesterInput_2.setForeground(SystemColor.text);
		SemesterInput_2.setBackground(SystemColor.controlText);
		SemesterInput_2.setFont(new Font("Verdana", Font.BOLD, 13));
		SemesterInput_2.setBounds(93, 76, 86, 20);
		SemesterInput_2.setColumns(10);
		panel.add(SemesterInput_2);
		
		// Third Semester Text input
		SemesterInput_3 = new JTextField();
		SemesterInput_3.setForeground(SystemColor.text);
		SemesterInput_3.setBackground(SystemColor.controlText);
		SemesterInput_3.setFont(new Font("Verdana", Font.BOLD, 13));
		SemesterInput_3.setBounds(93, 114, 86, 20);
		SemesterInput_3.setColumns(10);
		panel.add(SemesterInput_3);
		
		// Shows the user the Avg
		JLabel DispAVG = new JLabel("0");
		DispAVG.setFont(new Font("Verdana", Font.BOLD, 12));
		DispAVG.setBounds(271, 183, 105, 23);
		panel.add(DispAVG);
		
		// Submit button
		JButton button = new JButton("Average");
		button.setFont(new Font("Verdana", Font.BOLD, 11));
		button.setBounds(172, 183, 89, 23);
		panel.add(button);
		
		// Submit Button Press
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				double avgGrade;
				String GR1 = SemesterInput_1.getText();
				String GR2 = SemesterInput_2.getText();
				String GR3 = SemesterInput_3.getText();
				
				
			}
		});
	}
}
