package com.atmecs.automations.helperpage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBReader {

	 
	 public void databaseReader() {
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
	    	String connectionUrl = "jdbc:sqlserver://ATMECSINDT-046\\SQLEXPRESS;database=AssessmentTwo;integratedSecurity=true;";  
	    	String userid ="ATMECS\David.Easterraj";
	    	String password="robinjebaraj1@";
	    	Connection con = DriverManager.getConnection(connectionUrl);  
	    	DriverManager.getConnection(connectionUrl, "userid", "password") ;
//	    	SQLServerDataSource ds = new SQLServerDataSource();  
//	    	ds.setUser("MyUserName");  
//	    	ds.setPassword("*****");  
//	    	ds.setServerName("localhost");  
//	    	ds.setPortNumber(1433);
//	    	ds.setDatabaseName("AdventureWorks");  
//	    	Connection con = ds.getConnection();  
	    	Statement stmt = con.createStatement();
	    	stmt.executeQuery(select *  from employee;);  
	
	 
	 
	          }
	   	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

