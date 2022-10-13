package com.github.sorabh86.swing.basic;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Basic {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Basic window = new Basic();
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
	public Basic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 666, 572);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("Click Me");
		button1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Welcome to Java Swing");
			}
		});
		button1.setBounds(22, 336, 253, 36);
		frame.getContentPane().add(button1);
		
		JLabel lblNewLabel = new JLabel("JAVA SWING GUI");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(315, 22, 236, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(330, 80, 207, 36);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("First Application");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(21, 22, 253, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(330, 138, 207, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Gender");
		chckbxNewCheckBox.setBounds(330, 236, 207, 27);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(330, 285, 207, 27);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(330, 187, 207, 27);
		frame.getContentPane().add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(300, 17, 4, 500);
		frame.getContentPane().add(separator);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(330, 334, 207, 60);
		frame.getContentPane().add(textArea);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(25, 91, 253, 27);
		frame.getContentPane().add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(22, 198, 253, 45);
		frame.getContentPane().add(editorPane_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(22, 276, 253, 27);
		frame.getContentPane().add(spinner);
		
		createJList();
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(22, 151, 253, 14);
		frame.getContentPane().add(progressBar);
		
		createJTable();
		
		frame.getContentPane().add(table);
		
		JSlider slider = new JSlider();
		slider.setBounds(23, 491, 252, 20);
		frame.getContentPane().add(slider);
	}

	private void createJTable() {
		String data[][]={ {"101","Amit","670000"},    
                  {"102","Jai","780000"},    
                  {"101","Sachin","700000"}};    
	  	String column[]={"ID","NAME","SALARY"};         
		
		table = new JTable(data, column);
		table.setBounds(319, 417, 304, 94);
	}

	private void createJList() {
		String data[] = {"Assumenda","Voluptatibus","Necessitatibus"};
		
		JList<String> list = new JList<>(data);
		list.setBounds(22, 383, 253, 86);
		frame.getContentPane().add(list);
		
	}
}
