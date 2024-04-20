package User;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Supplier.SupperlierDasboard;
import admin.AdminDasboard;
import connection.MyConnection;

import java.awt.Color;
import java.awt.Component;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;


	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					//frame.setUndecorated(true);
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
	private ButtonGroup bg = new ButtonGroup();
	int xx,xy;
	public AbstractButton rdbtnNewRadioButton;
	public AbstractButton rdbtnNewRadioButton_1;
	public AbstractButton rdbtnNewRadioButton_2;
	public void init() {
		
		rdbtnNewRadioButton = new JRadioButton("User");
	    rdbtnNewRadioButton_1 = new JRadioButton("Supplier");
	    rdbtnNewRadioButton_2 = new JRadioButton("Admin");
		
		
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton.setSelected(true);
		
	}
	private boolean isEmpty() {
		if(textField_1.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this,"Email nay la bat buoc !","Warning",2 );
			return false;
		}if (!textField_1.getText().matches("^.+@.+\\..+$")) {
		    JOptionPane.showMessageDialog(this, "Email không hợp lệ !", "Warning", JOptionPane.WARNING_MESSAGE);
		    return false;
		}

		if(String.valueOf(passwordField.getPassword()).isEmpty()) {
			JOptionPane.showMessageDialog(this,"PassWord khong hop le !","Warning",2 );
		}if(String.valueOf(passwordField_1.getPassword()).isEmpty()) {
			JOptionPane.showMessageDialog(this,"PassWord khong hop le !","Warning",2 );
		}
		
		return true;
	}
	
public Login() {
	init();
	addWindowListener(new WindowAdapter() {
		@Override
		public void windowOpened(WindowEvent e) {
			for(double i=0.1;i<=1.0;i+=0.1) {
				String s=""+i;
				float f=Float.parseFloat(s);
				try {
					Thread.sleep(40);
				}catch(InterruptedException ex) {
					Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null,ex);
				}
			}
			
		}
	});
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 881, 469);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 204));
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
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 357, 438);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\anhmoi (Custom) (2).jpg"));
		lblNewLabel_5.setBounds(0, 0, 357, 438);
		panel.add(lblNewLabel_5);
		
		Button button = new Button("Login\r\n");
		button.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEmpty()) {
					String email = textField_1.getText();
					String password = String.valueOf(passwordField.getPassword());
					if(rdbtnNewRadioButton.isSelected()) {
						
						    
						
						try {Connection con = MyConnection.getConnection();
						PreparedStatement ps;
						
							ps = con.prepareStatement("select*from user where uemail =? and upassword=?  ");
							ps.setString(1, email);
							ps.setString(2, password);
							ResultSet rs = ps.executeQuery();
							if(rs.next()) {
								UserDasBoard ud = new UserDasBoard();
								ud.setVisible(true);
								ud.pack();
UserDasBoard.usermail.setText(email);
Login.this.dispose();
								setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							}else {
								JOptionPane.showMessageDialog(null,"Sai Mail hoac password!","Dang nhap that bai",JOptionPane.ERROR_MESSAGE);
								
							}
						} catch (SQLException e1) {
							Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,e1);
							e1.printStackTrace();
						}
					}else if(rdbtnNewRadioButton_1.isSelected()) {
						try {Connection con = MyConnection.getConnection();
						PreparedStatement ps;
						
							ps = con.prepareStatement("select*from supplier where semail =? and spassword=?  ");
							ps.setString(1, email);
							ps.setString(2, password);
							ResultSet rs = ps.executeQuery();
							if(rs.next()) {
								SupperlierDasboard sd = new SupperlierDasboard();
								sd.setVisible(true);
								sd.pack();
								Login.this.dispose();
								 SupperlierDasboard.suppliermail.setText(email);
								setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							}else {
								JOptionPane.showMessageDialog(null,"Sai Mail hoac password!","Dang nhap that bai",JOptionPane.ERROR_MESSAGE);
								
							}
						} catch (SQLException e1) {
							Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,e1);
							e1.printStackTrace();
						}
						
					}
					
					
					
					else if(rdbtnNewRadioButton_2.isSelected()) {
						try {Connection con = MyConnection.getConnection();
						PreparedStatement ps;
						
							ps = con.prepareStatement("select*from admin where email =? and password=?  ");
							ps.setString(1, email);
							ps.setString(2, password);
							ResultSet rs = ps.executeQuery();
							if(rs.next()) {
								AdminDasboard ad = new AdminDasboard();
								ad.setVisible(true);
								ad.pack();
								Login.this.dispose();
								 AdminDasboard.adminmail.setText(email);
								setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							}else {
								JOptionPane.showMessageDialog(null,"Sai Mail hoac password!","Dang nhap that bai",JOptionPane.ERROR_MESSAGE);
								
							}
						} catch (SQLException e1) {
							Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,e1);
							e1.printStackTrace();
						}
						
					}
					
				}
			}
		});
		button.setForeground(new Color(51, 51, 204));
		button.setBackground(new Color(204, 255, 204));
		button.setBounds(474, 369, 247, 36);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField.setBounds(431, 58, 324, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("USER NAME");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(431, 38, 77, 25);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(431, 135, 324, 36);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("EMAIL\r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(431, 115, 77, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(431, 195, 77, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("REPEAT PASSWORD");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(431, 275, 135, 25);
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		passwordField.setBounds(431, 214, 324, 36);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("LOGIN");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_4.setBounds(530, 11, 113, 36);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			private Component lblNewLabel_6_1;

			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setEchoChar((char)0);
				lblNewLabel_6.setVisible(false);
				lblNewLabel_6_1.setVisible(true);
			}
		});
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\hide.png"));
		lblNewLabel_6.setBounds(763, 220, 34, 25);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			private Component lblNewLabel_7_1;

			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField_1.setEchoChar((char)0);
				lblNewLabel_7.setVisible(false);
				lblNewLabel_7_1.setVisible(true);
			}
		});
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\hide.png"));
		lblNewLabel_7.setBounds(762, 302, 46, 25);
		contentPane.add(lblNewLabel_7);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		passwordField_1.setBounds(431, 297, 324, 36);
		contentPane.add(passwordField_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("User");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnNewRadioButton.setBackground(new Color(51, 153, 204));
		rdbtnNewRadioButton.setBounds(441, 340, 57, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Supplier");
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnNewRadioButton_1.setBackground(new Color(51, 153, 204));
		rdbtnNewRadioButton_1.setBounds(500, 340, 88, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Admin");
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnNewRadioButton_2.setBackground(new Color(51, 153, 204));
		rdbtnNewRadioButton_2.setBounds(590, 340, 71, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_8 = new JLabel("Forgot Password ?");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new ForgotPassword().setVisible(true);
				 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_8.setBounds(701, 411, 123, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Sign Up");
		lblNewLabel_8_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SignUp().setVisible(true);
				 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
			}
		});
		lblNewLabel_8_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_8_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_8_1.setBounds(405, 411, 77, 14);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Don't have account ?");
		lblNewLabel_8_1_1.setForeground(Color.WHITE);
		lblNewLabel_8_1_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_8_1_1.setBounds(530, 411, 123, 14);
		contentPane.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setEchoChar('•');
				lblNewLabel_6.setVisible(true);
				lblNewLabel_6_1.setVisible(false);
				
			}
		});
		lblNewLabel_6_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\visible.png"));
		lblNewLabel_6_1.setBounds(763, 220, 34, 25);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField_1.setEchoChar('•');
				lblNewLabel_7.setVisible(true);
				lblNewLabel_7_1.setVisible(false);
			}
		});
		lblNewLabel_7_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\visible.png"));
		lblNewLabel_7_1.setBounds(762, 302, 46, 25);
		contentPane.add(lblNewLabel_7_1);
		
		
		 lblNewLabel_4.addMouseListener(new MouseAdapter() {
		        private int mouseX, mouseY;

		        @Override
		        public void mousePressed(MouseEvent e) {
		            mouseX = e.getX();
		            mouseY = e.getY();
		        }

		        @Override
		        public void mouseDragged(MouseEvent e) {
		            int deltaX = e.getXOnScreen() - mouseX;
		            int deltaY = e.getYOnScreen() - mouseY;

		            setLocation(getLocation().x + deltaX, getLocation().y + deltaY);

		            mouseX = e.getXOnScreen();
		            mouseY = e.getYOnScreen();
		        }
		    });
		}
	}

