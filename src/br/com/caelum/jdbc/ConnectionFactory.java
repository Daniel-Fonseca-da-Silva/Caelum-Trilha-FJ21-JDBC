package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection() {
		try 
		{
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "88484803Da");
		} 
		catch (SQLException e) 
		{
			throw new RuntimeException(e);
		}
	}

}
