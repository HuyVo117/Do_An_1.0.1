package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import User.ForgotPassword;
import connection.MyConnection;

public class ForgotPasswordDao {
	Connection con = MyConnection.getConnection();
	PreparedStatement ps;
	Statement st;
	ResultSet rs;
	
	public boolean isEmailExist(String email) {
		try {
			ps=con.prepareStatement("select* from user where uemail =?");
			ps.setString(1, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				ForgotPasswordDao.setComboBoxItems(rs.getString(6));
				return true;
			}else {
				JOptionPane.showMessageDialog(null," Email khong ton tai");
			}
		}catch(SQLException ex) {
			Logger.getLogger(ForgotPasswordDao.class.getName()).log(Level.SEVERE, null,ex);
		}
		return false;
	}
	public boolean getAns(String email,String newAns) {
		try {
			ps=con.prepareStatement("select* from user where uemail =?");
			ps.setString(1, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				String oldAns = rs.getString(7);
				if(newAns.equals(oldAns)) {
					return true;
				}else {
					JOptionPane.showMessageDialog(null, "Cau tra loi khong dung");
					return false;
				}
				
			
			}
		}catch(SQLException ex) {
			Logger.getLogger(ForgotPasswordDao.class.getName()).log(Level.SEVERE, null,ex);
		}
		return false;
	}

	private static void setComboBoxItems(String string) {
		
		
	}
	public void setPassword(String email,String pass) {
		String sql ="update user set upassword =? where uemail =?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, pass);
			ps.setString(2,email);
			if(ps.executeUpdate()>0) {
				JOptionPane.showMessageDialog(null, "Password update thanh cong");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
