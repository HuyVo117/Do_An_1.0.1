package User;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.UserDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserAccount extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserAccount frame = new UserAccount(args);
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
String[] value = new String[5];
UserDao user = new UserDao();
private int  uId;
	private void init() {
		uId =user.getUserId(UserDasBoard.usermail.getText());
	value =user.getUserValue(uId);
	 setValue();
	}
	private void setValue() {
		textField.setText(value[0]);
		textField_1.setText(value[1]);
		textField_2.setText(value[2]);
		passwordField.setText(value[3]);
		textField_3.setText(value[4]);
		
		
	}
	public boolean isEmpty() {
		if(textField.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "ID User nay la bat buoc !","Warning",2);
			return false;
		}
		if(textField_1.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this,"UserName nay la bat buoc !","Warning",2 );
			return false;
		}
		if(textField_2.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this,"Email nay la bat buoc !","Warning",2 );
			return false;
		}if (!textField_2.getText().matches("^.+@.+\\..+$")) {
		    JOptionPane.showMessageDialog(this, "Email không hợp lệ !", "Warning", JOptionPane.WARNING_MESSAGE);
		    return false;
		}
		if(String.valueOf(passwordField.getPassword()).isEmpty()) {
			JOptionPane.showMessageDialog(this,"Password nay la bat buoc !","Warning",2 );
			return false;
		}
		if(textField_3.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Phone Number nay la bat buoc","Warning",2);
			return false;
		}
		if(textField_3.getText().length()>15) {
			JOptionPane.showMessageDialog(this, "Phone Number qua dai","Warning",2);
			return false;
		}
		if(textField_3.getText().length()<1) {
			JOptionPane.showMessageDialog(this, "Phone Number qua ngan","Warning",2);
			return false;
		}
		
		
		
		
		return true;
	}
	
	
	
	public UserAccount(String[] userData) {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				for(double i=0.1;i<=1.0;i+=0.1) {
					String s=""+i;
					float f=Float.parseFloat(s);
					try {
						Thread.sleep(40);
					}catch(InterruptedException ex) {
						Logger.getLogger(UserAccount.class.getName()).log(Level.SEVERE, null,ex);
					}
				}
			}
		});
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 412);
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
		panel.setBounds(0, 0, 721, 433);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(419, 80, 230, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(419, 131, 230, 27);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(419, 187, 230, 27);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(419, 241, 230, 27);
		panel.add(passwordField);
		
		textField_3 = new JTextField();
		textField_3.setBounds(419, 290, 230, 27);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\kinh-nghiem-mo-shop-quan-ao (Custom) (1).png"));
		lblNewLabel.setBounds(33, 51, 384, 310);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("AEON SILVER WOLF");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(33, 11, 374, 29);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("ID User");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(420, 63, 59, 14);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("UserName");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(419, 114, 77, 14);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(420, 171, 59, 14);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Password\r\n");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(419, 225, 59, 14);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Phone");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(419, 275, 59, 14);
		panel.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEmpty()) {
					if(!check()) {
						int id =Integer.parseInt(textField.getText());
						String username = textField_1.getText();
						String email =textField_2.getText();
						String password =String.valueOf(passwordField.getPassword());
						String phone = textField_3.getText();
						user.update(id, username, email, password, phone);
						UserAccount.this.dispose();
					}
				}
				
				
			}private boolean check() {
				String newEmail = textField_2.getText();
				String newPhone = textField_3.getText();
				if(newEmail.equals(value[2])&&newPhone.equals(value[4])) {
					return false;
				}else {
					if(!newEmail.equals(value[2])) {
						boolean x = user.isEmailExist(newEmail);
						if(x) {
							JOptionPane.showMessageDialog(UserAccount.this, "Email nay da ton tai","Warning",2);
						}
						return x;
					}
					if(!newPhone.equals(value[4])) {
						boolean x = user.isPhoneExist(newPhone);
						if(x) {
							JOptionPane.showMessageDialog(UserAccount.this, " So dien thoai nay da ton tai","Warning",2);
						}
						return x;
					}
				}
				return false;
			}
			
		});
		btnNewButton.setBackground(new Color(0, 102, 204));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(379, 338, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setBackground(new Color(0, 102, 204));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(584, 338, 89, 23);
		panel.add(btnNewButton_1);
		init();
	}
}
