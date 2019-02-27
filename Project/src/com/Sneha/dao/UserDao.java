package com.Sneha.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Sneha.ConnectionSupport.DataBaseConnection;
public class UserDao {
	public int insert(String username,String email,String password ,String repeatpassword)  throws SQLException 
	{
		    String query =   "insert into reg values (?,?,?,?)";
		    Connection con = DataBaseConnection.getConnection();
			  PreparedStatement pst =   con.prepareStatement(query);
			  pst.setString(1,username);
			  pst.setString(2, email);
			  pst.setString(3, password);
			  pst.setString(4, repeatpassword);
			 int output= pst.executeUpdate();
			 return output;
		   
	}
}
