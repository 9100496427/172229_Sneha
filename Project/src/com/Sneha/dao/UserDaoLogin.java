package com.Sneha.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class UserDaoLogin {
	static boolean status=false; 
	public static boolean validate(String username,String Password){ 
		
		System.out.println(username+"---"+Password);
	    String check=null;
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orcl11g");  
		      
		PreparedStatement ps=con.prepareStatement("select * from reg where username=? and Password=?");  
		ps.setString(1,username);  
		ps.setString(2,Password);  
	      
		ResultSet rs=ps.executeQuery(); 
		while(rs.next()) {
			check=rs.getString("username");
		}
			
	
		          
		}catch(Exception e){System.out.println(e);}
		
		
		if(check!=null)
			return true;
		else
			return false;
		
		}  
		}  






