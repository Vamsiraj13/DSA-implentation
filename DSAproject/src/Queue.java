import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {
	private int q[];
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private int r=-1;
	private int f;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 382);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQueueDataStructure = new JLabel("Queue Data Structure");
		lblQueueDataStructure.setForeground(new Color(138, 43, 226));
		lblQueueDataStructure.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQueueDataStructure.setBackground(new Color(106, 90, 205));
		lblQueueDataStructure.setBounds(97, 20, 218, 25);
		contentPane.add(lblQueueDataStructure);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the queue size");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(28, 66, 178, 22);
		contentPane.add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(202, 70, 113, 19);
		contentPane.add(tf1);
		
		JButton btnCreateQueue = new JButton("Create Queue");
		btnCreateQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.valueOf(tf1.getText());
				q = new int[n];
				String message = "Queue of length " + n + " is created";
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		btnCreateQueue.setForeground(Color.BLUE);
		btnCreateQueue.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnCreateQueue.setBounds(121, 104, 152, 27);
		contentPane.add(btnCreateQueue);
		
		JLabel lblNewLabel_2 = new JLabel("Enter an element");
		lblNewLabel_2.setForeground(new Color(25, 25, 112));
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(28, 153, 132, 19);
		contentPane.add(lblNewLabel_2);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(181, 155, 134, 19);
		contentPane.add(tf2);
		
		JButton btnEnqueue = new JButton("Enqueue");
		btnEnqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n =Integer.valueOf(tf2.getText());
				if(r==q.length-1) {
					tf3.setText("Queue is full");
					String message = "Index out of bounds";
					JOptionPane.showMessageDialog(contentPane, message);
					}
					else {
						++r;
						q[r]=n;
						String message = "Element " + n + " is enqueued";
						JOptionPane.showMessageDialog(contentPane, message);
					}
				
				tf2.setText("");
			}
		});
		btnEnqueue.setForeground(Color.BLUE);
		btnEnqueue.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnEnqueue.setBounds(75, 193, 122, 37);
		contentPane.add(btnEnqueue);
		
		JButton btnDequeue = new JButton("Dequeue");
		btnDequeue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f>r || r==-1) {
					tf3.setText("Queue is empty");
					String message = "Queue is empty";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else {
					q[f] =0;
					++f;
					String message = "Successfully dequeued";
					JOptionPane.showMessageDialog(contentPane, message);
				}
			}
		});
		btnDequeue.setForeground(Color.BLUE);
		btnDequeue.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDequeue.setBounds(218, 193, 113, 37);
		contentPane.add(btnDequeue);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(r==-1 || f>r) {
					tf3.setText("Display is not possible");
					String message = "Queue is empty";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else {
				String message = "";
				for(int i=0; i<=r; i++) {
					message = message + q[i] + " ";
					}
				tf3.setText(message);;
				}
			}
		});
		btnDisplay.setForeground(Color.BLUE);
		btnDisplay.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDisplay.setBounds(150, 240, 113, 27);
		contentPane.add(btnDisplay);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(121, 291, 178, 19);
		contentPane.add(tf3);
	}
}
