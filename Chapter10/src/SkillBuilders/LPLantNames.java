package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.SwingConstants;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LPLantNames {

	private JFrame frame;
//
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LPLantNames window = new LPLantNames();
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
	
	public LPLantNames() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 642, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 606, 360);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Label = new JLabel("Select Plant Name:");
		Label.setBounds(203, 32, 146, 31);
		Label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(Label);
		
		String[] plantName = {"select plant", "basil", "lavender", "parsley", "peppermint", "saffron", "sage"};
		String[] plantNameLocation = {"", "Ocimum", "Lavandula spica", "Apium", "mentha piperita", "Crocus", "Salvia"};
		
		JComboBox Plant_Selection = new JComboBox(plantName);
		Plant_Selection.setSelectedIndex(0);
		Plant_Selection.setEditable(true);
		//Plant_Selection.setModel(new DefaultComboBoxModel(new String[] {"Select Plant", "basil", "lavender", "parsley", "peppermint", "saffron", "sage"}));
		Plant_Selection.setBounds(213, 74, 121, 31);
		Plant_Selection.setMaximumRowCount(7);
		panel.add(Plant_Selection);
		
		for (int i = 0; i > plantName.length; i++) 
		{
			panel.add(plantName[i], Plant_Selection);
		}
		
		JLabel latinName = new JLabel("");
		latinName.setHorizontalAlignment(SwingConstants.CENTER);
		latinName.setBounds(203, 188, 146, 21);
		panel.add(latinName);
		
		Plant_Selection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				if (Plant_Selection.getSelectedIndex() > -1) 
				{
					System.out.println("Changed Property: " + Plant_Selection.getSelectedIndex());
					latinName.setText(plantNameLocation[Plant_Selection.getSelectedIndex()]);
				}
				else 
				{
					System.out.println("Not on the list");
				}
				
			}
		});
		
		
		
		//Array called plants
		
		//plantNames = new jCombobox(names);
		//plantNames.setAlignmentX(Jcombobox )
		
		
		
	}
}
