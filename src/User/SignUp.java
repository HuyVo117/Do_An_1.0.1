package User;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import dao.UserDao;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SignUp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_3;
	private JTextField textField_4;

	private JComboBox comboBox;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame= new SignUp();
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
	UserDao user = new UserDao();
int xx,xy;
Color notEdit = new Color(204,204,204);




private void init() {
	textField.setBackground(notEdit);
	textField.setText(String.valueOf(user.getMaxRow()));
	
}
public boolean isEmpty() {
	if(textField.getText().isEmpty()) {
		JOptionPane.showMessageDialog(this, "Username nay la bat buoc !","Warning",2);
		return false;
	}
	if(textField_1.getText().isEmpty()) {
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
	if(textField_3.getText().length()<10) {
		JOptionPane.showMessageDialog(this, "Phone Number qua ngan","Warning",2);
		return false;
	}
	
	if(comboBox.getSelectedIndex()==-1) {
		JOptionPane.showMessageDialog(this, "Question la bat buoc","Warning",2);
		return false;
	}
	if(textField_4.getText().length()<0) {
		JOptionPane.showMessageDialog(this, "Answer la bat buoc","Warning",2);
		return false;
	}
	
	
	return true;
}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				for(double i=0.1;i<=1.0;i+=0.1) {
					String s=""+i;
					float f=Float.parseFloat(s);
					try {
						Thread.sleep(40);
					}catch(InterruptedException ex) {
						Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null,ex);
					}
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 610);
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
		panel.setBounds(0, 0, 439, 571);
		panel.setBackground(new Color(0, 102, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField.setBounds(65, 106, 295, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sign Up\r\n");
		lblNewLabel.setForeground(new Color(153, 255, 204));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(158, 46, 122, 35);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 439, 610);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		passwordField.setBounds(65, 298, 295, 27);
		panel_1.add(passwordField);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			    char input = e.getKeyChar();
			    if (!(input < '0' || input > '9') && input != '\b') {
			        e.consume();
			        JOptionPane.showMessageDialog(SignUp.this, "Username khong thuoc bat ky so nao !", "Warning", 2);
			    }
			}
		});
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_1.setBounds(65, 170, 295, 27);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_2.setBounds(65, 234, 295, 27);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(Character.isDigit(e.getKeyChar())) {
					
					
				}
			}
		});
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_3.setBounds(65, 362, 295, 27);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		 comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"550:2=?", "Ước mơ của bạn là gì ?", "0 độ Kevin là bao nhiêu độ C ?"}));
		comboBox.setBounds(65, 426, 295, 27);
		panel_1.add(comboBox);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_4.setBounds(65, 490, 295, 27);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("User ID");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(65, 87, 50, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("User Name");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(65, 150, 70, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(65, 212, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Password");
		lblNewLabel_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(65, 275, 60, 14);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Phone");
		lblNewLabel_4_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4_2.setBounds(65, 339, 46, 14);
		panel_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Sercurity");
		lblNewLabel_4_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4_3.setBounds(65, 405, 60, 14);
		panel_1.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Answer");
		lblNewLabel_4_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4_4.setBounds(65, 470, 50, 14);
		panel_1.add(lblNewLabel_4_4);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEmpty()) {
					int id =Integer.parseInt(textField.getText());
					String username = textField_1.getText();
					String email =textField_2.getText();
					String password =String.valueOf(passwordField.getPassword());
					String phone = textField_3.getText();
					String seq = comboBox.getSelectedItem().toString();
					if(!user.isEmailExist(email)) {
						if(!user.isPhoneExist(phone)) {
							user.insert(id, username, email, password, phone);
							 String[] value = new String[5];
							value[0]=textField.getText();
							value[1]=textField_1.getText();
							value[2]=textField_2.getText();
							value[3]=password;
							value[4]=textField_3.getText();
							
			                    UserAccount userAccount = new UserAccount(value);
			                   
			                    SignUp.this.dispose();
							
							new Login().setVisible(true);
							 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							
						}else {
							JOptionPane.showMessageDialog(SignUp.this, "Phone Number nay da ton tai","Warning",2);	
						}
					}else {
						JOptionPane.showMessageDialog(SignUp.this, "Email nay da ton tai","Warning",2);
					}
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 102, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnNewButton.setBounds(50, 541, 120, 27);
		panel_1.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK\r\n");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
				 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnBack.setBackground(new Color(255, 102, 0));
		btnBack.setBounds(210, 541, 120, 27);
		panel_1.add(btnBack);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.addMouseListener(new MouseAdapter() {
			private Window lblNewLabel_5_1_1;

			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setEchoChar((char)0);
				lblNewLabel_5_1.setVisible(false);
				lblNewLabel_5_1_1.setVisible(true);
			}
		});
		lblNewLabel_5_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\hide.png"));
		lblNewLabel_5_1.setBackground(Color.BLACK);
		lblNewLabel_5_1.setBounds(30, 296, 45, 30);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 439, 610);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\pexels-tembela-bohle-1884579 (Custom) (1).jpg"));
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setEchoChar('•');
				lblNewLabel_5_1.setVisible(true);
				lblNewLabel_5_1_1.setVisible(false);
			}
		});
		lblNewLabel_5_1_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\visible.png"));
		lblNewLabel_5_1_1.setBackground(Color.BLACK);
		lblNewLabel_5_1_1.setBounds(30, 296, 45, 30);
		panel_1.add(lblNewLabel_5_1_1);
	}
}
