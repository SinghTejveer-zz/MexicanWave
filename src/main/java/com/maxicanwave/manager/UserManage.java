package com.maxicanwave.manager;

import com.maxicanwave.modal.User;
import com.maxicanwave.utill.DBManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserManage {
	
	DBManager dbmanager = new DBManager();
	public int registerUser(User user)
	{
		int insert_id = 0; 
		String query = "INSERT INTO `tbl_user` (`id`, `name`, `phone`, `imei`, `username`, `password`) VALUES (?,?,?,?,?,?);";
		Connection conn = dbmanager.getConnection();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, "0");
			preparedStatement.setString(2, user.getName());
			preparedStatement.setString(3, user.getPhone());
			preparedStatement.setString(4, user.getImei());
			preparedStatement.setString(5, user.getUser());
			preparedStatement.setString(6, user.getPass());
			// execute insert SQL stetement
			insert_id =  preparedStatement.executeUpdate();
			preparedStatement.close();
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insert_id;
	}
	
	public int loginUser(User user)
	{
		Connection conn = dbmanager.getConnection();
		int count = -1;
		String query = "SELECT Count(*) FROM `tbl_user` WHERE username = ? AND password = ?";
		try
		{
			PreparedStatement preparedStatement =  conn.prepareStatement(query);
			preparedStatement.setString(1, user.getUser());
			preparedStatement.setString(2, user.getPass());
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next())
			{
				count = rs.getInt(1);
			}
			preparedStatement.close();
			conn.close();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return count;
	}

}
