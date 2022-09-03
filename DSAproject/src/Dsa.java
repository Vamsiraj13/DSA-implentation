import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dsa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dsa frame = new Dsa();
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
	public Dsa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.CYAN);
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose a Data Structure");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel.setBounds(94, 10, 238, 26);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Array");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Array().setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(44, 63, 105, 26);
		contentPane.add(btnNewButton);
		
		JButton btnStack = new JButton("Stack");
		btnStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Stack().setVisible(true);
			}
		});
		btnStack.setForeground(Color.BLUE);
		btnStack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnStack.setBounds(159, 63, 105, 26);
		contentPane.add(btnStack);
		
		JButton btnQueue = new JButton("Queue");
		btnQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Queue().setVisible(true);
			}
		});
		btnQueue.setForeground(Color.BLUE);
		btnQueue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnQueue.setBounds(274, 63, 105, 26);
		contentPane.add(btnQueue);
		
		JButton btnCircularQueue = new JButton("Circular Queue");
		btnCircularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CQueue().setVisible(true);
			}
		});
		btnCircularQueue.setForeground(Color.BLUE);
		btnCircularQueue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCircularQueue.setBounds(135, 113, 179, 33);
		contentPane.add(btnCircularQueue);
		
		JButton btnLinkedList = new JButton("Linked List");
		btnLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LinkedList().setVisible(true);
			}
		});
		btnLinkedList.setForeground(Color.BLUE);
		btnLinkedList.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLinkedList.setBounds(27, 172, 158, 33);
		contentPane.add(btnLinkedList);
		
		JButton btnDoublyLinkedList = new JButton("Doubly Linked List");
		btnDoublyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DLinkedList().setVisible(true);
			}
		});
		btnDoublyLinkedList.setForeground(Color.BLUE);
		btnDoublyLinkedList.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDoublyLinkedList.setBounds(206, 172, 207, 33);
		contentPane.add(btnDoublyLinkedList);
	}
}
