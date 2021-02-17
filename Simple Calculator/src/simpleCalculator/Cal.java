package simpleCalculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cal extends JFrame {
	
	private double num1;
	private double num2;
	private double result;
	private String operators;

	private JPanel contentPane;

	JButton B1, B2, B3, B4, B5, B6, B7, B8, B9, B0;
	JButton Add, sub, mult, div, Bequals, Bstop, BC, Bpercent;
	JButton BAC;
	private JButton B7_1;
	private JButton B8_1;
	private JButton B9_1;
	private JPanel panel_2;
	private JTextField displayScreen;
	private JButton btnNewButton;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_1;
	
	private String cleared;

	/**
	 * Launch the application.
	 */

	/**
	 *Exceptions to handle nimbus look and fee
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public Cal() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

		JPanel panel = new JPanel();
		panel.setBounds(6, 69, 189, 236);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		//Declaration of all Buttons
		B1 = new JButton("1");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String	enteredNumber = displayScreen.getText();
			
			if(enteredNumber =="") {
				
				displayScreen.setText(B1.getText());
				
			}
			else {
				if (displayScreen.getText().equals("0")) {
					displayScreen.setText("");
				}
				enteredNumber = displayScreen.getText() + B1.getText();
				displayScreen.setText(enteredNumber);
				
			}
			
				
			}
		});
		B1.setBounds(10, 178, 50, 50);
		panel.add(B1);
		B1.setBackground(Color.darkGray);
		B1.setForeground(Color.WHITE);

		B2 = new JButton("2");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String	enteredNumber = displayScreen.getText();
				
				if(enteredNumber =="") {
					
					displayScreen.setText(B2.getText());
				}
				else {
					if (displayScreen.getText().equals("0")) {
						displayScreen.setText("");
					}
					enteredNumber = displayScreen.getText() + B2.getText();
					displayScreen.setText(enteredNumber);
				}
			}
		});
		B2.setBounds(70, 178, 50, 50);
		panel.add(B2);
		B2.setBackground(Color.darkGray);
		B2.setForeground(Color.WHITE);

		B3 = new JButton("3");
		B3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String	enteredNumber = displayScreen.getText();
				
				if(enteredNumber =="") {
					
					displayScreen.setText(B3.getText());
				}
				else {
					if (displayScreen.getText().equals("0")) {
						displayScreen.setText("");
					}
					enteredNumber = displayScreen.getText() + B3.getText();
					displayScreen.setText(enteredNumber);
				}
				
			}
			
		});
		B3.setBounds(130, 178, 50, 50);
		panel.add(B3);
		B3.setBackground(Color.darkGray);
		B3.setForeground(Color.WHITE);
		B3.getColorModel();

		B4 = new JButton("4");
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String	enteredNumber = displayScreen.getText();
				
				if(enteredNumber =="") {
					
					displayScreen.setText(B4.getText());
				}
				else {
					if (displayScreen.getText().equals("0")) {
						displayScreen.setText("");
					}
					enteredNumber = displayScreen.getText() + B4.getText();
					displayScreen.setText(enteredNumber);
				}
			}
		});
		B4.setBounds(10, 123, 50, 50);
		B4.setBackground(Color.darkGray);
		B4.setForeground(Color.WHITE);
		panel.add(B4);
		
		B5 = new JButton("5");
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String	enteredNumber = displayScreen.getText();
				
				if(enteredNumber =="") {
					
					displayScreen.setText(B5.getText());
				}
				else {
					if (displayScreen.getText().equals("0")) {
						displayScreen.setText("");
					}
					enteredNumber = displayScreen.getText() + B5.getText();
					displayScreen.setText(enteredNumber);
				}
			}
		});
		B5.setBounds(70, 123, 50, 50);
		B5.setBackground(Color.darkGray);
		B5.setForeground(Color.WHITE);
		panel.add(B5);
		
		
		B6 = new JButton("6");
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String	enteredNumber = displayScreen.getText();
				
				if(enteredNumber =="") {
					
					displayScreen.setText(B6.getText());
				}
				else {
					if (displayScreen.getText().equals("0")) {
						displayScreen.setText("");
					}
					enteredNumber = displayScreen.getText() + B6.getText();
					displayScreen.setText(enteredNumber);
				}
			}
		});
		B6.setBounds(130, 123, 50, 50);
		B6.setBackground(Color.darkGray);
		B6.setForeground(Color.WHITE);
		panel.add(B6);
		
		B7 = new JButton("7");
		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String	enteredNumber = displayScreen.getText();
				
				if(enteredNumber =="") {
					
					displayScreen.setText(B7.getText());
				}
				else {
					if (displayScreen.getText().equals("0")) {
						displayScreen.setText("");
					}
					enteredNumber = displayScreen.getText() + B7.getText();
					displayScreen.setText(enteredNumber);
				}
			}
		});
		B7.setForeground(Color.WHITE);
		B7.setBackground(Color.DARK_GRAY);
		B7.setBounds(10, 67, 50, 50);
		panel.add(B7);
		
		B8 = new JButton("8");
		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String	enteredNumber = displayScreen.getText();
				
				if(enteredNumber =="") {
					
					displayScreen.setText(B8.getText());
				}
				else {
					if (displayScreen.getText().equals("0")) {
						displayScreen.setText("");
					}
					enteredNumber = displayScreen.getText() + B8.getText();
					displayScreen.setText(enteredNumber);
				}
			}
		});
		B8 .setForeground(Color.WHITE);
		B8 .setBackground(Color.DARK_GRAY);
		B8 .setBounds(70, 67, 50, 50);
		panel.add(B8);
		
		B9 = new JButton("9");
		B9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String	enteredNumber = displayScreen.getText();
				
				if(enteredNumber =="") {
					
					displayScreen.setText(B9.getText());
				}
				else {
					if (displayScreen.getText().equals("0")) {
						displayScreen.setText("");
					}
					enteredNumber = displayScreen.getText() + B9.getText();
					displayScreen.setText(enteredNumber);
				}
			}
		});
		B9.setForeground(Color.WHITE);
		B9.setBackground(Color.DARK_GRAY);
		B9.setBounds(130, 67, 50, 50);
		panel.add(B9);
		
		BC = new JButton("0");
		BC.setForeground(Color.WHITE);
		BC.setBackground(Color.DARK_GRAY);
		BC.setBounds(10, 9, 50, 50);
		panel.add(BC);
		BC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String	enteredNumber = displayScreen.getText();
				
				if(enteredNumber =="") {
					
					displayScreen.setText(BC.getText());
				}
				else {
					if (displayScreen.getText().equals("0")) {
						displayScreen.setText("");
					}
					enteredNumber = displayScreen.getText() + BC.getText();
					displayScreen.setText(enteredNumber);
				
			}
			}
			
		});
		
		B8_1 = new JButton("+/-");
		B8_1.setForeground(Color.DARK_GRAY);
		B8_1.setBackground(Color.LIGHT_GRAY);
		B8_1.setBounds(70, 9, 50, 50);
		panel.add(B8_1);
		
		Bpercent = new JButton("%");
		Bpercent.setForeground(Color.DARK_GRAY);
		Bpercent.setBackground(Color.LIGHT_GRAY);
		Bpercent.setBounds(130, 9, 50, 50);
		panel.add(Bpercent);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBounds(192, 69, 76, 234);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		//Adding Operators
		Bequals = new JButton("=");
		Bequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String finalOutPut;
				num2 = Double.parseDouble(displayScreen.getText());
				if(operators =="/") {
					result = num1 / num2;
					finalOutPut = String.format("%.2f", result);
					displayScreen.setText(finalOutPut);
					
				} else if(operators =="*") {
					
					result = num1 * num2;
					finalOutPut = String.format("%.2f", result);
					displayScreen.setText(finalOutPut);
					
				}
				else if(operators =="-") {
					result = num1 - num2;
					finalOutPut = String.format("%.2f", result);
					displayScreen.setText(finalOutPut);
					
				}
				else if(operators =="+") {
					result = num1 + num2;
					finalOutPut = String.format("%.2f", result);
					displayScreen.setText(finalOutPut);
					
				}
				
				
			}
		});
		Bequals.setBounds(6, 157, 64, 71);
		Bequals.setBackground(Color.orange);
		panel_1.add(Bequals);
		
		Add = new JButton("+");
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(displayScreen.getText());
				displayScreen.setText("+");
				
				operators="+";
				
			}
		});
		Add.setBounds(6, 120, 64, 37);
		Add.setBackground(Color.orange);
		panel_1.add(Add);
		
		sub = new JButton("-"); 
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(displayScreen.getText());
				displayScreen.setText("-");
				displayScreen.setText("");
				operators="-";
			}
		});
		sub.setBounds(6, 82, 64, 37);
		sub.setBackground(Color.orange);
		panel_1.add(sub);
		
		mult = new JButton("*");
		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(displayScreen.getText());
				displayScreen.setText("");
				operators="*";
			}
		});
		mult.setBounds(6, 45, 64, 37);
		mult.setBackground(Color.orange);
		panel_1.add(mult);
		
		div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(displayScreen.getText());
				displayScreen.setText("");
				operators="/";
			}
		});
		div.setBackground(Color.orange);
		div.setBounds(6, 8, 64, 37);
		panel_1.add(div);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.controlHighlight);
		panel_3.setBounds(196, 14, 72, 57);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		BAC= new JButton("AC");
		BAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 displayScreen.setText("0");

				
			}
		});
		BAC.setBounds(0, 0, 72, 51);
		panel_3.add(BAC);
		
		panel_2 = new JPanel();
		panel_2.setBounds(8, 11, 184, 50);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		displayScreen = new JTextField();
		displayScreen.setBounds(6, 5, 176, 42);
		panel_2.add(displayScreen);
		displayScreen.setColumns(10);
		displayScreen.setEditable(false);
	}
}
