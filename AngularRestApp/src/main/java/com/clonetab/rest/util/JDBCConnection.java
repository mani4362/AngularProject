package com.clonetab.rest.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCConnection 
{
	private JDBCConnection()
	{
		
	}
	
	private static JDBCConnection jdbcConnection ;
	private static Connection connection;
	private static Connection oracleConnection;
	
	public static JDBCConnection getInstance()
	{
		if(jdbcConnection == null)
		{
			jdbcConnection = new JDBCConnection();
		}
		return jdbcConnection;
	}
	
	public Connection getConnection() throws SQLException
	{
		if(connection == null)
		{
			try
			{
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				Class.forName("com.mysql.jdbc.Driver");
				//connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.40.125:XE","ctadmin","clontab");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clonetab","root","admin");
				System.out.println("Conection........."+connection);
			} catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		}
		return connection;
	}
	
	public Connection getOracleJDBCConnection() {
		
		if(oracleConnection == null)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//Class.forName("com.mysql.jdbc.Driver");
				oracleConnection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.40.125:XE","ctadminang","clontab");
				//connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clonetab","root","admin");
				System.out.println("Conection........."+oracleConnection);
			} catch (Exception e)
			{
				//e.printStackTrace();
				System.out.println("Unable to get Oracle Connection due to :"+e.getMessage());
			}
		}
		
		return oracleConnection;
	}
	public int getNextPwdWalletId(String sql) 
	 {
		 Connection connection   = null;
		 PreparedStatement pstmt = null;
		 ResultSet rs            = null;
		 int nextId              = 0;
		 try 
		 {
			connection = getConnection();
			pstmt      = connection.prepareStatement(sql) ;
			rs         = pstmt.executeQuery();
			
			while(rs.next() && rs != null) 
			{
				nextId = rs.getInt(1);
			}
			
			nextId = nextId+1;
			
		} catch (Exception e) 
		{
			System.out.println("Unable to get next max id :"+e.getMessage());
		}
		 return nextId;
	 } 
}
