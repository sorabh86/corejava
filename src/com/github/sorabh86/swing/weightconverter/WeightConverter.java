package com.github.sorabh86.swing.weightconverter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class WeightConverter extends JFrame {
	
	private final double KILO2POUND = 2.2046226218;

	private JTextField kgTextField;
	private JTextField poundTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeightConverter frame = new WeightConverter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WeightConverter() {
		setTitle("Weight Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 314);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 240));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel titleLabel = new JLabel("Kilogram to Pound");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		titleLabel.setBounds(10, 11, 377, 27);
		panel.add(titleLabel);
		
		kgTextField = new JTextField();
		kgTextField.setFont(new Font("Tahoma", Font.BOLD, 18));
		kgTextField.setHorizontalAlignment(SwingConstants.CENTER);
		kgTextField.setBounds(53, 54, 203, 46);
		panel.add(kgTextField);
		kgTextField.setColumns(10);
		kgTextField.setBorder(BorderFactory.createCompoundBorder(
				kgTextField.getBorder(), 
		        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JButton convertBtn = new JButton("Convert To Pound");
		convertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double kilo, pound;
				kilo = Double.parseDouble(kgTextField.getText());
				pound = kilo * KILO2POUND;
//				poundTextField.setText(String.valueOf(pound));
				poundTextField.setText(new DecimalFormat("##.##").format(pound));
			}
		});
		convertBtn.setForeground(new Color(127, 255, 212));
		convertBtn.setBackground(new Color(25, 25, 112));
		convertBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		convertBtn.setBounds(110, 111, 203, 40);
		panel.add(convertBtn);
		
		poundTextField = new JTextField();
		poundTextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		poundTextField.setHorizontalAlignment(SwingConstants.CENTER);
		poundTextField.setBounds(88, 173, 129, 34);
		panel.add(poundTextField);
		poundTextField.setColumns(10);
		poundTextField.setBorder(BorderFactory.createCompoundBorder(
				poundTextField.getBorder(), 
		        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JButton clearBtn = new JButton("Clear");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kgTextField.setText("");
				poundTextField.setText("");
			}
		});
		clearBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		clearBtn.setBounds(37, 218, 100, 34);
		panel.add(clearBtn);
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitBtn.setForeground(new Color(255, 228, 225));
		exitBtn.setBackground(new Color(220, 20, 60));
		exitBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		exitBtn.setBounds(270, 218, 100, 34);
		panel.add(exitBtn);
		
		JLabel kgLabel = new JLabel("kg");
		kgLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		kgLabel.setBounds(267, 54, 46, 43);
		panel.add(kgLabel);
		
		JLabel poundLabel = new JLabel("Pound");
		poundLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		poundLabel.setBounds(227, 173, 86, 34);
		panel.add(poundLabel);

	}

}
