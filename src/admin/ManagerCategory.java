package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import User.Login;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class ManagerCategory extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTable table;
	private JLabel lblNewLabel_8;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerCategory frame = new ManagerCategory();
					frame.setUndecorated(true);
					frame.dispose();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
int xx,xy;
	/**
	 * Create the frame.
	 */
	public ManagerCategory() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
dispose();
				
			}
			@Override
			public void windowOpened(WindowEvent e) {
				for(double i=0.1;i<=1.0;i+=0.1) {
					String s=""+i;
					float f=Float.parseFloat(s);
					try {
						Thread.sleep(40);
					}catch(InterruptedException ex) {
						Logger.getLogger(ManagerCategory.class.getName()).log(Level.SEVERE, null,ex);
					}
				}
			}
		});
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784
				, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x=e.getXOnScreen();
				int y=e.getYOnScreen();
				this.setLocation(x-xx,y-xy);
			}

			private void setLocation(int i, int j) {
				// TODO Auto-generated method stub
				
			}
		});
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx=e.getX();
				xy=e.getY();
			}
		});
		panel.setBackground(new Color(51, 153, 204));
		panel.setBounds(0, 0, 1130, 433);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(22, 84, 230, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(22, 131, 230, 27);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(22, 187, 230, 27);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Category ID");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(22, 63, 100, 14);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Category Name");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(22, 114, 130, 14);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Description");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(22, 171, 77, 14);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setBackground(new Color(0, 102, 204));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(163, 239, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setBackground(new Color(0, 102, 204));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(22, 287, 89, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\kinh-nghiem-mo-shop-quan-ao (Custom) (2).png"));
		lblNewLabel.setBounds(3, -1, 46, 41);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1_1 = new JButton("Clear");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1_1.setBackground(new Color(0, 102, 204));
		btnNewButton_1_1.setBounds(163, 287, 89, 23);
		panel.add(btnNewButton_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(320, 63, 440, 293);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Category ID", "Category Name", "Description"
			}
		));
		scrollPane.setViewportView(table);
		
		lblNewLabel_8 = new JLabel("Search");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_8.setBounds(333, 22, 76, 20);
		panel.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(419, 21, 327, 27);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_1_2 = new JButton("Save");
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1_2.setBackground(new Color(0, 102, 204));
		btnNewButton_1_2.setBounds(22, 240, 89, 23);
		panel.add(btnNewButton_1_2);
		
		
		
		
	}
}
