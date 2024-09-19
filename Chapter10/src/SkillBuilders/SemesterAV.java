package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SemesterAV {

	protected static final JLabel DispAVG = null;
	private JFrame frame;
	private JTextField EnterGR2;
	private JTextField EnterGR1;
	private JTextField EnterGR3;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAV window = new SemesterAV();
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
	
	public SemesterAV() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 136, 128);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("Focused");
			}
			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("Lost Focused");
			}
		});
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Label1 = new JLabel("Grade # 1");
		Label1.setBounds(10, 39, 60, 14);
		panel.add(Label1);
		
		
		EnterGR1 = new JTextField();
		EnterGR1.setBounds(69, 75, 86, 20);
		panel.add(EnterGR1);
		EnterGR1.setColumns(10);
		
		JLabel Label2 = new JLabel("Grade # 2");
		Label2.setBounds(10, 78, 60, 14);
		panel.add(Label2);
		
		EnterGR2 = new JTextField();
		EnterGR2.setBounds(69, 75, 86, 20);
		panel.add(EnterGR2);
		EnterGR2.setColumns(10);
		
		JLabel Label3 = new JLabel("Grade # 3");
		Label3.setBounds(10, 116, 60, 14);
		panel.add(Label3);
		
		EnterGR3 = new JTextField();
		EnterGR3.setBounds(69, 113, 86, 20);
		panel.add(EnterGR3);
		EnterGR3.setColumns(10);
		
		//double GR1 = Double.parseDouble(EnterGR1.getText());
		//double GR2 = Double.parseDouble(EnterGR2.getText());
		//double GR3 = Double.parseDouble(EnterGR3.getText());
		
		//double average = (GR1 + GR2 + GR3)/3;
		
		JButton button = new JButton("Average");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		button.setBounds(172, 183, 89, 23);
		panel.add(button);
		
		JLabel DispAVG = new JLabel("");
		DispAVG.setBounds(271, 187, 60, 14);
		panel.add(DispAVG);
		
		frame.pack();
		frame.setVisible(true);
	}
		
	public void actionPerformed(ActionEvent event) {
		String eventName = event.getActionCommand();
		
		
	}
	public JPanel getPanel_1() {
		return panel;
	}
	public JFrame getFrame() {
		return frame;
	}
}
