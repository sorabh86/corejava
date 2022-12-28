package com.github.sorabh86.swing.wordcount;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class WordCountTool extends JFrame {

	private JPanel wordCountPanel;
	private JTextField totalWordTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordCountTool frame = new WordCountTool();
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
	public WordCountTool() {
		setTitle("Word Count");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 409);
		wordCountPanel = new JPanel();
		wordCountPanel.setBackground(new Color(255, 250, 205));
		wordCountPanel.setForeground(new Color(0, 0, 0));
		wordCountPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(wordCountPanel);
		wordCountPanel.setLayout(null);
		
		JLabel wordLabel = new JLabel("Type your words");
		wordLabel.setFont(new Font("Verdana", Font.BOLD, 13));
		wordLabel.setBounds(10, 80, 133, 31);
		wordCountPanel.add(wordLabel);
		
		JTextArea wordTextArea = new JTextArea();
		wordTextArea.setBounds(151, 53, 258, 92);
		wordCountPanel.add(wordTextArea);
		// adding padding to textArea
		int padding = 10;
		wordTextArea.setBorder(BorderFactory.createCompoundBorder(
			wordTextArea.getBorder(), 
	        BorderFactory.createEmptyBorder(padding, padding, padding, padding)));
		
		JButton countBtn = new JButton("Count your words");
		countBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		countBtn.setFont(new Font("Verdana", Font.BOLD, 14));
		countBtn.setBounds(153, 167, 256, 40);
		wordCountPanel.add(countBtn);
		
		JLabel totalWordLabel = new JLabel("Total Words");
		totalWordLabel.setFont(new Font("Verdana", Font.BOLD, 13));
		totalWordLabel.setBounds(36, 246, 108, 31);
		wordCountPanel.add(totalWordLabel);
		
		totalWordTextField = new JTextField();
		totalWordTextField.setBounds(154, 248, 108, 31);
		wordCountPanel.add(totalWordTextField);
		totalWordTextField.setColumns(10);
		
		JButton clearBtn = new JButton("Clear");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wordTextArea.setText("");
				totalWordTextField.setText("");
			}
		});
		clearBtn.setFont(new Font("Verdana", Font.BOLD, 14));
		clearBtn.setBounds(64, 310, 108, 31);
		wordCountPanel.add(clearBtn);
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.setFont(new Font("Verdana", Font.BOLD, 14));
		exitBtn.setBounds(266, 310, 108, 31);
		wordCountPanel.add(exitBtn);
		exitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JLabel titleLabel = new JLabel("Word Count Tool");
		titleLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(21, 11, 390, 31);
		wordCountPanel.add(titleLabel);
		
	}
}
