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

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private int st[]; 
	private int top = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 412);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stack Data Structure");
		lblNewLabel.setForeground(new Color(138, 43, 226));
		lblNewLabel.setBackground(new Color(106, 90, 205));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(139, 22, 208, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the stack size");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(31, 76, 178, 22);
		contentPane.add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setBounds(234, 79, 113, 19);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JButton btnCreateStack = new JButton("Create Stack");
		btnCreateStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.valueOf(tf1.getText());
				st = new int[n];
				String message = "Stack of length " + n + " is created";
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		btnCreateStack.setForeground(Color.BLUE);
		btnCreateStack.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnCreateStack.setBounds(157, 122, 152, 27);
		contentPane.add(btnCreateStack);
		
		JLabel lblNewLabel_2 = new JLabel("Enter an element");
		lblNewLabel_2.setForeground(new Color(25, 25, 112));
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(49, 178, 132, 19);
		contentPane.add(lblNewLabel_2);
		
		tf2 = new JTextField();
		tf2.setBounds(213, 180, 134, 19);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		JButton btnPush = new JButton("Push");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n =Integer.valueOf(tf2.getText());
				if(top==st.length-1) {
					tf3.setText("Push not possible");
					String message = "Index out of bounds";
					JOptionPane.showMessageDialog(contentPane, message);
					}
					else {
						++top;
						st[top]=n;
						String message = "Element " + n + " is pushed";
						JOptionPane.showMessageDialog(contentPane, message);
					}
				
				tf2.setText("");
			}
		});
		btnPush.setForeground(Color.BLUE);
		btnPush.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnPush.setBounds(139, 212, 85, 37);
		contentPane.add(btnPush);
		
		JButton btnPop = new JButton("Pop");
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top==-1) {
					tf3.setText("Pop not possible");
					String message = "Stack is empty";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else {
					st[top] =0;
					--top;
					String message = "Successfully popped the element";
					JOptionPane.showMessageDialog(contentPane, message);
				}
			}
		});
		btnPop.setForeground(Color.BLUE);
		btnPop.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnPop.setBounds(241, 212, 68, 37);
		contentPane.add(btnPop);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = "";
				for(int i=0; i<st.length; i++) {
					message = message + st[i] + " ";
				}
				tf3.setText(message);
			}
		});
		btnDisplay.setForeground(Color.BLUE);
		btnDisplay.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDisplay.setBounds(172, 269, 113, 27);
		contentPane.add(btnDisplay);
		
		tf3 = new JTextField();
		tf3.setBounds(139, 322, 178, 19);
		contentPane.add(tf3);
		tf3.setColumns(10);
	}
}
