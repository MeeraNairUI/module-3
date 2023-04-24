package com.ust.ioc;

public class Login {
	
	private String userName;
    private String password;
    DBConnection db;
    
    public DBConnection getDb() {
    	return db;
    }
    public void setDb(DBConnection db ) {
    	this.db=db;
    }
    public String getuserName() {
   	 return userName;
    }
   public void setUserName(String userName) {
   	this.userName=userName;
   }
   public String getPassword() {
   	return password;
   }
   public void setPassword(String password) {
   	this.password=password;
   }
   public String validate() {
	   
	   // db = new DBConnection();
	   	 Connection con= db.getConnection();
	   	 return "login validate.....";
	    }
    }
