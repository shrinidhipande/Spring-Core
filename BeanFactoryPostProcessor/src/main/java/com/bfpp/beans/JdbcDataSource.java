package com.bfpp.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDataSource {
	
	private String driverName;
	private String url;
	private String userName;
	private String password;
	
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "JdbcDataSource [driverName=" + driverName + ", url=" + url + ", userName=" + userName + ", password="
				+ password + "]";
	}
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driverName);
		Connection conn = DriverManager.getConnection(url,userName,password);
		return conn;
	}
	
}
