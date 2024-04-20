package User;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.ForgotPasswordDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Window;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class ForgotPassword extends JFrame {

	private static final long serialVersionUID = 1L;
	public static Object comboBox;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

 static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassword frame = new ForgotPassword();
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
 ForgotPasswordDao fg= new ForgotPasswordDao();
int xx,xy;
Color notEdit = new Color(204,204,204);
Color edit =new Color(255,255,255);
private Component btnNewButton;
private JPasswordField passwordField;
private void init() {
	textField_1.setBackground(notEdit);
	passwordField.setBackground(notEdit);
	textField_1.setEditable(false);
	passwordField.setEditable(false);
	btnNewButton.setEnabled(false);
	
	
}

	public ForgotPassword() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				for(double i=0.1;i<=1.0;i+=0.1) {
					String s=""+i;
					float f=Float.parseFloat(s);
					try {
						Thread.sleep(40);
					}catch(InterruptedException ex) {
						Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null,ex);
					}
				}
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 434);
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
		panel.setBounds(0, 0, 712, 418);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
				 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			if(emailValidation()) {
				if(fg.isEmailExist(textField.getText())) {
					textField.setBackground(notEdit);
					textField.setEditable(false);
					textField_1.setBackground(edit);
					textField_1.setEditable(false);
					passwordField.setBackground(edit);
					passwordField.setEditable(false);
					btnNewButton.setEnabled(true);
					
					
								}
			}
			}

			private boolean emailValidation() {
			
				return false;
			}

			
		});
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\search.png"));
		lblNewLabel_7.setBounds(255, 98, 46, 27);
		panel.add(lblNewLabel_7);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(15, 255, 230, 27);
		panel.add(passwordField);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnBack.setBounds(138, 318, 89, 23);
		panel.add(btnBack);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEmpty()) {
					String email=textField.getText();
					String ans =textField_1.getText();
					if(fg.getAns(email, ans)) {
						String pass = String.valueOf(passwordField.getPassword());
						fg.setPassword(email, pass);
						new Login().setVisible(true);
						
					}
			}
			}

			private boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(27, 318, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("New Password");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(15, 240, 100, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Answer");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(15, 190, 68, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Sercurity");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(15, 136, 68, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Email\r\n");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(15, 84, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Đổi Mật Khẩu");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(138, 11, 230, 47);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField.setBounds(15, 98, 230, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"550:2=?", "Ước mơ của bạn là gì ?", "0 độ Kevin là bao nhiêu độ C ?"}));
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBox.setBounds(15, 152, 230, 27);
		panel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_1.setBounds(15, 205, 230, 27);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			private Window lblNewLabel_6_1;

			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setEchoChar((char)0);
				lblNewLabel_6.setVisible(false);
				lblNewLabel_6_1.setVisible(true);
			}
		});
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\hide.png"));
		lblNewLabel_6.setBounds(252, 257, 34, 23);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\b55f09fae49def82191051861e6e2a47 (Custom).png"));
		lblNewLabel.setBounds(0, -13, 712, 420);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setEchoChar('•');
				lblNewLabel_6.setVisible(true);
				lblNewLabel_6_1.setVisible(false);
			}
			private  boolean isEmpty() {
				if(textField_1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(ForgotPassword.this, "Nhap vao cau tra loi ","Warning",2);
					return false;
				}
				if(String.valueOf(passwordField.getPassword()).isEmpty()) {
					JOptionPane.showMessageDialog(ForgotPassword.this,"Nhap vao mat khau moi","Warning",2 );
				}
				return true;
			}
			public boolean emailValidation() {
				if(textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(ForgotPassword.this,"Nhap vao email !","Warning",2 );
					return false;
				}if(!textField.getText().matches("^.+@.+\\..+&")) {
					JOptionPane.showMessageDialog(ForgotPassword.this,"Email khong hop le !","Warning",2 );
					return false;
				}
				return true;
			}
		});
		lblNewLabel_6_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\visible.png"));
		lblNewLabel_6_1.setBounds(252, 257, 34, 23);
		panel.add(lblNewLabel_6_1);
	}


	public void setComboBoxItems(String item) {
        ((JComboBox) comboBox).addItem(item);
    }
}
