package com.github.sorabh86.swing.calculator;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Calculator  extends JFrame {
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		setTitle("Calculator");
		setBounds(100, 100, 447, 620);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Java Calculator");
		lblNewLabel.setBounds(10, 11, 411, 41);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setLocation(37, 63);
		textField.setSize(357, 41);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 123, 411, 448);
		getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JButton clearBtn = new JButton("C");
		sl_panel.putConstraint(SpringLayout.NORTH, clearBtn, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, clearBtn, -123, SpringLayout.EAST, panel);
		clearBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(clearBtn);
		
		JButton divideBtn = new JButton("÷");
		sl_panel.putConstraint(SpringLayout.NORTH, divideBtn, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, divideBtn, 325, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, divideBtn, -24, SpringLayout.EAST, panel);
		divideBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(divideBtn);
		
		JButton oneBtn = new JButton("1");
		sl_panel.putConstraint(SpringLayout.WEST, clearBtn, 0, SpringLayout.WEST, oneBtn);
		sl_panel.putConstraint(SpringLayout.NORTH, oneBtn, 106, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, oneBtn, 25, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, oneBtn, -284, SpringLayout.SOUTH, panel);
		oneBtn.setPreferredSize(new Dimension(40, 40));
		oneBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		oneBtn.setAlignmentY(0.0f);
		panel.add(oneBtn);
		
		JButton twoBtn = new JButton("2");
		sl_panel.putConstraint(SpringLayout.WEST, twoBtn, 126, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, twoBtn, -223, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, oneBtn, -39, SpringLayout.WEST, twoBtn);
		sl_panel.putConstraint(SpringLayout.NORTH, twoBtn, 0, SpringLayout.NORTH, oneBtn);
		sl_panel.putConstraint(SpringLayout.SOUTH, twoBtn, 0, SpringLayout.SOUTH, oneBtn);
		twoBtn.setPreferredSize(new Dimension(40, 40));
		twoBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		twoBtn.setAlignmentY(0.0f);
		panel.add(twoBtn);
		
		JButton threeBtn = new JButton("3");
		sl_panel.putConstraint(SpringLayout.WEST, threeBtn, 226, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, threeBtn, -123, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, clearBtn, -34, SpringLayout.NORTH, threeBtn);
		sl_panel.putConstraint(SpringLayout.NORTH, threeBtn, 0, SpringLayout.NORTH, oneBtn);
		sl_panel.putConstraint(SpringLayout.SOUTH, threeBtn, 0, SpringLayout.SOUTH, oneBtn);
		threeBtn.setPreferredSize(new Dimension(40, 40));
		threeBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		threeBtn.setAlignmentY(0.0f);
		panel.add(threeBtn);
		
		JButton multiplyBtn = new JButton("×");
		sl_panel.putConstraint(SpringLayout.WEST, multiplyBtn, 325, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, divideBtn, -34, SpringLayout.NORTH, multiplyBtn);
		sl_panel.putConstraint(SpringLayout.NORTH, multiplyBtn, 0, SpringLayout.NORTH, oneBtn);
		sl_panel.putConstraint(SpringLayout.SOUTH, multiplyBtn, 0, SpringLayout.SOUTH, oneBtn);
		sl_panel.putConstraint(SpringLayout.EAST, multiplyBtn, 0, SpringLayout.EAST, divideBtn);
		multiplyBtn.setPreferredSize(new Dimension(40, 40));
		multiplyBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		multiplyBtn.setAlignmentY(0.0f);
		panel.add(multiplyBtn);
		
		JButton fourBtn = new JButton("4");
		sl_panel.putConstraint(SpringLayout.NORTH, fourBtn, 202, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, fourBtn, 25, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, fourBtn, 96, SpringLayout.SOUTH, oneBtn);
		fourBtn.setPreferredSize(new Dimension(40, 40));
		fourBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fourBtn.setAlignmentY(0.0f);
		panel.add(fourBtn);
		
		JButton fiveBtn = new JButton("5");
		sl_panel.putConstraint(SpringLayout.WEST, fiveBtn, 126, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, fourBtn, -39, SpringLayout.WEST, fiveBtn);
		sl_panel.putConstraint(SpringLayout.NORTH, fiveBtn, 0, SpringLayout.NORTH, fourBtn);
		sl_panel.putConstraint(SpringLayout.SOUTH, fiveBtn, 0, SpringLayout.SOUTH, fourBtn);
		fiveBtn.setPreferredSize(new Dimension(40, 40));
		fiveBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fiveBtn.setAlignmentY(0.0f);
		panel.add(fiveBtn);
		
		JButton sixBtn = new JButton("6");
		sl_panel.putConstraint(SpringLayout.WEST, sixBtn, 226, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, fiveBtn, -38, SpringLayout.WEST, sixBtn);
		sl_panel.putConstraint(SpringLayout.NORTH, sixBtn, 0, SpringLayout.NORTH, fourBtn);
		sl_panel.putConstraint(SpringLayout.SOUTH, sixBtn, 0, SpringLayout.SOUTH, fourBtn);
		sixBtn.setPreferredSize(new Dimension(40, 40));
		sixBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sixBtn.setAlignmentY(0.0f);
		panel.add(sixBtn);
		
		JButton minusBtn = new JButton("-");
		sl_panel.putConstraint(SpringLayout.EAST, sixBtn, -37, SpringLayout.WEST, minusBtn);
		sl_panel.putConstraint(SpringLayout.NORTH, minusBtn, 0, SpringLayout.NORTH, fourBtn);
		sl_panel.putConstraint(SpringLayout.WEST, minusBtn, 0, SpringLayout.WEST, divideBtn);
		sl_panel.putConstraint(SpringLayout.SOUTH, minusBtn, 0, SpringLayout.SOUTH, fourBtn);
		sl_panel.putConstraint(SpringLayout.EAST, minusBtn, 0, SpringLayout.EAST, divideBtn);
		minusBtn.setPreferredSize(new Dimension(40, 40));
		minusBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		minusBtn.setAlignmentY(0.0f);
		panel.add(minusBtn);
		
		JButton btnNewButton_2_2_2_1 = new JButton("0");
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_2_2_2_1, 0, SpringLayout.WEST, oneBtn);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_2_2_2_1, -10, SpringLayout.SOUTH, panel);
		btnNewButton_2_2_2_1.setPreferredSize(new Dimension(40, 40));
		btnNewButton_2_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_2_2_1.setAlignmentY(0.0f);
		panel.add(btnNewButton_2_2_2_1);
		
		JButton btnNewButton_2_2_2_1_1 = new JButton(".");
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_2_2_2_1_1, 226, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_2_2_2_1_1, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_2_2_2_1, -38, SpringLayout.WEST, btnNewButton_2_2_2_1_1);
		btnNewButton_2_2_2_1_1.setPreferredSize(new Dimension(40, 40));
		btnNewButton_2_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_2_2_1_1.setAlignmentY(0.0f);
		panel.add(btnNewButton_2_2_2_1_1);
		
		JButton btnNewButton_2_2_2_1_1_1 = new JButton("=");
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_2_2_2_1_1, -37, SpringLayout.WEST, btnNewButton_2_2_2_1_1_1);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_2_2_2_1_1_1, 0, SpringLayout.WEST, divideBtn);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_2_2_2_1_1_1, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_2_2_2_1_1_1, 0, SpringLayout.EAST, divideBtn);
		btnNewButton_2_2_2_1_1_1.setPreferredSize(new Dimension(40, 40));
		btnNewButton_2_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_2_2_1_1_1.setAlignmentY(0.0f);
		panel.add(btnNewButton_2_2_2_1_1_1);
		
		JButton btnNewButton_2_2_3 = new JButton("7");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_2_2_3, 28, SpringLayout.SOUTH, fourBtn);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_2_2_3, 25, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_2_2_3, -98, SpringLayout.SOUTH, panel);
		btnNewButton_2_2_3.setPreferredSize(new Dimension(40, 40));
		btnNewButton_2_2_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_2_3.setAlignmentY(0.0f);
		panel.add(btnNewButton_2_2_3);
		
		JButton btnNewButton_2_2_3_1 = new JButton("8");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_2_2_2_1, 26, SpringLayout.SOUTH, btnNewButton_2_2_3_1);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_2_2_3_1, 126, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_2_2_3, -39, SpringLayout.WEST, btnNewButton_2_2_3_1);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_2_2_3_1, 0, SpringLayout.NORTH, btnNewButton_2_2_3);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_2_2_3_1, 0, SpringLayout.SOUTH, btnNewButton_2_2_3);
		btnNewButton_2_2_3_1.setPreferredSize(new Dimension(40, 40));
		btnNewButton_2_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_2_3_1.setAlignmentY(0.0f);
		panel.add(btnNewButton_2_2_3_1);
		
		JButton btnNewButton_2_2_3_1_1 = new JButton("9");
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_2_2_3_1_1, 226, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_2_2_2_1_1, 26, SpringLayout.SOUTH, btnNewButton_2_2_3_1_1);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_2_2_3_1, -38, SpringLayout.WEST, btnNewButton_2_2_3_1_1);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_2_2_3_1_1, -62, SpringLayout.SOUTH, btnNewButton_2_2_3);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_2_2_3_1_1, 0, SpringLayout.SOUTH, btnNewButton_2_2_3);
		btnNewButton_2_2_3_1_1.setPreferredSize(new Dimension(40, 40));
		btnNewButton_2_2_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_2_3_1_1.setAlignmentY(0.0f);
		panel.add(btnNewButton_2_2_3_1_1);
		
		JButton btnNewButton_2_2_3_1_1_1 = new JButton("+");
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_2_2_3_1_1, -37, SpringLayout.WEST, btnNewButton_2_2_3_1_1_1);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_2_2_2_1_1_1, 26, SpringLayout.SOUTH, btnNewButton_2_2_3_1_1_1);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_2_2_3_1_1_1, 0, SpringLayout.NORTH, btnNewButton_2_2_3);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_2_2_3_1_1_1, 0, SpringLayout.WEST, divideBtn);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_2_2_3_1_1_1, 0, SpringLayout.SOUTH, btnNewButton_2_2_3);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_2_2_3_1_1_1, 0, SpringLayout.EAST, divideBtn);
		btnNewButton_2_2_3_1_1_1.setPreferredSize(new Dimension(40, 40));
		btnNewButton_2_2_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_2_3_1_1_1.setAlignmentY(0.0f);
		panel.add(btnNewButton_2_2_3_1_1_1);
	}
}
