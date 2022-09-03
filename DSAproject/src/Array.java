import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 361);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 0, 0));
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Array Data Structure");
		lblNewLabel.setForeground(new Color(75, 0, 130));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(154, 10, 234, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the array size");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(70, 59, 178, 22);
		contentPane.add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setBounds(258, 63, 130, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JButton btnNewButton = new JButton("Create Array");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = tf1.getText();
				arr = new int[Integer.valueOf(n)];
				String message = "Array of length " + n + " is created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(179, 93, 152, 27);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Enter an element");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(28, 145, 119, 19);
		contentPane.add(lblNewLabel_2);
		
		tf2 = new JTextField();
		tf2.setBounds(157, 147, 49, 19);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Position");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(249, 145, 67, 19);
		contentPane.add(lblNewLabel_2_1);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(310, 147, 46, 19);
		contentPane.add(tf3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Delete the element at position");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(28, 182, 209, 19);
		contentPane.add(lblNewLabel_2_1_1);
		
		tf4 = new JTextField();
		tf4.setColumns(10);
		tf4.setBounds(249, 184, 46, 19);
		contentPane.add(tf4);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos = Integer.valueOf(tf4.getText());
				arr[pos] = 0;
				String message = "Element at index " + pos + " is deleted";
				JOptionPane.showMessageDialog(contentPane, message);
				tf4.setText("");
			}
		});
		btnDelete.setForeground(new Color(0, 0, 255));
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDelete.setBounds(320, 179, 96, 22);
		contentPane.add(btnDelete);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.setForeground(new Color(0, 0, 255));
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ele = Integer.valueOf(tf2.getText());
				int pos = Integer.valueOf(tf3.getText());
				arr[pos]=ele;
				String message = "Element " + ele + " is inserted at index " + pos + " in the array";
				JOptionPane.showMessageDialog(contentPane, message);
				tf2.setText("");
				tf3.setText("");
			}
		});
		btnInsert.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnInsert.setBounds(366, 139, 85, 27);
		contentPane.add(btnInsert);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = "";
				for(int i=0; i<arr.length; i++) {
					message = message + arr[i] + " ";
				}
				tf5.setText(message);
			}
		});
		btnDisplay.setForeground(new Color(0, 0, 255));
		btnDisplay.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDisplay.setBounds(203, 223, 113, 27);
		contentPane.add(btnDisplay);
		
		tf5 = new JTextField();
		tf5.setBounds(179, 271, 152, 19);
		contentPane.add(tf5);
		tf5.setColumns(10);
	}
}
