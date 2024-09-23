package Masterys;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Masterys.MetricConversion;

//import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class MetricConversion {
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	
	public MetricConversion() {
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
		
		JLabel lblSelectAConversion = new JLabel("Select a conversion type");
		lblSelectAConversion.setBounds(216, 28, 188, 31);
		lblSelectAConversion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblSelectAConversion);
		
		String[] ConversionType = {"select conversion", "inches to centimemters", "feet to meters", "gallons to liters", "pounds to kilograms"};
		String[] Formula = {"", "1 inch = 2.54 cm", "1 foot = 0.3048 meters", "1 gallon = 4.5461 liters", "1 pound = 0.4536 kilograms"};
		
		JComboBox MetricConversion = new JComboBox(ConversionType);
		MetricConversion.setSelectedIndex(0);
		MetricConversion.setEditable(true);
		//Plant_Selection.setModel(new DefaultComboBoxModel(new String[] {"Select Plant", "basil", "lavender", "parsley", "peppermint", "saffron", "sage"}));
		MetricConversion.setBounds(216, 70, 165, 31);
		MetricConversion.setMaximumRowCount(7);
		panel.add(MetricConversion);
		
		for (int i = 0; i > ConversionType.length; i++) 
		{
			panel.add(ConversionType[i], MetricConversion);
		}
		
		JLabel Formulaout = new JLabel("");
		Formulaout.setHorizontalAlignment(SwingConstants.CENTER);
		Formulaout.setBounds(216, 112, 165, 21);
		panel.add(Formulaout);
		
		MetricConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				if (MetricConversion.getSelectedIndex() > -1) 
				{
					System.out.println("Changed Property: " + MetricConversion.getSelectedIndex());
					Formulaout.setText(Formula[MetricConversion.getSelectedIndex()]);
				}
				else 
				{
					System.out.println("Not on the list");
				}
				
			}
		});
		
		
		
	}
}
