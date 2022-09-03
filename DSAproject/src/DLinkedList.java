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

public class DLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

	public class Node{
		private Node prevlink;
		private int data;
		private Node nextlink;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DLinkedList frame = new DLinkedList();
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
	public DLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoublyLinkedList = new JLabel("Doubly Linked List");
		lblDoublyLinkedList.setForeground(new Color(138, 43, 226));
		lblDoublyLinkedList.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblDoublyLinkedList.setBackground(new Color(224, 255, 255));
		lblDoublyLinkedList.setBounds(118, 23, 206, 27);
		contentPane.add(lblDoublyLinkedList);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the element");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(26, 81, 141, 22);
		contentPane.add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(193, 81, 96, 23);
		contentPane.add(tf1);
		
		JButton btnInsertRear = new JButton("Insert Rear");
		btnInsertRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node newnode = new Node();
				int ele = Integer.valueOf(tf1.getText());
				newnode.data = ele;
				newnode.nextlink =null;
				newnode.prevlink =null;
				if(first==null) {
					first=newnode;
					
				}
				else {
				Node temp=first;
				while(temp.nextlink!=null) {
					temp=temp.nextlink;
				}
				temp.nextlink = newnode;
				newnode.prevlink= temp;
			}
				String message = "Successfully inserted!";
				JOptionPane.showMessageDialog(contentPane, message);
				tf1.setText("");
				
			}
		});
		btnInsertRear.setForeground(Color.BLUE);
		btnInsertRear.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnInsertRear.setBounds(318, 75, 135, 31);
		contentPane.add(btnInsertRear);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter the element");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(26, 129, 141, 22);
		contentPane.add(lblNewLabel_1_1);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(193, 128, 96, 23);
		contentPane.add(tf2);
		
		JButton btnInsertFront = new JButton("Insert Front");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node newnode = new Node();
				int ele = Integer.valueOf(tf2.getText());
				newnode.data = ele;
				newnode.nextlink =null;
				newnode.prevlink =null;
				if(first==null) {
					first=newnode;
					
				}
				else {
					newnode.nextlink=first;
					first.prevlink = newnode;
					first = newnode;
				
				}
				String message = "Successfully inserted!";
				JOptionPane.showMessageDialog(contentPane, message);
				tf2.setText("");
			}
		});
		btnInsertFront.setForeground(Color.BLUE);
		btnInsertFront.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnInsertFront.setBounds(318, 123, 141, 31);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("Delete Rear");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null) {
					tf3.setText("Delete not possible");
					String message = "There are no nodes!";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else if(first.nextlink==null) {
					first = null;
					String message = "Successfully Deleted!";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else {
					Node temp=first;
					while(temp.nextlink.nextlink!=null) {
						temp=temp.nextlink;
					}
					temp.nextlink = null;
					String message = "Successfully Deleted!";
					JOptionPane.showMessageDialog(contentPane, message);
				}
			}
		});
		btnDeleteRear.setForeground(Color.BLUE);
		btnDeleteRear.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDeleteRear.setBounds(69, 192, 141, 31);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("Delete Front");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null) {
					tf3.setText("Delete not possible");
					String message = "There are no nodes!";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else if(first.nextlink==null) {
					first = null;
					String message = "Successfully deleted!";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else {
					first = first.nextlink;
					first.prevlink=null;
					String message = "Successfully deleted!";
					JOptionPane.showMessageDialog(contentPane, message);
			}
		}
		});
		btnDeleteFront.setForeground(Color.BLUE);
		btnDeleteFront.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDeleteFront.setBounds(237, 192, 152, 31);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplayForward = new JButton("Display Forward");
		btnDisplayForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null) {
					tf3.setText("Display not possible");
					String message = "There are no nodes!";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else if(first.nextlink==null) {
					tf3.setText(String.valueOf(first.data));
				}
				else {
					Node temp=first;
					String message = "";
					while(temp!=null) {
						message = message + temp.data + " ";
						temp=temp.nextlink;
					}
					tf3.setText(message);
			}
			}});
		btnDisplayForward.setForeground(Color.BLUE);
		btnDisplayForward.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDisplayForward.setBounds(37, 255, 182, 31);
		contentPane.add(btnDisplayForward);
		
		JButton btnDisplayReverse = new JButton("Display Reverse");
		btnDisplayReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null) {
					tf3.setText("Display not possible");
					String message = "There are no nodes!";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else if(first.nextlink==null) {
					tf3.setText(String.valueOf(first.data));
				}
				else {
					Node temp=first;
					String message = "";
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					while(temp!=null) {
						message = message + temp.data + " ";
						temp = temp.prevlink;
					}
					tf3.setText(message);
			}
		}} );
		btnDisplayReverse.setForeground(Color.BLUE);
		btnDisplayReverse.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDisplayReverse.setBounds(237, 255, 186, 31);
		contentPane.add(btnDisplayReverse);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(69, 326, 320, 23);
		contentPane.add(tf3);
	}

}
