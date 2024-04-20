package dao;

import java.sql.Connection;

import connection.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
public class UserDao {
	Connection con = MyConnection.getConnection();
	PreparedStatement ps;
	Statement st;
	ResultSet rs;
	
	public int getMaxRow() {
		int row =0;
		try {
			st =con.createStatement();
			rs = st.executeQuery("select max(uid) from user");
			while(rs.next()) {
				row = rs.getInt(1);
			}
		} catch (SQLException e) {
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null,e);
			e.printStackTrace();
		}
		return row+1;
	}
	public boolean isEmailExist(String email) {
		try {
			ps = con.prepareStatement("select * from user where uemail=?");
			ps.setString(1, email);
			rs =ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE,null,e);
		}
	return false;
	}
	public boolean isPhoneExist(String phone) {
		try {
			ps = con.prepareStatement("select * from user where uphone=?");
			ps.setString(1, phone);
			rs =ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE,null,e);
		}
	return false;
	}
	public void insert(int id,String username,String email,String pass,String phone) {
		String sql ="insert into user values(?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, username);
			ps.setString(3, email);
			ps.setString(4, pass);
			ps.setString(5, phone);
			
			if(ps.executeUpdate()>0) {
				JOptionPane.showMessageDialog(null, "User add successfully !");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE,null,e);
		}
	}
	public void update(int id,String username,String email,String pass,String phone) {
		String sql ="update user set uname =? , uemail =?, upassword = ?,uphone=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2,email);
			ps.setString(3,pass);
			ps.setString(4,phone);
			
			ps.setInt(5,id);
			if(ps.executeUpdate()>0) {
				JOptionPane.showMessageDialog(null, "Password update thanh cong");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE,null,e);
		}
	}
	
	
	
	
	public String[] getUserValue(int id) {
		String[] value = new String[5];
		try {
			ps = con.prepareStatement("select * from user where uid=?");
			ps.setInt(1, id);
			rs =ps.executeQuery();
			if(rs.next()) {
				value[0]=rs.getString(1);
				value[1]=rs.getString(2);
				value[2]=rs.getString(3);
				value[3]=rs.getString(4);
				value[4]=rs.getString(5);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE,null,e);
		}
	return value;
	}
	public int getUserId(String email) {
		int id=0;
		try {
			ps = con.prepareStatement("select uid from user where uemail=?");
			ps.setString(1, email);
			rs =ps.executeQuery();
			if(rs.next()) {
				id = rs.getInt(1);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE,null,e);
		}
	return id;
	}
}
