package com.clonetab.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.clonetab.rest.util.JDBCConnection;

public class BaseDAO {
	
	 public Connection getConnection() throws SQLException
	 {
		return JDBCConnection.getInstance().getConnection();
		 //return JDBCConnection.getInstance().getOracleJDBCConnection();
	 }
	 
	 public void closeResources(Connection connection,PreparedStatement pstmt,ResultSet rs) 
	 {
		try 
		{
			if (rs != null ) rs.close();
			if (pstmt != null ) pstmt.close();
			if (connection != null ) connection.close();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	 }

}
