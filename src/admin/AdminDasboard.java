package admin;

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

import Supplier.SupperlierDasboard;
import User.Login;

import java.awt.Component;
import java.awt.List;
import javax.swing.JToolBar;
import java.awt.Scrollbar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JSeparator;
import javax.swing.UIManager;
import java.awt.event.MouseMotionAdapter;

public class AdminDasboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private static AdminDasboard instance;
	public static AdminDasboard getInstance2() {
        if (instance == null) {
            instance = new AdminDasboard();
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
								JLabel lblNewLabel_14_3=new JLabel();
								 lblNewLabel_14_3.setVisible(true);
									JLabel lblNewLabel_13_3=new JLabel();
									 lblNewLabel_13_3.setVisible(false);
										JLabel lblNewLabel_14_4=new JLabel();
										 lblNewLabel_14_4.setVisible(true);
											JLabel lblNewLabel_13_4=new JLabel();
											 lblNewLabel_13_4.setVisible(false);
												JLabel lblNewLabel_14_5=new JLabel();
												 lblNewLabel_14_5.setVisible(true);
													JLabel lblNewLabel_13_5=new JLabel();
													 lblNewLabel_13_5.setVisible(false);
														JLabel lblNewLabel_14_6=new JLabel();
														 lblNewLabel_14_6.setVisible(true);
														 JLabel lblNewLabel_13_6=new JLabel();
														 lblNewLabel_13_6.setVisible(false);
		 
		 
		 
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDasboard frame = new AdminDasboard();
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

	protected void setIconImage(ImageIcon imageIcon) {
		// TODO Auto-generated method stub
		
	}
int xx,xy;
	
	/**
	 * Create the frame.
	 */
	public AdminDasboard() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				for(double i=0.1;i<=1.0;i+=0.1) {
					String s=""+i;
					float f=Float.parseFloat(s);
					try {
						Thread.sleep(40);
					}catch(InterruptedException ex) {
						Logger.getLogger(AdminDasboard.class.getName()).log(Level.SEVERE, null,ex);
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
		
		JLabel lblNewLabel_13 = new JLabel("Manage Categories\r\n");
		lblNewLabel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManagerCategory managerCategory=new ManagerCategory();
				managerCategory.dispose();
				managerCategory.setVisible(true);
				managerCategory.pack();
				managerCategory.setSize(830, 412);
				
			
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
				ManagerCategory managerCategory=new ManagerCategory();
				managerCategory.setVisible(true);
				managerCategory.pack();
				managerCategory.setSize(830, 412);
				 managerCategory.setDefaultCloseOperation(ManagerCategory.EXIT_ON_CLOSE);
				
			}
		});
		lblNewLabel_14.setBounds(26, 115, 30, 35);
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\category_light (Custom).png"));
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_13_1 = new JLabel("Manage Products");
		lblNewLabel_13_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManagerProduct managerProduct = new ManagerProduct();
				managerProduct.pack();
				managerProduct.setSize(800, 530);
				managerProduct.setVisible(true);
			}
		});
		lblNewLabel_13_1.setBounds(70, 170, 150, 25);
		lblNewLabel_13_1.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_13_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel_1.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_13_2 = new JLabel("Manage User\r\n");
		lblNewLabel_13_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManagerUser managerUser = new ManagerUser();
				managerUser.pack();
				managerUser.setSize(1140, 430);
				managerUser.setVisible(true);
			}
		});
		lblNewLabel_13_2.setBounds(70, 220, 133, 25);
		lblNewLabel_13_2.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_13_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel_1.add(lblNewLabel_13_2);
		
		JLabel lblNewLabel_13_3 = new JLabel("Manage Supplier");
		lblNewLabel_13_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManagerSupplier managerSupplier = new ManagerSupplier();
				managerSupplier.pack();
				managerSupplier.setSize(1140, 430);
				managerSupplier.setVisible(true);
			}
		});
		lblNewLabel_13_3.setBounds(70, 270, 133, 25);
		lblNewLabel_13_3.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_13_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel_1.add(lblNewLabel_13_3);
		
		JLabel lblNewLabel_13_4 = new JLabel("Add Supplier");
		lblNewLabel_13_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddSupplier addSupplier = new AddSupplier();
				addSupplier.pack();
				addSupplier.setSize(422, 610);
				addSupplier.setVisible(true);
			}
		});
		lblNewLabel_13_4.setBounds(70, 320, 133, 25);
		lblNewLabel_13_4.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_13_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel_1.add(lblNewLabel_13_4);
		
		JLabel lblNewLabel_13_5 = new JLabel("Select Supplier");
		lblNewLabel_13_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SeclectSupplier selectSupplier = new SeclectSupplier();
				selectSupplier.pack();
				selectSupplier.setSize(1310,530);
				selectSupplier.setVisible(true);
			}
		});
		lblNewLabel_13_5.setBounds(70, 370, 133, 25);
		lblNewLabel_13_5.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_13_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel_1.add(lblNewLabel_13_5);
		
		JLabel lblNewLabel_13_6 = new JLabel("Transaction");
		lblNewLabel_13_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Transaction transaction = new Transaction();
				transaction.pack();
				transaction.setSize(1110,490);
				transaction.setVisible(true);
			}
		});
		lblNewLabel_13_6.setBounds(70, 420, 133, 25);
		lblNewLabel_13_6.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_13_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel_1.add(lblNewLabel_13_6);
		
		JLabel lblNewLabel_14_1 = new JLabel("");
		lblNewLabel_14_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManagerProduct managerProduct = new ManagerProduct();
				managerProduct.pack();
				managerProduct.setSize(800, 530);
				managerProduct.setVisible(true);
			}
		});
		lblNewLabel_14_1.setBounds(26, 166, 30, 30);
		lblNewLabel_14_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\product_light.png"));
		panel_1.add(lblNewLabel_14_1);
		
		JLabel lblNewLabel_14_2 = new JLabel("");
		lblNewLabel_14_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManagerUser managerUser = new ManagerUser();
				managerUser.pack();
				managerUser.setSize(1140, 430);
				managerUser.setVisible(true);
			}
		});
		lblNewLabel_14_2.setBounds(26, 215, 30, 30);
		lblNewLabel_14_2.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\edit_user.png"));
		panel_1.add(lblNewLabel_14_2);
		
		JLabel lblNewLabel_14_3 = new JLabel("");
		lblNewLabel_14_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManagerSupplier managerSupplier = new ManagerSupplier();
				managerSupplier.pack();
				managerSupplier.setSize(1140, 430);
				managerSupplier.setVisible(true);
			}
		});
		lblNewLabel_14_3.setBounds(26, 265, 30, 30);
		lblNewLabel_14_3.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\edit_supplier_light.png"));
		panel_1.add(lblNewLabel_14_3);
		
		JLabel lblNewLabel_14_4 = new JLabel("");
		lblNewLabel_14_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddSupplier addSupplier = new AddSupplier();
				addSupplier.pack();
				addSupplier.setSize(422, 610);
				addSupplier.setVisible(true);
			}
		});
		lblNewLabel_14_4.setBounds(26, 315, 30, 30);
		lblNewLabel_14_4.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\supplier_light.png"));
		panel_1.add(lblNewLabel_14_4);
		
		JLabel lblNewLabel_14_5 = new JLabel("");
		lblNewLabel_14_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SeclectSupplier selectSupplier = new SeclectSupplier();
				selectSupplier.pack();
				selectSupplier.setSize(1310,530);
				selectSupplier.setVisible(true);
			}
		});
		lblNewLabel_14_5.setBounds(26, 365, 30, 30);
		lblNewLabel_14_5.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\supplier_light.png"));
		panel_1.add(lblNewLabel_14_5);
		
		JLabel lblNewLabel_14_6 = new JLabel("");
		lblNewLabel_14_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Transaction transaction = new Transaction();
				transaction.pack();
				transaction.setSize(1110,490);
				transaction.setVisible(true);
			}
		});
		lblNewLabel_14_6.setBounds(26, 420, 30, 30);
		lblNewLabel_14_6.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\ảnh\\icons_mysqlConnector\\icons_mysqlConnector\\icons\\transaction_light.png"));
		panel_1.add(lblNewLabel_14_6);
		
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
		
		JLabel adminmail =new JLabel("Admin@gmail.com");
		adminmail.setFont(new Font("Times New Roman", Font.BOLD, 14));
		adminmail.setBounds(830, 50, 220, 14);
		panel_2.add(adminmail);
		
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
		lblNewLabel.setBounds(10, 20, 164, 42);
		lblNewLabel.setForeground(new Color(24, 37, 55));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_12 = new JLabel("Total Catogories: 0");
		lblNewLabel_12.setForeground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_12.setBounds(140, 9, 180, 25);
		panel_3.add(lblNewLabel_12);
		
		JLabel lblNewLabel_12_1 = new JLabel("Total Products: 0");
		lblNewLabel_12_1.setForeground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel_12_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_12_1.setBounds(140, 44, 180, 25);
		panel_3.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_12_2 = new JLabel("Total Users: 0");
		lblNewLabel_12_2.setForeground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel_12_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_12_2.setBounds(350, 9, 180, 25);
		panel_3.add(lblNewLabel_12_2);
		
		JLabel lblNewLabel_12_3 = new JLabel("Total Supplier: 0");
		lblNewLabel_12_3.setForeground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel_12_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_12_3.setBounds(350, 44, 180, 25);
		panel_3.add(lblNewLabel_12_3);
		
		JLabel lblNewLabel_12_3_1 = new JLabel("Total Sales: 0");
		lblNewLabel_12_3_1.setForeground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel_12_3_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_12_3_1.setBounds(560, 9, 180, 25);
		panel_3.add(lblNewLabel_12_3_1);
		
		JLabel lblNewLabel_12_3_2 = new JLabel("Total Catogories: 0");
		lblNewLabel_12_3_2.setForeground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel_12_3_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_12_3_2.setBounds(560, 44, 180, 25);
		panel_3.add(lblNewLabel_12_3_2);
		panel_3.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, lblNewLabel_12, lblNewLabel_12_1, lblNewLabel_12_2, lblNewLabel_12_3, lblNewLabel_12_3_1, lblNewLabel_12_3_2}));
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBackground(new Color(255, 255, 255));
		scrollbar.setBounds(1105, 5, 10, 718);
		panel.add(scrollbar);
	}
}
