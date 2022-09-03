import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CQueue extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private int cq[];
	private int r=-1;
	private int f;
	private int count;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CQueue frame = new CQueue();
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
	public CQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 382);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCircularQueue = new JLabel("Circular Queue");
		lblCircularQueue.setForeground(new Color(138, 43, 226));
		lblCircularQueue.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCircularQueue.setBackground(new Color(106, 90, 205));
		lblCircularQueue.setBounds(127, 23, 150, 25);
		contentPane.add(lblCircularQueue);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the queue size");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(26, 72, 165, 22);
		contentPane.add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(204, 76, 113, 19);
		contentPane.add(tf1);
		
		JButton btnCreateQueue = new JButton("Create Queue");
		btnCreateQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.valueOf(tf1.getText());
				cq = new int[n];
				String message = "Circular Queue created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnCreateQueue.setForeground(Color.BLUE);
		btnCreateQueue.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnCreateQueue.setBounds(105, 116, 152, 27);
		contentPane.add(btnCreateQueue);
		
		JLabel lblNewLabel_2 = new JLabel("Enter an element");
		lblNewLabel_2.setForeground(new Color(25, 25, 112));
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(41, 163, 132, 19);
		contentPane.add(lblNewLabel_2);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(183, 165, 134, 19);
		contentPane.add(tf2);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.valueOf(tf2.getText());
				if(count==cq.length) {
					tf3.setText("Insert not possible");
					String message = "Queue is full";
					JOptionPane.showMessageDialog(contentPane, message);
					}
					else {
						r = (r+1)%cq.length;
						cq[r]=x;
						++count;
						String message = "Successfully inserted";
						JOptionPane.showMessageDialog(contentPane, message);
					}
				tf2.setText("");
				tf3.setText("");
			}
		});
		btnInsert.setForeground(Color.BLUE);
		btnInsert.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnInsert.setBounds(65, 202, 122, 37);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==0) {
					tf3.setText("Delete not possible");
					String message = "Queue is empty";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else {
					cq[f]=0;
					f = (f+1)%cq.length;
					--count;
					String message = "Successfully Deleted";
					JOptionPane.showMessageDialog(contentPane, message);
				}
			}
		});
		btnDelete.setForeground(Color.BLUE);
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDelete.setBounds(204, 202, 113, 37);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==0) {
					tf3.setText("Display not possible");
					String message = "Queue is empty";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else {
				String message = "";
				for(int i=0; i<=r; i++) {
					message = message + cq[i] + " ";
					}
				tf3.setText(message);
				}
			}
			
		});
		btnDisplay.setForeground(Color.BLUE);
		btnDisplay.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDisplay.setBounds(133, 258, 113, 27);
		contentPane.add(btnDisplay);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(65, 295, 252, 19);
		contentPane.add(tf3);
	}
}
