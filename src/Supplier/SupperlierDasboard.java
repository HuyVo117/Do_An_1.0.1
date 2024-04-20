package Supplier;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Choice;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import User.Login;
import User.UserDasBoard;

import java.awt.Component;
import java.awt.List;
import javax.swing.JToolBar;
import java.awt.Scrollbar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.MouseMotionAdapter;

public class SupperlierDasboard extends JFrame {

	private static final long serialVersionUID = 1L;

	private static 	SupperlierDasboard instance;
	public static SupperlierDasboard getInstance1() {
        if (instance == null) {
            instance = new SupperlierDasboard();
        }
        return instance;
    }
	public static JLabel usermail= new JLabel();
	public static JLabel suppliermail= new JLabel();
	public static JLabel adminmail= new JLabel();
	private JPanel contentPane;
	private void init() {
		icon();
	}
	private void icon() {
		JLabel lblNewLabel_14=new JLabel();
		 lblNewLabel_14.setVisible(true);
		
			JLabel lblNewLabel_13=new JLabel();
			lblNewLabel_13.setVisible(false);
				JLabel lblNewLabel_14_1=new JLabel();
				 lblNewLabel_14_1.setVisible(true);
					JLabel lblNewLabel_13_1=new JLabel();
					 lblNewLabel_13_1.setVisible(false);
						JLabel lblNewLabel_14_2=new JLabel();
						 lblNewLabel_14_2.setVisible(true);
							JLabel lblNewLabel_13_2=new JLabel();
							 lblNewLabel_13_2.setVisible(false);
								
		 
		 
		 
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupperlierDasboard frame = SupperlierDasboard.getInstance1();
					frame.setVisible(true);
					frame.setTitle("AEON MALL SILVER WOLF");
					frame.setIconImage(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\Honkai_Star_Rail_logo.png") );
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected static SupperlierDasboard getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	protected void setIconImage(ImageIcon imageIcon) {
		// TODO Auto-generated method stub
		
	}
int xx,xy;
	/**
	 * Create the frame.
	 */
	public SupperlierDasboard() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				for(double i=0.1;i<=1.0;i+=0.1) {
					String s=""+i;
					float f=Float.parseFloat(s);
					try {
						Thread.sleep(40);
					}catch(InterruptedException ex) {
						Logger.getLogger(SupperlierDasboard.class.getName()).log(Level.SEVERE, null,ex);
					}
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1137, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		
		
		panel.setBounds(5, 5, 1111, 719);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 255, 255));
		panel_1.setBackground(new Color(24, 37, 55));
		panel_1.setBounds(0, 118, 229, 600);
		panel.add(panel_1);
		
		JLabel lblNewLabel_6 = new JLabel("Log Out");
		lblNewLabel_6.setBounds(93, 553, 100, 25);
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int result=	JOptionPane.showConfirmDialog((lblNewLabel_6),e.getSource(), "Bạn có muốn thoát không ?",JOptionPane.YES_NO_CANCEL_OPTION);
				if (result == 0) {
		           new Login().setVisible(true);
		           
				}
			}
		});
		panel_1.setLayout(null);
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\r\n");
		lblNewLabel_7.setBounds(15, 550, 46, 35);
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			int result=	JOptionPane.showConfirmDialog((lblNewLabel_7),e.getSource(), "Bạn có muốn thoát không ?",JOptionPane.YES_NO_CANCEL_OPTION);
			if (result == 0) {
	           new Login().setVisible(true);
	           
			}
		}
		});
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\Icon\\arrow-right-from-bracket-solid (1) (Custom).png"));
		panel_1.add(lblNewLabel_7);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 103, 229, 2);
		panel_1.add(separator);
		
		JLabel lblNewLabel_10 = new JLabel("DASHBOARD\r\n");
		lblNewLabel_10.setBounds(14, 46, 200, 30);
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_13 = new JLabel("Delivery\r\n");
		lblNewLabel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Delivery delivery = new Delivery();
				delivery.dispose();
				delivery.pack();
				delivery.setSize(1328, 490);
				delivery.setVisible(true);
			}
		});
		lblNewLabel_13.setBounds(70, 120, 150, 25);
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_13.setForeground(UIManager.getColor("Button.light"));
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Delivery delivery = new Delivery();
				delivery.dispose();
				delivery.pack();
				delivery.setSize(1328, 490);
				delivery.setVisible(true);
			}
		});
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\delivery_light.png"));
		lblNewLabel_14.setBounds(26, 115, 30, 35);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_13_1 = new JLabel("My Delivery");
		lblNewLabel_13_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Mydelivery mydelivery = new Mydelivery();
				mydelivery.dispose();
				mydelivery.pack();
				mydelivery.setSize(1328, 490);
				mydelivery.setVisible(true);
			}
		});
		lblNewLabel_13_1.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_13_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_13_1.setBounds(70, 170, 150, 25);
		panel_1.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_13_2 = new JLabel("My Account");
		lblNewLabel_13_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SupplierAccount supplierAccount = new SupplierAccount();
				supplierAccount.dispose();
				supplierAccount.pack();
				supplierAccount.setSize(728, 470);
				supplierAccount.setVisible(true);
			}
		});
		lblNewLabel_13_2.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_13_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_13_2.setBounds(70, 220, 133, 25);
		panel_1.add(lblNewLabel_13_2);
		
		JLabel lblNewLabel_14_1 = new JLabel("");
		lblNewLabel_14_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Mydelivery mydelivery = new Mydelivery();
				mydelivery.dispose();
				mydelivery.pack();
				mydelivery.setSize(1328, 490);
				mydelivery.setVisible(true);
			}
		});
		lblNewLabel_14_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\purchasedetails_light.png"));
		lblNewLabel_14_1.setBounds(26, 166, 30, 30);
		panel_1.add(lblNewLabel_14_1);
		
		JLabel lblNewLabel_14_2 = new JLabel("");
		lblNewLabel_14_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SupplierAccount supplierAccount = new SupplierAccount();
				supplierAccount.dispose();
				supplierAccount.pack();
				supplierAccount.setSize(728, 470);
				supplierAccount.setVisible(true);
			}
		});
		lblNewLabel_14_2.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\user.png"));
		lblNewLabel_14_2.setBounds(26, 215, 30, 30);
		panel_1.add(lblNewLabel_14_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseMotionListener(new MouseMotionAdapter() {
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
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx=e.getX();
				xy=e.getY();
			}
		});
		panel_2.setBackground(new Color(0, 255, 255));
		panel_2.setBounds(0, 0, 1100, 110);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("AEON MALL SILVER WOLF");
		lblNewLabel_1.setBounds(71, 11, 328, 43);
		lblNewLabel_1.setForeground(new Color(24, 37, 55));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 25));
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setBounds(0, 0, 63, 110);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\soi-bac-con-mua-tam-ta (Custom).jpg"));
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\bell-solid (Custom) (1).png"));
		lblNewLabel_3.setBounds(1060, 35, 46, 45);
		panel_2.add(lblNewLabel_3);
		
		JLabel suppliermail =new JLabel("Admin@gmail.com");
		suppliermail.setFont(new Font("Times New Roman", Font.BOLD, 14));
		suppliermail.setBounds(830, 50, 220, 14);
		panel_2.add(suppliermail);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\account_dark (Custom).png"));
		lblNewLabel_5.setBounds(800, 45, 30, 25);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\trolley (Custom).png"));
		lblNewLabel_8.setBounds(117, 47, 96, 63);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\Icon\\—Pngtree—pretty girl in shopping free_4487690 (Custom).png"));
		lblNewLabel_9.setBounds(177, 35, 81, 75);
		panel_2.add(lblNewLabel_9);
		
		JPanel panel_3 = new JPanel();
		panel_3.setToolTipText("ửgege");
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(239, 120, 860, 80);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tổng Quan");
		lblNewLabel.setBounds(10, 20, 126, 42);
		lblNewLabel.setForeground(new Color(24, 37, 55));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_12 = new JLabel("My Deliveries: 0");
		lblNewLabel_12.setForeground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_12.setBounds(140, 29, 180, 25);
		panel_3.add(lblNewLabel_12);
		panel_3.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, lblNewLabel_12}));
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBackground(new Color(255, 255, 255));
		scrollbar.setBounds(1105, 5, 10, 718);
		panel.add(scrollbar);
	}
}
