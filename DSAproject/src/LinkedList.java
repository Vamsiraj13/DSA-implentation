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

public class LinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	
	public class Node{
		private int data;
		private Node link;
	}
	private Node first;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinkedList frame = new LinkedList();
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
	public LinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 393);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLinkedList = new JLabel("Linked List");
		lblLinkedList.setForeground(new Color(138, 43, 226));
		lblLinkedList.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblLinkedList.setBackground(new Color(106, 90, 205));
		lblLinkedList.setBounds(164, 24, 122, 27);
		contentPane.add(lblLinkedList);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the element");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(22, 84, 141, 22);
		contentPane.add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setBounds(181, 86, 96, 23);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter the element");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(22, 133, 141, 22);
		contentPane.add(lblNewLabel_1_1);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(181, 132, 96, 23);
		contentPane.add(tf2);
		
		JButton btnInsertRear = new JButton("Insert Rear");
		btnInsertRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node newnode = new Node();
				int ele = Integer.valueOf(tf1.getText());
				newnode.data = ele;
				newnode.link = null;
				if(first==null) {
					first=newnode;
				}
				else {
					Node temp=first;
					while(temp.link!=null) {
						temp=temp.link;
					}
					temp.link=newnode;
				}
				String message = "Successfully inserted!";
				JOptionPane.showMessageDialog(contentPane, message);
				tf2.setText("");
			}
		});
		btnInsertRear.setForeground(Color.BLUE);
		btnInsertRear.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnInsertRear.setBounds(307, 80, 135, 31);
		contentPane.add(btnInsertRear);
		
		JButton btnInsertFront = new JButton("Insert Front");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node newnode = new Node();
				int ele = Integer.valueOf(tf2.getText());
				newnode.data = ele;
				newnode.link = null;
				if(first==null) {
					first=newnode;
				}
				else {
					newnode.link=first;
					first=newnode;
				}
				String message = "Successfully inserted!";
				JOptionPane.showMessageDialog(contentPane, message);
				tf1.setText("");
			}
		});
		btnInsertFront.setForeground(Color.BLUE);
		btnInsertFront.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnInsertFront.setBounds(307, 124, 141, 31);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("Delete Rear");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null) {
					tf3.setText("Delete is not possible!");
					String message = "There are no nodes!";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else if(first.link==null) {
					first = null;
					String message = "Successfully deleted!";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else {
					Node temp=first;
					while(temp.link.link!=null) {
						temp=temp.link;
					}
					temp.link = null;
					
				}
			}
		});
		btnDeleteRear.setForeground(Color.BLUE);
		btnDeleteRear.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDeleteRear.setBounds(72, 195, 141, 31);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("Delete Front");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null) {
					tf3.setText("Delete not possible");
					String message = "There are no nodes!";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else if(first.link==null) {
					first = null;
					String message = "Successfully deleted!";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else {
					first = first.link;
				}
			}
		});
		btnDeleteFront.setForeground(Color.BLUE);
		btnDeleteFront.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDeleteFront.setBounds(230, 195, 152, 31);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null) {
					tf3.setText("Display not possible");
					String message = "There are no nodes!";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else if(first.link==null) {
					tf3.setText(String.valueOf(first.data));
				}
				else {
					Node temp=first;
					String message = "";
					while(temp!=null) {
						message = message + temp.data + " ";
						temp=temp.link;
					}
					tf3.setText(message);
				}
			}
		});
		btnDisplay.setForeground(Color.BLUE);
		btnDisplay.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDisplay.setBounds(164, 241, 113, 27);
		contentPane.add(btnDisplay);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(80, 297, 289, 23);
		contentPane.add(tf3);
	}
}
