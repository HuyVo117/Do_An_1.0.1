package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import User.Login;

import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
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

public class SeclectSupplier extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeclectSupplier frame = new SeclectSupplier();
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
	public SeclectSupplier() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				for(double i=0.1;i<=1.0;i+=0.1) {
					String s=""+i;
					float f=Float.parseFloat(s);
					try {
						Thread.sleep(40);
					}catch(InterruptedException ex) {
						Logger.getLogger(SeclectSupplier.class.getName()).log(Level.SEVERE, null,ex);
					}
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1330, 530);
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
		panel.setBounds(0, 0, 1313, 491);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 170, 1276, 310);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1275, 480);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setToolTipText("");
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Purchase ID", "User ID", "User Name", "User Phone","Product ID", "Product Name", "Quantity", "Price ", "Total", "Purchase Date", "Address", "Received Date", "Supplier Name", "Total"
			}
		));
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(980, 18, 302, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Search\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(920, 19, 52, 21);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Item 1"}));
		comboBox.setBounds(20, 37, 331, 22);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(22, 86, 128, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Select\r\n");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(195, 86, 128, 35);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Supplier");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(22, 11, 137, 27);
		panel.add(lblNewLabel_1);
	}
}
