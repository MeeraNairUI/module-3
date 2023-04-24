package com.ust.ioc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements Connection {
	private String url;
	private String dbUserName;
	private String dbPassword;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
	 //System.out.println(url);
		this.url = url;
	}

	public String getDbUserName() {
		return dbUserName;
	}

	public void setDbUserName(String dbUserName) {
		System.out.println(dbUserName);
		this.dbUserName = dbUserName;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		System.out.println(dbPassword);
		this.dbPassword = dbPassword;
	}

	public DBConnection getConnection() {
		
		try {
			 System.out.println(url);
		
		       java.sql.Connection con=DriverManager.getConnection(url,dbUserName,dbPassword);
		       System.out.println("connected to mysql");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("getConnection called...");
    	  return new DBConnection();
      }

	@Override
	public String toString() {
		return "DBConnection [url=" + url + ", dbUserName=" + dbUserName + ", dbPassword=" + dbPassword + "]";
	}


}
//object oriented programming takes pull based approach
//class needs to look up or create instances on which it depends
//spring ioc is based on push approach.In other words objects required by a class are injected with the help of configuration file.