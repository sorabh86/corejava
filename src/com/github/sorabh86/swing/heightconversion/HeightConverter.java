package com.github.sorabh86.swing.heightconversion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class HeightConverter extends JFrame {

	private JPanel contentPane;
	private JTextField ftTxtField;
	private JTextField inTxtField;
	private JTextField cmTxtField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeightConverter frame = new HeightConverter();
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
	public HeightConverter() {
		setTitle("Height Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 479);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ftLabel = new JLabel("Feet");
		ftLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		ftLabel.setBounds(39, 54, 119, 31);
		contentPane.add(ftLabel);
		
		ftTxtField = new JTextField();
		ftTxtField.setBounds(206, 56, 302, 29);
		contentPane.add(ftTxtField);
		ftTxtField.setColumns(10);
		
		JLabel lnLabel = new JLabel("Inches");
		lnLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lnLabel.setBounds(39, 112, 119, 32);
		contentPane.add(lnLabel);
		
		inTxtField = new JTextField();
		inTxtField.setColumns(10);
		inTxtField.setBounds(206, 114, 302, 30);
		contentPane.add(inTxtField);
		
		JButton convertBtn = new JButton("Convert To");
		convertBtn.setForeground(SystemColor.control);
		convertBtn.setBackground(new Color(0, 153, 204));
		convertBtn.setFont(new Font("Verdana", Font.BOLD, 16));
		convertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double feet, inches, centimetres;
				
				try {
					feet=Double.parseDouble(ftTxtField.getText());
					inches=Double.parseDouble(inTxtField.getText());
					
					centimetres = (feet*12+inches) * 2.54;
					cmTxtField.setText(String.valueOf(centimetres));
				} catch(Exception exc) {
					System.out.println("Empty Field");
				}
			}
		});
		convertBtn.setBounds(39, 183, 469, 37);
		contentPane.add(convertBtn);
		
		JLabel cmLabel = new JLabel("Centimetres");
		cmLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		cmLabel.setBounds(39, 279, 119, 27);
		contentPane.add(cmLabel);
		
		cmTxtField = new JTextField();
		cmTxtField.setBounds(206, 279, 302, 29);
		contentPane.add(cmTxtField);
		cmTxtField.setColumns(10);
		
		JButton clearBtn = new JButton("Clear");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ftTxtField.setText("");
				cmTxtField.setText("");
				inTxtField.setText("");
			}
		});
		clearBtn.setFont(new Font("Verdana", Font.BOLD, 16));
		clearBtn.setBounds(88, 351, 119, 35);
		contentPane.add(clearBtn);
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitBtn.setFont(new Font("Verdana", Font.BOLD, 16));
		exitBtn.setBounds(353, 351, 116, 35);
		contentPane.add(exitBtn);
	}
}
